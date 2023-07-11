package a.b.c.ch7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PeopleDaoTest {
	//@Test
	public void addAndGet() throws ClassNotFoundException, SQLException {
//		ApplicationContext context =
//				new GenericXmlApplicationContext("applicationContext.xml");
		
		//UserDao dao = context.getBean("userDao", UserDao.class);
		Connection conn = null;
		PreparedStatement pstmt = null;
		OracleTestVO ovo  = new OracleTestVO(); 

	
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
			
//			dao.add(user1);
//			assertEquals(dao.getCount(), 1);
			
//			dao.add(user2);
//			assertEquals(dao.getCount(), 2);
			
//			dao.add(user3);
//			assertEquals(dao.getCount(), 3);
//				
			
//			System.out.println("Executing query: "+
//				     ((LoggableStatement)pstmt).getQueryString());
			//System.out.println("OracleTest_2_1.t1_Insert():"+pstmt.toString());
		pstmt.executeUpdate();
			//nCnt = pstmt.executeUpdate(sb.toString(), Statement.RETURN_GENERATED_KEYS);
		
//		user.setId("gyumee");
//		user.setName("박성철");
//		user.setPassword("springno1");
//		
//		dao.add(user);
//		
//		User user2 = dao.get(user.getId());
//		
//		assertEquals(user2.getName(), user.getName());
//		assertEquals(user2.getPassword(), user.getPassword());
		
	}	

}
