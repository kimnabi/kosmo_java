package a.b.c.com.kosmem.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public abstract class KosConnectivity {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	//public static final String JDBC_ORACLE_DRIVER = "com.mysql.cj.jdbc.Driver";
	public static final String JDBC_ORACLE_DRIVER = "net.sf.log4jdbc.sql.jdbcapi.DriverSpy";
	public static final String JDBC_ORACL_URL = "jdbc:log4jdbc:oracle:thin:@localhost:1522:orcl";
	//public static final String JDBC_ORACL_URL = "jdbc:log4jdbc:mysql://localhost:3306/test";
	//public static final String JDBC_ORACL_URL = "jdbc:mysql://localhost:3306/test";
	public static final String JDBC_ORACLE_USER = "scott";//scott
	public static final String JDBC_ORACLE_PWD = "tiger";//tiger
	//
	
    public static Connection getConnection() throws SQLException   {
		
    	Connection conn = null; //db 연결 객체
			// JDBC 드라이버를 생성자를 이용해서 찾는 방법
			// static 상수값에 접근 하여 오라클 드라이버 정보를 읽어와서
			// 리플렉션의 기술를 통해 oracle.jdbc.driver.OracleDriver 패키지에 있는 OracleDriver 클래스를 찾아서
			// 로딩한다
			try {
				Class.forName(JDBC_ORACLE_DRIVER);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			conn = DriverManager.getConnection(JDBC_ORACL_URL, JDBC_ORACLE_USER,
					JDBC_ORACLE_PWD);
			
			return conn;
	}
public static void conClose(Connection con, PreparedStatement pstmt)   {
    	
    	if (con != null) {
    		try {
    			//con.setAutoCommit(false); //입력 테스트 위해
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} //end try ~ catch
    	} //end if
    	if(pstmt != null) {
    		try {
				pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} //end try ~ catch
    	}
    } // end conclose

  public static void conClose(Connection con, PreparedStatement pstmt, ResultSet rs ){
    	
	    if (rs != null) {
    		try {
	    	rs.close();
    		} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} //end try ~ catch
    		
    	}
    	if (con != null) {
    		try {
    			//con.setAutoCommit(false); //입력 테스트 위해
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} //end try ~ catch
    	} //end if
    	if(pstmt != null) {
    		try {
				pstmt.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} //end try ~ catch
    	}
    } // end conclose
    
    	
    	
    	
 } //end of KosConnectivity