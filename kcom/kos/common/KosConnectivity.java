package a.b.c.com.kos.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public abstract class KosConnectivity {
	
	// 상수, 데이터 베이스를 연결하는 정보를 우리는 dataSource 라고 부른다. 
	public static final String JDBC_ORACLE_DRIVER = "oracle.jdbc.driver.OracleDriver";
	public static final String JDBC_ORACL_URL = "jdbc:oracle:thin:@localhost:1521:orclHBE00";
	public static final String JDBC_ORACLE_USER = "scott";
	public static final String JDBC_ORACLE_PWD = "tiger";
	
	// connection 함수 
	public static Connection getConnection() {
		
		// 1. Connection 객체를 지역변수로 선언하고 null 로 초기화 한다.
		Connection conn = null;
		
		// JDBC 드라이버 찾기 및 오라클 데이터베이스 연결하기 
		try {
			Class.forName(KosConnectivity.JDBC_ORACLE_DRIVER);
			conn = DriverManager.getConnection(	KosConnectivity.JDBC_ORACL_URL, 
												KosConnectivity.JDBC_ORACLE_USER, 
												KosConnectivity.JDBC_ORACLE_PWD);
			
		}catch (Exception e) {
			System.out.println("디비 연결 중 에러가 발생 함 >>> : " + e);
		}
		
		return conn;
	}
	
	// DML : insert, update, delete 
	public static void conClose (Connection conn, PreparedStatement pstmt) {
		
		try {
			if (pstmt !=null) try { pstmt.close(); pstmt=null;} catch(Exception ex) {}
			if (conn !=null) try { conn.close(); conn=null;} catch(Exception ex) {}			
		}catch(Exception e2) {}
		
	}
	
	// DQL : select 
	public static void conClose (Connection conn, PreparedStatement pstmt, ResultSet rsRs) {
		
		try {
			if (rsRs !=null) try { rsRs.close(); rsRs=null;} catch(Exception ex) {}
			if (pstmt !=null) try { pstmt.close(); pstmt=null;} catch(Exception ex) {}
			if (conn !=null) try { conn.close(); conn=null;} catch(Exception ex) {}			
		}catch(Exception e2) {}
		
	}
}
