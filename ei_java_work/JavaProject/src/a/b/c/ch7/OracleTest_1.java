package a.b.c.ch7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class OracleTest_1 {
     
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	// ��� 
	// ������ ���̽��� �����ϴ� ������ �츮�� dataSource ��� �θ���.
	// dataSource ������ ����� ó���ϴ� ��
	// ����ʵ�  ��� ������ ���� : main ���α׷� �����ϱ����� �޸𸮿� �ö󰣴�
	//public static final String JDBC_ORACLE_DRIVER = "oracle.jdbc.driver.OracleDriver";
	//public static final String JDBC_ORACL_URL = "jdbc:oracle:thin:@localhost:1522:orcl";
	public static final String JDBC_ORACLE_DRIVER = "net.sf.log4jdbc.sql.jdbcapi.DriverShy";
	public static final String JDBC_ORACL_URL = "jdbc:log4jdbc:oracle:thin:@localhost:1522:orcl";
	public static final String JDBC_ORACLE_USER = "scott";
	public static final String JDBC_ORACLE_PWD = "tiger";
	
	// ������ 
	public OracleTest_1 () {
		
		try {
			// JDBC ����̹��� �����ڸ� �̿��ؼ� ã�� ���
            // static ������� ���� �Ͽ� ����Ŭ ����̹� ������ �о�ͼ�
			// ���÷����� ����� ���� oracle.jdbc.driver.OracleDriver ��Ű���� �ִ� OracleDriver Ŭ������ ã�Ƽ� �ε��Ѵ�
			Class.forName(OracleTest_1.JDBC_ORACLE_DRIVER);			
		}catch (ClassNotFoundException e) {
			//Ŭ������ ��ã���� ����ó���� �޾� �ֿܼ� �����޼����� ����Ѵ�
			System.out.println("Oralce JDBC ����̹��� ã�� ���� >>> : " + e.getMessage());
		}
	}
	
	// ��ȸ �Լ� :Db�� tcp/ip �������� �Ͽ�   ���̺��̽��� ��ȸ�ϱ� ���� ������ 
	// ���ڿ����·� ��� ����Ÿ���̽������� ��û �ؼ� ����� ����޾� �ֿܼ� ����Ѵ�
	public void t1_Select () {

		Connection conn = null; 
		PreparedStatement pstmt = null; 
		ResultSet rsRs = null;
		
		try {
			//�̱��� ���·� ����̹� ��ü�� �����Ͽ� Connection Ŭ���� Ÿ���� conn ������ �Ҵ��Ѵ�
			//1.DB ������  Ŭ���̾�Ʈ���� ��������,��й�ȣ �����Ͽ� �����Ͽ� �����ϰ� �ȴ� 
			conn = DriverManager.getConnection(	OracleTest_1.JDBC_ORACL_URL, 
												OracleTest_1.JDBC_ORACLE_USER, 
												OracleTest_1.JDBC_ORACLE_PWD);
			// ���ڿ���  String Ÿ���� �ӽ� ����� �� ���ڿ��� ������� StringBuffer �ν��Ͻ� �����Ѵ�
			StringBuffer sb = new StringBuffer(); // vs String () �Һ���ü�̹Ƿ�  �߰��Ҽ��� ���Ӱ� �޸��Ҵ��� ũ�⶧���� 
			// StringBuffer ��ü�� ����
			// sb�� ����Ű�� StringBuffer() Ŭ������ append �Լ��� ȣ���Ͽ�  ���ڿ���  �߰��Ѵ�
			sb.append( "SELECT * FROM PEOPLE" );
			// ĳ�ø޸𸮿� ����Ͽ� ��ü�� �����ϱ⶧���� Statement Ŭ�������� prepareStatement�� ���°� �޸𸮰����� ���ϴ�
			//PreparedStatement prepareStatement(String sql) throws SQLException;
			//2.DB�� �����ϱ����� ���ڿ������� ������  prepareStatement �Լ��� �μ��� �־�  
			pstmt = conn.prepareStatement(sb.toString());
			// DB ������ �������� ����޾������ǰ����  ResultSet ��ü ��ȯ�޾Ƽ� 
			// ResultSet Ÿ���� reRs ���������� �ʱ�ȭ�Ѵ�
			rsRs = pstmt.executeQuery();
			// reRs ���������� null�� �ƴҶ� if���� �����Ѵ�
			if (rsRs !=null) {
				//true if the new current row is valid; false if there are no more rows
				
				while (rsRs.next()) {
					//the column value; if the value is SQL NULL, the value returned is null
					String col_1 = rsRs.getString(1);
					String col_2 = rsRs.getString(2);
					String col_3 = rsRs.getString(3);
					
					System.out.println(col_1 + " " + col_2 + " "+ col_3);
				}
			}
			
		}catch(Exception e) {
			System.out.println("T1_Table ��ȸ��  ���� >>> : " + e.getMessage());
		}		
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OracleTest_1 ot_1 = new OracleTest_1();
		ot_1.t1_Select();
	}
}
