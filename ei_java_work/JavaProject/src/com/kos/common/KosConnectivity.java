package com.kos.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public abstract class KosConnectivity {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	//public static final String JDBC_ORACLE_DRIVER = "oracle.jdbc.driver.OracleDriver";
	public static final String JDBC_ORACLE_DRIVER = "net.sf.log4jdbc.sql.jdbcapi.DriverShy";
	public static final String JDBC_ORACL_URL = "jdbc:log4jdbc:oracle:thin:@localhost:1522:orcl";
	//public static final String JDBC_ORACL_URL = "jdbc:oracle:thin:@localhost:1522:orcl";
	public static final String JDBC_ORACLE_USER = "scott";
	public static final String JDBC_ORACLE_PWD = "tiger";
	//
	
    public static Connection getConnection()   {
		
    	Connection conn = null; //db ���� ��ü
			// JDBC ����̹��� �����ڸ� �̿��ؼ� ã�� ���
			// static ������� ���� �Ͽ� ����Ŭ ����̹� ������ �о�ͼ�
			// ���÷����� ����� ���� oracle.jdbc.driver.OracleDriver ��Ű���� �ִ� OracleDriver Ŭ������ ã�Ƽ�
			// �ε��Ѵ�
			try {
				Class.forName(JDBC_ORACLE_DRIVER);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			try {
				conn = DriverManager.getConnection(JDBC_ORACL_URL, JDBC_ORACLE_USER,
						JDBC_ORACLE_PWD);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return conn;
	}
public static void conClose(Connection con, PreparedStatement pstmt)   {
    	
    	if (con != null) {
    		try {
    			//con.setAutoCommit(false); //�Է� �׽�Ʈ ����
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
    			//con.setAutoCommit(false); //�Է� �׽�Ʈ ����
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

