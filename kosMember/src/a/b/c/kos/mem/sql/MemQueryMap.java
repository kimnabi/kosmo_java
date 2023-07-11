package a.b.c.kos.mem.sql;

import a.b.c.kos.mem.vo.MemVO;

public class MemQueryMap {
	
	// 채번 생성할 쿼리 STATIC 필드 상수로 선언
	private static final String sql1 = "SELECT  /* + INDEX_DESC(SYS_C0010900) */ NVL(MAX(SUBSTR(A.MNUM, -4)), 0) + 1 COMMON FROM KOS_MEMBER A"; 
	public static final String[] chabun_query = {sql1};
	public static int CHABUN_MEMBER_1 = 0;
		
	public static String getMemSelectAllQuery() {
		
		StringBuffer sb = new StringBuffer();
		
		sb.append(" SELECT 										\n");
		sb.append(" 				 MNUM  		    				\n"); // COLUMN INDEX 1
		sb.append(" 				,MNAME  						\n"); // COLUMN INDEX 2
		sb.append(" 				,MID 		    					\n"); // COLUMN INDEX 3
		sb.append(" 				,MPW  		   						\n"); // COLUMN INDEX 4
		sb.append(" 				,MHP  		   					    \n"); // COLUMN INDEX 5
		sb.append(" 				,MEMAIL  		                \n"); // COLUMN INDEX 6
		sb.append(" 				,MGENDER  		            \n"); // COLUMN INDEX 7
		sb.append(" 				,MHOBBY 		   		        \n"); // COLUMN INDEX 8
		sb.append(" 				,MZONE 		    			    \n"); // COLUMN INDEX 9
		sb.append(" 				,MROAD 		                    \n"); // COLUMN INDEX 10
		sb.append(" 				,MJIBUN 		                    \n"); // COLUMN INDEX 11
		sb.append(" 				,MMSG 		                    \n"); // COLUMN INDEX 12
		sb.append(" 				,DELETEYN 		            \n"); // COLUMN INDEX 13
		sb.append(" 				,INSERTDATE 		        \n"); // COLUMN INDEX 14
		sb.append(" 				,UPDATEDATE 		        \n"); // COLUMN INDEX 15
		sb.append(" FROM  	KOS_MEMBER                \n"); 
	
		return sb.toString();
	}

