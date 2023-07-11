package db;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.DriverManager;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;




public class SpyMySqlTest {

	private Logger logger = LoggerFactory.getLogger(this.getClass());
	// 상수 
	// 데이터 베이스를 연결하는 정보를 우리는 dataSource 라고 부른다.
	// dataSource 정보를 상수로 처리하는 것
	// 멤버필드  상수 값으로 설정 : main 프로그램 실행하기전에 메모리에 올라간다
	//public static final String JDBC_ORACLE_DRIVER = "oracle.jdbc.driver.OracleDriver";
	//public static final String JDBC_ORACL_URL = "jdbc:oracle:thin:@localhost:1522:orcl";
	//public static final String JDBC_ORACLE_DRIVER = "com.mysql.jdbc.Driver";
	public static final String JDBC_ORACLE_DRIVER = "net.sf.log4jdbc.sql.jdbcapi.DriverSpy";
	public static final String JDBC_ORACL_URL = "jdbc:log4jdbc:oracle:thin:@localhost:1522:orcl";
//	public static final String JDBC_ORACL_URL = "jdbc:log4jdbc:mysql://localhost:3306/test?useSSL=false&characterEncoding=utf8&serverTimeZone=UTC";
	//public static final String JDBC_ORACL_URL = "jdbc:log4jdbc:mysql://localhost:3306/test";
	//public static final String JDBC_ORACL_URL = "jdbc:mysql://localhost:3306/test";
	//public static final String JDBC_ORACLE_DRIVER = "net.sf.log4jdbc.sql.jdbcapi.DriverShy";
	//jdbc:mysql://localhost:3306/test?characterEncoding=utf8&serverTimeZone=UTC
	//public static final String JDBC_ORACL_URL = "jdbc:log4jdbc:mysql://localhost:3306/test";
	
	public static final String JDBC_ORACLE_USER = "scott";
	public static final String JDBC_ORACLE_PWD = "tiger";
	private Connection conn = null; 
  //  private MysqlConnect mysqlConnect =null;
	// 생성자 
	public SpyMySqlTest () {
		
		try {
			Class.forName(SpyMySqlTest.JDBC_ORACLE_DRIVER);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
	}
	
	// 조회 함수 :Db를 tcp/ip 프로토콜 하여   데이베이스에 조회하기 위해 쿼리문 
	// 문자열형태로 담아 데이타베이스서버에 요청 해서 결과를 응답받아 콘솔에 출력한다
	public void t1_Select () {
		logger.debug("{} 함수가 시작되었습니다","ti_Select");
		Connection con = null;
		ResultSet rs = null;
		PreparedStatement pstmt = null; 
		ResultSet rsRs = null;
	
		// JDBC 드라이버를 생성자를 이용해서 찾는 방법
		// static 상수값에 접근 하여 오라클 드라이버 정보를 읽어와서
		// 리플렉션의 기술를 통해 oracle.jdbc.driver.OracleDriver 패키지에 있는 OracleDriver 클래스를 찾아서 로딩한다

//	Driver driver = new Driver();
//	DriverManager.registerDriver(driver);
		//conn = DriverManager.getConnection(	SpyMySqlTest.JDBC_ORACL_URL, 
		//		SpyMySqlTest.JDBC_ORACLE_USER, 
		//		SpyMySqlTest.JDBC_ORACLE_PWD);
//PreparedStatement statement = mysqlConnect.connect().prepareStatement(sql);
		//Context context = (Context) new InitialContext();
		//DataSource dataSource = (DataSource) context.lookup("jdbc/defaultCICSDataSource");
		 //mysqlConnect = new MysqlConnect();
		//Connection connection = dataSource.getConnection();
		//Connection conn = DriverManager.getConnection(url, user, password);
		// ... 
		// and when you don't need anything else from the driver
//	DriverManager.deregisterDriver(driver);
		//logger.debug("conn {}",mysqlConnect);
		
		try {
			//싱글톤 형태로 드라이버 객체를 생성하여 Connection 클래스 타입의 conn 변수에 할당한다
			//1.DB 서버로  클라이언트측의 유저정보,비밀번호 포함하여 전송하여 연결하게 된다 
			
			// 문자열를  String 타입의 임시 저장소 에 문자열을 담기위해 StringBuffer 인스턴스 생성한다
			StringBuffer sb = new StringBuffer(); // vs String () 불변객체이므로  추가할수록 새롭게 메모리할당이 크기때문에 
			// StringBuffer 객체를 쓴다
			// sb가 가르키는 StringBuffer() 클래스에 append 함수를 호출하여  문자열를  추가한다
			sb.append( "SELECT * FROM img_t" );
		
				conn = DriverManager.getConnection(	SpyMySqlTest.JDBC_ORACL_URL, 
						SpyMySqlTest.JDBC_ORACLE_USER, 
						SpyMySqlTest.JDBC_ORACLE_PWD);
	
			pstmt = conn.prepareStatement(sb.toString());
			// DB 서버에 쿼리문에 응답받아쿼리의결과를  ResultSet 객체 반환받아서 
			// ResultSet 타입의 reRs 참조변수에 초기화한다
			rsRs = pstmt.executeQuery();
			//System.out.println("T1_Table 조회시  에러 >>> : " + rsRs);
			// reRs 참조변수가 null이 아닐때 if절이 실행한다
			if (rsRs !=null) {
				//true if the new current row is valid; false if there are no more rows
				
				while (rsRs.next()) {
					//the column value; if the value is SQL NULL, the value returned is null
					String col_1 = rsRs.getString(1);
					String col_2 = rsRs.getString(2);
					String col_3 = rsRs.getString(3);
					String col_4 = rsRs.getString(4);
					String col_5 = rsRs.getString(5);
					String col_6 = rsRs.getString(6);
					
					System.out.println(col_1 + " " + col_2 + " "+ col_3+" "+ col_4+ " "+ col_5);
				}
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		
		}finally {
		 
		}
	} //end function
		
	public static void main(String[] args) {
	// TODO Auto-generated method stub
		SpyMySqlTest ot_1 = new SpyMySqlTest();
			ot_1.t1_Select();
		
	}

}
