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

	// 상수
	// 데이터 베이스를 연결하는 정보를 우리는 dataSource 라고 부른다.
	// dataSource 정보를 상수로 처리하는 것
	// 멤버필드 상수 값으로 설정 : main 프로그램 실행하기전에 메모리에 올라간다
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
	// 생성자
	public OracleTest_2_2() {

		try {
			// JDBC 드라이버를 생성자를 이용해서 찾는 방법
			// static 상수값에 접근 하여 오라클 드라이버 정보를 읽어와서
			// 리플렉션의 기술를 통해 oracle.jdbc.driver.OracleDriver 패키지에 있는 OracleDriver 클래스를 찾아서
			// 로딩한다
			Class.forName(OracleTest_2_2.JDBC_ORACLE_DRIVER);
		} catch (ClassNotFoundException e) {
			// 클래스를 못찾을때 예외처리를 받아 콘솔에 에러메세지를 출력한다
			System.out.println("Oralce JDBC 드라이버를 찾기 에러 >>> : " + e.getMessage());
		}
	}

	// 조회 함수 :Db를 tcp/ip 프로토콜 하여 데이베이스에 조회하기 위해 쿼리문
	// 문자열형태로 담아 데이타베이스서버에 요청 해서 결과를 응답받아 콘솔에 출력한다
	public ArrayList<OracleTestVO> t1_Select() throws Exception {
		
		System.out.println("OracleTest_2_1.t1_Select() 진입 성공 >>> : ");
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rsRs = null;
		ArrayList<OracleTestVO> aList = null;

		try {
			// 싱글톤 형태로 드라이버 객체를 생성하여 Connection 클래스 타입의 conn 변수에 할당한다
			// 1.DB 서버로 클라이언트측의 유저정보,비밀번호 포함하여 전송하여 연결하게 된다
			conn = DriverManager.getConnection(OracleTest_2_2.JDBC_ORACL_URL, OracleTest_2_2.JDBC_ORACLE_USER,
					OracleTest_2_2.JDBC_ORACLE_PWD);
			// 문자열를 String 타입의 임시 저장소 에 문자열을 담기위해 StringBuffer 인스턴스 생성한다
			StringBuffer sb = new StringBuffer(); // vs String () 불변객체이므로 추가할수록 새롭게 메모리할당이 크기때문에
			// StringBuffer 객체를 쓴다
			// sb가 가르키는 StringBuffer() 클래스에 append 함수를 호출하여 문자열를 추가한다
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
			// 캐시메모리에 사용하여 객체를 재사용하기때문에 Statement 클래스보다 prepareStatement를 쓰는게 메모리관리가 편하다
			// PreparedStatement prepareStatement(String sql) throws SQLException;
			// 2.DB에 질의하기위해 문자열형태의 쿼리를 prepareStatement 함수에 인수로 넣어
			pstmt = conn.prepareStatement(sb.toString());
			// DB 서버에 쿼리문에 응답받아쿼리의결과를 ResultSet 객체 반환받아서
			// ResultSet 타입의 reRs 참조변수에 초기화한다
			rsRs = pstmt.executeQuery();
			// reRs 참조변수가 null이 아닐때 if절이 실행한다
			if (rsRs != null) {
				//
				System.out.println("rsRs >>> : " + rsRs);
				aList = new ArrayList<OracleTestVO>();
				// 현재 열이 유효할때 true 을 반환한다
				while (rsRs.next()) {
					System.out.println("rsRs >>> : " + rsRs);
					// the column value; if the value is SQL NULL, the value returned is null

					System.out.println("aList >>> : " + aList);
					// 출력
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
			System.out.println("T1_Table 조회시  에러 >>> : " + e.getMessage());
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

		System.out.println("ISUD TYPE 을 입력하시요 >>> : \n" + "SALL : 전체조회                          \n"
				+ "S : 조건조회                                \n");
		Scanner sc = new Scanner(System.in);
		String isudType = sc.next();
		if (isudType != null && isudType.length() > 0) {
			System.out.println("isudType >>>" + isudType);
			isudType = isudType.toUpperCase();
		} // end if
			// 전제 조회할때
		if ("SALL".equals(isudType)) {

			OracleTest_2_2 ot2_sall = new OracleTest_2_2();
			ArrayList<OracleTestVO> aList;
			try {
				aList = ot2_sall.t1_Select();
				if (aList != null && aList.size() > 0) {
					System.out.println("aList >>> : " + aList);
					// 출력
					for (OracleTestVO ovo : aList) {

						System.out.println("	main >>> : " + ovo.toString());
					} // end for
				} // end if
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} // end try

		} // end if
			// 조건 조회
			// 조건절에 해당되는 플레이스홀더 인 문자열 입력받아 DB에 이용하기 위해 문자열형태의 쿼리를 작성한다
		if ("S".equals(isudType)) {

			System.out.println("조회할 검색어를 입력하시오 >>> : ");
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
			// 입력
		if ("I".equals(isudType)) {

			System.out.println("입력할 데이터를 입력하시오 >>> : ");
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
			System.out.println("PEOPLE 에 데이터 " + nCnt);
			if (nCnt >= 1) {
				System.out.println("PEOPLE 에 데이터 " + nCnt + " 입력 성공 >>> : ");
			} else {
				System.out.println("PEOPLE 에 데이터  입력 실패 >>> : " + null);
			}

			sc_i.close();
		} // end if Insert
		if ("D".equals(isudType)) {
			System.out.println("입력할 데이터를 입력하시오 >>> : ");
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
			System.out.println("PEOPLE 에 데이터 " + nCnt);
			if (nCnt >= 1) {
				System.out.println("PEOPLE 에 데이터 " + nCnt + " 입력 성공 >>> : ");
			} else {
				System.out.println("PEOPLE 에 데이터  입력 실패 >>> : " + null);
			}
			
		}
	}

	private int t1_Delect(OracleTestVO ovo) {
		// TODO Auto-generated method stub
		System.out.println("OracleTest_2_1.t1_Delect() 진입 성공 >>> : ");
		
		// 함수 안에서 사용하는 객체는
				// 객체를 선언하고, 참조변수를 지역변수 선언하고 항상 null 초기화 한다.
				// 사용할 때는 선언한 아래 아래 라인에서 참조변수를 호출해서 사용한다.
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
						System.out.println("데이타가 있습니다");
					}
				} catch (Exception e) {
					System.out.println(e);
				}	
		return nCnt;
	}

	private int t1_Insert(OracleTestVO ovo) {
		// TODO Auto-generated method stub
		System.out.println("OracleTest_2_1.t1_Insert() 진입 성공 >>> : ");

		// 함수 안에서 사용하는 객체는
		// 객체를 선언하고, 참조변수를 지역변수 선언하고 항상 null 초기화 한다.
		// 사용할 때는 선언한 아래 아래 라인에서 참조변수를 호출해서 사용한다.
		Connection conn = null;
		PreparedStatement pstmt = null;

		int nCnt = 0;
		try {
			// conn 참조변수에 Connection 인스턴스의 위치값를 할당한다
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
			sb.append(" 				,?  			\n"); // ? parameterIndex 1번
			sb.append(" 				,?  			\n"); // ? parameterIndex 2번
			sb.append(" 				,?  			\n"); // ? parameterIndex 3번
			sb.append(" 				,?  			\n"); // ? parameterIndex 4번
			sb.append(" 				,? 			    \n"); // ? parameterIndex 7번
			sb.append(" 				,systimestamp  			\n"); // ? parameterIndex 5번
			sb.append(" 				,systimestamp  			\n"); // ? parameterIndex 6번
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
			//dfsfdjava.sql.SQLException: 부적합한 열 인덱스
		}
		return nCnt;
	}

	public ArrayList<OracleTestVO> t1_Select_Search(OracleTestVO ovo) {
		// TODO Auto-generated method stub
		System.out.println("OracleTest_2_1.t1_Select_Search () 진입 성공 >>> : ");

		// 함수 안에서 사용하는 객체는
		// 객체를 선언하고, 참조변수를 지역변수 선언하고 항상 null 초기화 한다.
		// 사용할 때는 선언한 아래 아래 라인에서 참조변수를 호출해서 사용한다.
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
			sb.append(" WHERE A.COL_2 = ? 			\n"); // ? parameterIndex 1번

			String sql = sb.toString();
			pstmt = conn.prepareStatement(sql);
			System.out.println("SELECT SEARCH QUERY :: \n" + sql);
			// 쿼리문의 palceholder 받기위해 준비
			pstmt.clearParameters();
			// 한개의 데이타만 받는다 2번째 컬럼의 데이타를 대입한다
			pstmt.setString(1, ovo.getCol_2());
			// DB에 쿼리문을 날려서 요청해서 쿼리의 결과값으로 응답받아 ResultSet 타입의 reRs 변수에 초기화한다
			rsRs = pstmt.executeQuery();

			// rsRs참조변수가 null이 아닐때 if 문이 수행한다
			if (rsRs != null) {

				aList = new ArrayList<OracleTestVO>();

				while (rsRs.next()) {
					// 해당되는 컬럼의 데이타를 OracleTestVO의 인덱스 순서대로 1:1로 바인딩
					// ArrayList 클래스의 add 함수에 ovo 참조변수를 추가한다
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