	public static String getMemSearchQuery() {
		
		StringBuffer sb = new StringBuffer();
		
		sb.append(" SELECT 										\n");
		sb.append(" 				 MNUM  		    				\n"); // COLUMN INDEX 1
		sb.append(" 				,MNAME  						\n"); // COLUMN INDEX 2
		sb.append(" 				,MID 		    					\n"); // COLUMN INDEX 3
		sb.append(" 				,MPW  		   						\n"); // COLUMN INDEX 4
		sb.append(" 				,MHP  		   					    \n"); // COLUMN INDEX 5
		sb.append(" 				,MEMAIL  		                \n"); // COLUMN INDEX 6
		sb.append(" 				,MGENDER  		            \n"); // COLUMN INDEX 7
		sb.append(" 				,MHOBBY 		   		        \n"); // COLUMN INDEX 8
		sb.append(" 				,MZONE 		    			    \n"); // COLUMN INDEX 9
		sb.append(" 				,MROAD 		                    \n"); // COLUMN INDEX 10
		sb.append(" 				,MJIBUN 		                    \n"); // COLUMN INDEX 11
		sb.append(" 				,MMSG 		                    \n"); // COLUMN INDEX 12
		sb.append(" 				,DELETEYN 		            \n"); // COLUMN INDEX 13
		sb.append(" 				,INSERTDATE 		        \n"); // COLUMN INDEX 14
		sb.append(" 				,UPDATEDATE 		        \n"); // COLUMN INDEX 15
		sb.append(" FROM  	KOS_MEMBER                \n"); 
		sb.append(" where  	#searchfilter = #keyword   \n"); 
	
		
		return sb.toString();
	}
	public static String getMemSearchByDateQuery() {
		
		StringBuffer sb = new StringBuffer();
		
		sb.append(" SELECT 										\n");
		sb.append(" 				 MNUM  		    				\n"); // COLUMN INDEX 1
		sb.append(" 				,MNAME  						\n"); // COLUMN INDEX 2
		sb.append(" 				,MID 		    					\n"); // COLUMN INDEX 3
		sb.append(" 				,MPW  		   						\n"); // COLUMN INDEX 4
		sb.append(" 				,MHP  		   					    \n"); // COLUMN INDEX 5
		sb.append(" 				,MEMAIL  		                \n"); // COLUMN INDEX 6
		sb.append(" 				,MGENDER  		            \n"); // COLUMN INDEX 7
		sb.append(" 				,MHOBBY 		   		        \n"); // COLUMN INDEX 8
		sb.append(" 				,MZONE 		    			    \n"); // COLUMN INDEX 9
		sb.append(" 				,MROAD 		                    \n"); // COLUMN INDEX 10
		sb.append(" 				,MJIBUN 		                    \n"); // COLUMN INDEX 11
		sb.append(" 				,MMSG 		                    \n"); // COLUMN INDEX 12
		sb.append(" 				,DELETEYN 		            \n"); // COLUMN INDEX 13
		sb.append(" 				,INSERTDATE 		        \n"); // COLUMN INDEX 14
		sb.append(" 				,UPDATEDATE 		        \n"); // COLUMN INDEX 15
		sb.append(" FROM  	KOS_MEMBER                \n"); 
		sb.append(" where  	INSERTDATE BETWEEN TO_DATE(#fromDate, 'YYYY-MM-DD')  \n"); 
		sb.append("              AND TO_DATE(#toDate, 'YYYY-MM-DD')          \n"); 
		
		return sb.toString();
	}
	public static String getMemSelectQuery() {
	StringBuffer sb = new StringBuffer();
		
		sb.append(" SELECT 										\n");
		sb.append(" 				 MNUM  		    				\n"); // COLUMN INDEX 1
		sb.append(" 				,MNAME  						\n"); // COLUMN INDEX 2
		sb.append(" 				,MID 		    					\n"); // COLUMN INDEX 3
		sb.append(" 				,MPW  		   						\n"); // COLUMN INDEX 4
		sb.append(" 				,MHP  		   					    \n"); // COLUMN INDEX 5
		sb.append(" 				,MEMAIL  		                \n"); // COLUMN INDEX 6
		sb.append(" 				,MGENDER  		            \n"); // COLUMN INDEX 7
		sb.append(" 				,MHOBBY 		   		        \n"); // COLUMN INDEX 8
		sb.append(" 				,MZONE 		    			    \n"); // COLUMN INDEX 9
		sb.append(" 				,MROAD 		                    \n"); // COLUMN INDEX 10
		sb.append(" 				,MJIBUN 		                    \n"); // COLUMN INDEX 11
		sb.append(" 				,MMSG 		                    \n"); // COLUMN INDEX 12
		sb.append(" 				,DELETEYN 		            \n"); // COLUMN INDEX 13
		sb.append(" 				,INSERTDATE 		        \n"); // COLUMN INDEX 14
		sb.append(" 				,UPDATEDATE 		        \n"); // COLUMN INDEX 15
		sb.append(" FROM  	KOS_MEMBER                \n"); 
		sb.append(" WHERE  MNUM = #1                    \n"); 
		
		return sb.toString();
	}
	public static String getMemInsertQuery() {
		
		StringBuffer sb = new StringBuffer();
	
		sb.append(" INSERT INTO 								\n");
		sb.append("   KOS_MEMBER 	(		    		    \n");
		sb.append(" 				 MNUM  		    				\n"); // COLUMN INDEX 1
		sb.append(" 				,MNAME  						\n"); // COLUMN INDEX 2
		sb.append(" 				,MID 		    					\n"); // COLUMN INDEX 3
		sb.append(" 				,MPW  		   						\n"); // COLUMN INDEX 4
		sb.append(" 				,MHP  		   					    \n"); // COLUMN INDEX 5
		sb.append(" 				,MEMAIL  		                \n"); // COLUMN INDEX 6
		sb.append(" 				,MGENDER  		            \n"); // COLUMN INDEX 7
		sb.append(" 				,MHOBBY 		   		        \n"); // COLUMN INDEX 8
		sb.append(" 				,MZONE 		    			    \n"); // COLUMN INDEX 9
		sb.append(" 				,MROAD 		                    \n"); // COLUMN INDEX 10
		sb.append(" 				,MJIBUN 		                    \n"); // COLUMN INDEX 11
		sb.append(" 				,MMSG 		                    \n"); // COLUMN INDEX 12
		sb.append(" 				,DELETEYN 		            \n"); // COLUMN INDEX 13
		sb.append(" 				,INSERTDATE 		        \n"); // COLUMN INDEX 14
		sb.append(" 				,UPDATEDATE 		        \n"); // COLUMN INDEX 15
		sb.append(" 			)   										\n");
		sb.append(" 	 VALUES   									\n");
		sb.append(" 			(         	       						    \n"); 
		sb.append(" 				  ? 		                            \n"); // COLUMN INDEX 1
		sb.append(" 				 ,? 		                            \n"); // COLUMN INDEX 2
		sb.append(" 				 ,? 		                            \n"); // COLUMN INDEX 3
		sb.append(" 				 ,? 		                            \n"); // COLUMN INDEX 4
		sb.append(" 				, ? 		                            \n"); // COLUMN INDEX 5
		sb.append(" 				, ? 		                            \n"); // COLUMN INDEX 6
		sb.append(" 				, ? 		                            \n"); // COLUMN INDEX 7
		sb.append(" 				, ? 		                            \n"); // COLUMN INDEX 8
		sb.append(" 				, ? 		                            \n"); // COLUMN INDEX 9
		sb.append(" 				, ? 		                            \n"); // COLUMN INDEX 10
		sb.append(" 				 ,? 		                            \n"); // COLUMN INDEX 11
		sb.append(" 				 ,? 		                            \n"); // COLUMN INDEX 12
		sb.append("                 ,'Y'  	   						    \n"); // COLUMN INDEX 13
		sb.append("                 ,sysdate 	  				    \n"); // COLUMN INDEX 14
		sb.append("                 ,sysdate  	                    \n"); // COLUMN INDEX 15
		sb.append(" 			)   				                        \n");
	
		return sb.toString();
	}
	public static String getMemUpdateQuery() {
StringBuffer sb = new StringBuffer();
		
		/*
		 * UPDATE INTO KOS_BOARD ( BNUM,BSUBJECT,BWRITER ,BPW,BMEMO,DELETEYN
		 * ,INSERTDATE,UPDATEDATE) VALUES( '1000','Test','Test BWRITER' ,'Test
		 * BPW','Test BMEMO','Y' ,sysdate,sysdate);
		 * 
		 * 
		 * 
		 */
		sb.append(" UPDATE  KOS_MEMBER 				    	\n");
		sb.append(" SET   	           			    		       		    \n");
		sb.append(" 				 MNAME 	= ?			                \n"); // COLUMN INDEX 2
		sb.append(" 				,MHP  	=  ?			                    \n"); // COLUMN INDEX 1
		sb.append(" 				,MEMAIL 	= ?			                \n"); // COLUMN INDEX 2
		sb.append(" 				,MHOBBY 	= ?			            \n"); // COLUMN INDEX 2
		sb.append(" 				,MGENDER 	= ?			            \n"); // COLUMN INDEX 2
		sb.append(" 				,MZONE 	= ?			                \n"); // COLUMN INDEX 2
		sb.append(" 				,MROAD 	= ?			                \n"); // COLUMN INDEX 2
		sb.append(" 				,MJIBUN 	= ?			                \n"); // COLUMN INDEX 2
		sb.append(" 				,MMSG  	= ?		                 	\n"); // COLUMN INDEX 3
		sb.append("               ,UPDATEDATE = SYSDATE  	\n"); 
		sb.append("WHERE     1=1			            				\n");
		sb.append("AND   	 DELETEYN 		= 'Y' 	    		\n");
		sb.append("AND       MNUM 			= ? 			            \n"); // COLUMN INDEX 4
		
		return sb.toString();
	}
	public static String getMemDeleteQuery() {
		return "";
	}

}
