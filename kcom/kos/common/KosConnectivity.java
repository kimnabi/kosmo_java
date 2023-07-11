package a.b.c.com.kos.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public abstract class KosConnectivity {
	
	// ���, ������ ���̽��� �����ϴ� ������ �츮�� dataSource ��� �θ���. 
	public static final String JDBC_ORACLE_DRIVER = "oracle.jdbc.driver.OracleDriver";
	public static final String JDBC_ORACL_URL = "jdbc:oracle:thin:@localhost:1521:orclHBE00";
	public static final String JDBC_ORACLE_USER = "scott";
	public static final String JDBC_ORACLE_PWD = "tiger";
	
	// connection �Լ� 
	public static Connection getConnection() {
		
		// 1. Connection ��ü�� ���������� �����ϰ� null �� �ʱ�ȭ �Ѵ�.
		Connection conn = null;
		
		// JDBC ����̹� ã�� �� ����Ŭ �����ͺ��̽� �����ϱ� 
		try {
			Class.forName(KosConnectivity.JDBC_ORACLE_DRIVER);
			conn = DriverManager.getConnection(	KosConnectivity.JDBC_ORACL_URL, 
												KosConnectivity.JDBC_ORACLE_USER, 
												KosConnectivity.JDBC_ORACLE_PWD);
			
		}catch (Exception e) {
			System.out.println("��� ���� �� ������ �߻� �� >>> : " + e);
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
