package a.b.c.ch7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class OracleTest_2_2 {

	// ���
	// ������ ���̽��� �����ϴ� ������ �츮�� dataSource ��� �θ���.
	// dataSource ������ ����� ó���ϴ� ��
	// ����ʵ� ��� ������ ���� : main ���α׷� �����ϱ����� �޸𸮿� �ö󰣴�
	 //static final Logger logger = LogManager.getLogger(OracleTest_2_1.class);
	//static final Logger logger = LogManager.getLogger(OracleTest_2_1.class);
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	//public static final String JDBC_ORACLE_DRIVER = "oracle.jdbc.driver.OracleDriver";
	public static final String JDBC_ORACLE_DRIVER = "net.sf.log4jdbc.sql.jdbcapi.DriverShy";
	public static final String JDBC_ORACL_URL = "jdbc:log4jdbc:oracle:thin:@localhost:1522:orcl";
	//public static final String JDBC_ORACL_URL = "jdbc:oracle:thin:@localhost:1522:orcl";
	public static final String JDBC_ORACLE_USER = "scott";
	public static final String JDBC_ORACLE_PWD = "tiger";
	//log4jdbc.log4j2.properties
	// ������
	public OracleTest_2_2() {

		try {
			// JDBC ����̹��� �����ڸ� �̿��ؼ� ã�� ���
			// static ������� ���� �Ͽ� ����Ŭ ����̹� ������ �о�ͼ�
			// ���÷����� ����� ���� oracle.jdbc.driver.OracleDriver ��Ű���� �ִ� OracleDriver Ŭ������ ã�Ƽ�
			// �ε��Ѵ�
			Class.forName(OracleTest_2_2.JDBC_ORACLE_DRIVER);
		} catch (ClassNotFoundException e) {
			// Ŭ������ ��ã���� ����ó���� �޾� �ֿܼ� �����޼����� ����Ѵ�
			System.out.println("Oralce JDBC ����̹��� ã�� ���� >>> : " + e.getMessage());
		}
	}

	// ��ȸ �Լ� :Db�� tcp/ip �������� �Ͽ� ���̺��̽��� ��ȸ�ϱ� ���� ������
	// ���ڿ����·� ��� ����Ÿ���̽������� ��û �ؼ� ����� ����޾� �ֿܼ� ����Ѵ�
	public ArrayList<OracleTestVO> t1_Select() throws Exception {
		
		System.out.println("OracleTest_2_1.t1_Select() ���� ���� >>> : ");
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rsRs = null;
		ArrayList<OracleTestVO> aList = null;

		try {
			// �̱��� ���·� ����̹� ��ü�� �����Ͽ� Connection Ŭ���� Ÿ���� conn ������ �Ҵ��Ѵ�
			// 1.DB ������ Ŭ���̾�Ʈ���� ��������,��й�ȣ �����Ͽ� �����Ͽ� �����ϰ� �ȴ�
			conn = DriverManager.getConnection(OracleTest_2_2.JDBC_ORACL_URL, OracleTest_2_2.JDBC_ORACLE_USER,
					OracleTest_2_2.JDBC_ORACLE_PWD);
			// ���ڿ��� String Ÿ���� �ӽ� ����� �� ���ڿ��� ������� StringBuffer �ν��Ͻ� �����Ѵ�
			StringBuffer sb = new StringBuffer(); // vs String () �Һ���ü�̹Ƿ� �߰��Ҽ��� ���Ӱ� �޸��Ҵ��� ũ�⶧����
			// StringBuffer ��ü�� ����
			// sb�� ����Ű�� StringBuffer() Ŭ������ append �Լ��� ȣ���Ͽ� ���ڿ��� �߰��Ѵ�
			// sb.append( "SELECT * FROM PEOPLE" );
			sb.append(" SELECT 					\n");
			sb.append("       A.PNO AS COL_1 	    \n");
			sb.append("      ,A.PNAME AS COL_2 	\n");
			sb.append("      ,A.AGE AS COL_3 	    \n");
			sb.append("      ,A.HEIGHT AS COL_4 	    \n");
			sb.append("      ,A.WEIGHT AS COL_5 	    \n");
			sb.append("      ,A.DELETEYN AS COL_6 	    \n");
			sb.append("      ,A.INSERTDATE AS COL_7 	    \n");
			sb.append("      ,A.UPDATEDATE AS COL_8 	    \n");
			sb.append(" FROM  						\n");
			sb.append("       PEOPLE A         	\n");
			// ĳ�ø޸𸮿� ����Ͽ� ��ü�� �����ϱ⶧���� Statement Ŭ�������� prepareStatement�� ���°� �޸𸮰����� ���ϴ�
			// PreparedStatement prepareStatement(String sql) throws SQLException;
			// 2.DB�� �����ϱ����� ���ڿ������� ������ prepareStatement �Լ��� �μ��� �־�
			pstmt = conn.prepareStatement(sb.toString());
			// DB ������ �������� ����޾������ǰ���� ResultSet ��ü ��ȯ�޾Ƽ�
			// ResultSet Ÿ���� reRs ���������� �ʱ�ȭ�Ѵ�
			rsRs = pstmt.executeQuery();
			// reRs ���������� null�� �ƴҶ� if���� �����Ѵ�
			if (rsRs != null) {
				//
				System.out.println("rsRs >>> : " + rsRs);
				aList = new ArrayList<OracleTestVO>();
				// ���� ���� ��ȿ�Ҷ� true �� ��ȯ�Ѵ�
				while (rsRs.next()) {
					System.out.println("rsRs >>> : " + rsRs);
					// the column value; if the value is SQL NULL, the value returned is null

					System.out.println("aList >>> : " + aList);
					// ���
					OracleTestVO ovo = new OracleTestVO();

					System.out.println("reRs >>>>>>>>>>>>>>>>>");
					ovo.setCol_1(rsRs.getString(1));
					ovo.setCol_2(rsRs.getString(2));
					ovo.setCol_3(rsRs.getString(3));
					ovo.setCol_4(rsRs.getString(4));
					ovo.setCol_5(rsRs.getString(5));

					System.out.println(ovo.toString() + "\n");
					aList.add(ovo);

				} // end while
			}

		} catch (Exception e) {
			System.out.println("T1_Table ��ȸ��  ���� >>> : " + e.getMessage());
		} finally {
			if (conn != null) {
				conn.close();
			}
			if (pstmt != null) {
				pstmt.close();
			}
		}
		return aList;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("ISUD TYPE �� �Է��Ͻÿ� >>> : \n" + "SALL : ��ü��ȸ                          \n"
				+ "S : ������ȸ                                \n");
		Scanner sc = new Scanner(System.in);
		String isudType = sc.next();
		if (isudType != null && isudType.length() > 0) {
			System.out.println("isudType >>>" + isudType);
			isudType = isudType.toUpperCase();
		} // end if
			// ���� ��ȸ�Ҷ�
		if ("SALL".equals(isudType)) {

			OracleTest_2_2 ot2_sall = new OracleTest_2_2();
			ArrayList<OracleTestVO> aList;
			try {
				aList = ot2_sall.t1_Select();
				if (aList != null && aList.size() > 0) {
					System.out.println("aList >>> : " + aList);
					// ���
					for (OracleTestVO ovo : aList) {

						System.out.println("	main >>> : " + ovo.toString());
					} // end for
				} // end if
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} // end try

		} // end if
			// ���� ��ȸ
			// �������� �ش�Ǵ� �÷��̽�Ȧ�� �� ���ڿ� �Է¹޾� DB�� �̿��ϱ� ���� ���ڿ������� ������ �ۼ��Ѵ�
		if ("S".equals(isudType)) {

			System.out.println("��ȸ�� �˻�� �Է��Ͻÿ� >>> : ");
			Scanner sc_s = new Scanner(System.in);
			String searchName = sc_s.next();

			OracleTestVO ovo = null;
			ovo = new OracleTestVO();
			ovo.setCol_2(searchName);

			OracleTest_2_2 ot2_s = new OracleTest_2_2();
			//
			ArrayList<OracleTestVO> aList = ot2_s.t1_Select_Search(ovo);

			if (aList != null && aList.size() > 0) {
				System.out.println("aList.size() >>> : " + aList.size());

				for (int i = 0; i < aList.size(); i++) {
					OracleTestVO _ovo = aList.get(i);

					String col_1 = _ovo.getCol_1();
					String col_2 = _ovo.getCol_2();
					String col_3 = _ovo.getCol_3();
					String col_4 = _ovo.getCol_4();
					String col_5 = _ovo.getCol_5();

					// System.out.println(col_1 + " " + col_2 + " " + col_3);
					System.out.println(_ovo.toString());
				}
			}

			sc_s.close();
		} // end if t1_Select_Search
			// �Է�
		if ("I".equals(isudType)) {

			System.out.println("�Է��� �����͸� �Է��Ͻÿ� >>> : ");
			Scanner sc_i = new Scanner(System.in);
			//String col_1 = "p_seq.nextval";
			String col_2 = sc_i.next();
			String col_3 = sc_i.next();
			String col_4 = sc_i.next();
			String col_5 = sc_i.next();
		

			OracleTestVO ovo = null;
			ovo = new OracleTestVO();
			//ovo.setCol_1(col_1);
			ovo.setCol_2(col_2);
			ovo.setCol_3(col_3);
			ovo.setCol_4(col_4);
			ovo.setCol_5(col_5);
			ovo.setCol_6(false);

			OracleTest_2_2 ot2_i = new OracleTest_2_2();
			int nCnt = ot2_i.t1_Insert(ovo);
			System.out.println("PEOPLE �� ������ " + nCnt);
			if (nCnt >= 1) {
				System.out.println("PEOPLE �� ������ " + nCnt + " �Է� ���� >>> : ");
			} else {
				System.out.println("PEOPLE �� ������  �Է� ���� >>> : " + null);
			}

			sc_i.close();
		} // end if Insert
		if ("D".equals(isudType)) {
			System.out.println("�Է��� �����͸� �Է��Ͻÿ� >>> : ");
			Scanner sc_i = new Scanner(System.in);
			//String col_1 = "p_seq.nextval";
			String col_1 = sc_i.next();
			
		

			OracleTestVO ovo = null;
			ovo = new OracleTestVO();
			//ovo.setCol_1(col_1);
			ovo.setCol_1(col_1);
			ovo.setCol_6(true);

			OracleTest_2_2 ot2_i = new OracleTest_2_2();
			int nCnt = ot2_i.t1_Delect(ovo);
			System.out.println("PEOPLE �� ������ " + nCnt);
			if (nCnt >= 1) {
				System.out.println("PEOPLE �� ������ " + nCnt + " �Է� ���� >>> : ");
			} else {
				System.out.println("PEOPLE �� ������  �Է� ���� >>> : " + null);
			}
			
		}
	}

	private int t1_Delect(OracleTestVO ovo) {
		// TODO Auto-generated method stub
		System.out.println("OracleTest_2_1.t1_Delect() ���� ���� >>> : ");
		
		// �Լ� �ȿ��� ����ϴ� ��ü��
				// ��ü�� �����ϰ�, ���������� �������� �����ϰ� �׻� null �ʱ�ȭ �Ѵ�.
				// ����� ���� ������ �Ʒ� �Ʒ� ���ο��� ���������� ȣ���ؼ� ����Ѵ�.
				Connection conn = null;
				PreparedStatement pstmt = null;

				int nCnt = 0;
				try {
					conn = DriverManager.getConnection(OracleTest_2_2.JDBC_ORACL_URL, OracleTest_2_2.JDBC_ORACLE_USER,
							OracleTest_2_2.JDBC_ORACLE_PWD);

					StringBuffer sb = new StringBuffer();
					sb.append(" UPDATE PEOPLE					\n");
					sb.append("    SET						\n");
					sb.append("                 DELETEYN=1  	    \n");
					sb.append("                ,UPDATEDATE=systimestamp  	    \n");
					sb.append(" 	WHERE PNAME =?		 				\n");
					
					pstmt = conn.prepareStatement(sb.toString());
					//pstmt = new LoggableStatement(conn, sb.toString());
					//pstmt = conn.prepareStatement(sb.toString(),Statement.RETURN_GENERATED_KEYS);
					//System.out.println("INSERT QUERY :: \n" + sb);
					System.out.println("OracleTest_2_1.t1_Delete():"+ovo.toString());
					//System.out.println("Executing query: "+
				    // ((LoggableStatement)pstmt).getQueryString());
					pstmt.clearParameters();
					pstmt.setString(1, ovo.getCol_1());
					System.out.println("Executing query: "+
						     ((LoggableStatement)pstmt).getQueryString());
					nCnt = pstmt.executeUpdate();
					if(nCnt > 0) {
						System.out.println("����Ÿ�� �ֽ��ϴ�");
					}
				} catch (Exception e) {
					System.out.println(e);
				}	
		return nCnt;
	}

	private int t1_Insert(OracleTestVO ovo) {
		// TODO Auto-generated method stub
		System.out.println("OracleTest_2_1.t1_Insert() ���� ���� >>> : ");

		// �Լ� �ȿ��� ����ϴ� ��ü��
		// ��ü�� �����ϰ�, ���������� �������� �����ϰ� �׻� null �ʱ�ȭ �Ѵ�.
		// ����� ���� ������ �Ʒ� �Ʒ� ���ο��� ���������� ȣ���ؼ� ����Ѵ�.
		Connection conn = null;
		PreparedStatement pstmt = null;

		int nCnt = 0;
		try {
			// conn ���������� Connection �ν��Ͻ��� ��ġ���� �Ҵ��Ѵ�
			conn = DriverManager.getConnection(OracleTest_2_2.JDBC_ORACL_URL, OracleTest_2_2.JDBC_ORACLE_USER,
					OracleTest_2_2.JDBC_ORACLE_PWD);

			StringBuffer sb = new StringBuffer();
			sb.append(" INSERT INTO 					\n");
			sb.append("   PEOPLE 						\n");
			sb.append(" 			(   				\n");
			sb.append(" 				 PNO  		\n"); // COLUMN INDEX 1
			sb.append(" 				,PNAME  		\n"); // COLUMN INDEX 2
			sb.append(" 				,AGE  		\n"); // COLUMN INDEX 3
			sb.append(" 				,HEIGHT  		\n"); // COLUMN INDEX 4
			sb.append(" 				,WEIGHT  		\n"); // COLUMN INDEX 5
			sb.append("                 ,DELETEYN  	    \n");
			sb.append("                 ,INSERTDATE 	    \n");
			sb.append("                 ,UPDATEDATE  	    \n");
			sb.append(" 			)   				\n");
			sb.append(" 	 VALUES   					\n");
			sb.append(" 			(    p_seq.nextval	\n"); // p_seq.nextval
			sb.append(" 				,?  			\n"); // ? parameterIndex 1��
			sb.append(" 				,?  			\n"); // ? parameterIndex 2��
			sb.append(" 				,?  			\n"); // ? parameterIndex 3��
			sb.append(" 				,?  			\n"); // ? parameterIndex 4��
			sb.append(" 				,? 			    \n"); // ? parameterIndex 7��
			sb.append(" 				,systimestamp  			\n"); // ? parameterIndex 5��
			sb.append(" 				,systimestamp  			\n"); // ? parameterIndex 6��
			sb.append(" 			)   				\n");
			
			 pstmt = conn.prepareStatement(sb.toString());
			//pstmt = new LoggableStatement(conn, sb.toString());
			//pstmt = conn.prepareStatement(sb.toString(),Statement.RETURN_GENERATED_KEYS);
			//System.out.println("INSERT QUERY :: \n" + sb);
			//System.out.println("OracleTest_2_1.t1_Insert():"+ovo.toString());
			//System.out.println("OracleTest_2_1.t1_Insert():"+ovo);
			//stmt.executeUpdate(sql, Statement.RETURN_GENERATED_KEYS);
			pstmt.clearParameters();
					
			//pstmt.setString(1, ovo.getCol_1());			
			pstmt.setString(1, ovo.getCol_2());			
			pstmt.setString(2, ovo.getCol_3());			
			pstmt.setString(3, ovo.getCol_4());			
			pstmt.setString(4, ovo.getCol_5());			
			pstmt.setBoolean(5, ovo.getCol_6());			
				
			
//			System.out.println("Executing query: "+
//				     ((LoggableStatement)pstmt).getQueryString());
			//System.out.println("OracleTest_2_1.t1_Insert():"+pstmt.toString());
			nCnt = pstmt.executeUpdate();
			//nCnt = pstmt.executeUpdate(sb.toString(), Statement.RETURN_GENERATED_KEYS);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("dfsfd"+e);
			//dfsfdjava.sql.SQLException: �������� �� �ε���
		}
		return nCnt;
	}

	public ArrayList<OracleTestVO> t1_Select_Search(OracleTestVO ovo) {
		// TODO Auto-generated method stub
		System.out.println("OracleTest_2_1.t1_Select_Search () ���� ���� >>> : ");

		// �Լ� �ȿ��� ����ϴ� ��ü��
		// ��ü�� �����ϰ�, ���������� �������� �����ϰ� �׻� null �ʱ�ȭ �Ѵ�.
		// ����� ���� ������ �Ʒ� �Ʒ� ���ο��� ���������� ȣ���ؼ� ����Ѵ�.
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rsRs = null;
		ArrayList<OracleTestVO> aList = null;
		try {
			conn = DriverManager.getConnection(OracleTest_2_2.JDBC_ORACL_URL, OracleTest_2_2.JDBC_ORACLE_USER,
					OracleTest_2_2.JDBC_ORACLE_PWD);

			StringBuffer sb = new StringBuffer();

			sb.append(" SELECT 					\n");
			sb.append("       A.COL_1 AS COL_1 	\n");
			sb.append("      ,A.COL_2 AS COL_2 	\n");
			sb.append("      ,A.COL_3 AS COL_3 	\n");
			sb.append("      ,A.COL_4 AS COL_4 	\n");
			sb.append("      ,A.COL_5 AS COL_5 	\n");
			sb.append(" FROM  						\n");
			sb.append("       PEOPLE A         	\n");
			sb.append(" WHERE A.COL_2 = ? 			\n"); // ? parameterIndex 1��

			String sql = sb.toString();
			pstmt = conn.prepareStatement(sql);
			System.out.println("SELECT SEARCH QUERY :: \n" + sql);
			// �������� palceholder �ޱ����� �غ�
			pstmt.clearParameters();
			// �Ѱ��� ����Ÿ�� �޴´� 2��° �÷��� ����Ÿ�� �����Ѵ�
			pstmt.setString(1, ovo.getCol_2());
			// DB�� �������� ������ ��û�ؼ� ������ ��������� ����޾� ResultSet Ÿ���� reRs ������ �ʱ�ȭ�Ѵ�
			rsRs = pstmt.executeQuery();

			// rsRs���������� null�� �ƴҶ� if ���� �����Ѵ�
			if (rsRs != null) {

				aList = new ArrayList<OracleTestVO>();

				while (rsRs.next()) {
					// �ش�Ǵ� �÷��� ����Ÿ�� OracleTestVO�� �ε��� ������� 1:1�� ���ε�
					// ArrayList Ŭ������ add �Լ��� ovo ���������� �߰��Ѵ�
					OracleTestVO _ovo = new OracleTestVO();
					_ovo.setCol_1(rsRs.getString(1));
					_ovo.setCol_2(rsRs.getString(2));
					_ovo.setCol_3(rsRs.getString(3));
					_ovo.setCol_4(rsRs.getString(4));
					_ovo.setCol_5(rsRs.getString(5));

					aList.add(_ovo);
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return aList;
	}
}
