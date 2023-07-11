package com.kos.board.sql;

public abstract class BoradSqlMap {
	
	public static String getBoardInsertQuery() {
		StringBuffer sb = new StringBuffer();
		
		/*
		 * INSERT INTO KOS_BOARD ( BNUM,BSUBJECT,BWRITER ,BPW,BMEMO,DELETEYN
		 * ,INSERTDATE,UPDATEDATE) VALUES( '1000','Test','Test BWRITER' ,'Test
		 * BPW','Test BMEMO','Y' ,sysdate,sysdate);
		 */
		sb.append(" INSERT INTO 					\n");
		sb.append("   KOS_BOARD 				    \n");
		sb.append(" 			(   				\n");
		sb.append(" 				 BNUM  		    \n"); // COLUMN INDEX 1
		sb.append(" 				,BSUBJECT  		\n"); // COLUMN INDEX 2
		sb.append(" 				,BWRITER  		\n"); // COLUMN INDEX 3
		sb.append(" 				,BPW  		    \n"); // COLUMN INDEX 4
		sb.append(" 				,BMEMO  		\n"); // COLUMN INDEX 5
		sb.append("                 ,DELETEYN  	    \n"); // COLUMN INDEX 6
		sb.append("                 ,INSERTDATE 	\n"); // COLUMN INDEX 7
		sb.append("                 ,UPDATEDATE  	\n"); // COLUMN INDEX 8
		sb.append(" 			)   				\n");
		sb.append(" 	 VALUES   					\n");
		sb.append(" 			(         	        \n"); // 
		sb.append(" 				 ? 		        \n"); // COLUMN INDEX 1
		sb.append(" 				,?  		    \n"); // COLUMN INDEX 2
		sb.append(" 				,?  		    \n"); // COLUMN INDEX 3
		sb.append(" 				,?  		    \n"); // COLUMN INDEX 4
		sb.append(" 				,?  		    \n"); // COLUMN INDEX 5
		sb.append("                 ,'Y'  	        \n");
		sb.append("                 ,sysdate 	    \n");
		sb.append("                 ,sysdate  	    \n"); 
		sb.append(" 			)   				\n");
		
		return sb.toString();
	}
	public static String getBoardUpdateQuery() {
		StringBuffer sb = new StringBuffer();
		
		/*
		 * UPDATE INTO KOS_BOARD ( BNUM,BSUBJECT,BWRITER ,BPW,BMEMO,DELETEYN
		 * ,INSERTDATE,UPDATEDATE) VALUES( '1000','Test','Test BWRITER' ,'Test
		 * BPW','Test BMEMO','Y' ,sysdate,sysdate);
		 * 
		 * 
		 * 
		 */
		sb.append(" UPDATE  KOS_BOARD 				    	\n");
		sb.append(" SET   				    		        \n");
		sb.append(" 				 BSUBJECT  	= ?			\n"); // COLUMN INDEX 1
		sb.append(" 				,BMEMO  	= ?			\n"); // COLUMN INDEX 2
		sb.append("                 ,UPDATEDATE = SYSDATE  	\n"); 
		sb.append("WHERE     1=1							\n");
		sb.append("AND   	 DELETEYN 		= 'Y' 			\n");
		sb.append("AND       BNUM 			= ? 			\n"); // COLUMN INDEX 3
		
		return sb.toString();
	}
	public static String getBoardSelectAllQuery() {
		StringBuffer sb = new StringBuffer();
		
		/*
		 * 
		 * ��ü�÷�( BNUM,BSUBJECT,BWRITER	
           ,BPW,BMEMO,DELETEYN	
           ,INSERTDATE,UPDATEDATE)�� ��ȸ�Ѵ�
		 * 
		 */
		sb.append(" SELECT 					                \n");
		sb.append("       A.BNUM AS BNUM 	                \n");
		sb.append("      ,A.BSUBJECT AS BSUBJECT 	        \n");
		sb.append("      ,A.BWRITER AS BWRITER 	            \n");
		sb.append("      ,A.BPW AS BPW 	                    \n");
		sb.append("      ,A.BMEMO AS BMEMO 	                \n");
		sb.append("      ,A.DELETEYN AS DELETEYN 	        \n");
		sb.append("      ,A.INSERTDATE AS INSERTDATE 	    \n");
		sb.append("      ,A.UPDATEDATE AS UPDATEDATE 	    \n");
		sb.append(" FROM  						            \n");
		sb.append("       KOS_BOARD A         	            \n");
		
		return sb.toString();
	}
	public static String getBoardSelectQuery() {
		StringBuffer sb = new StringBuffer();
		
		/*
		 *  �ش� ������ bnum�� ����
		 *  BNUM,BSUBJECT,BWRITER	
           ,BPW,BMEMO,DELETEYN	
           ,INSERTDATE,UPDATEDATE �÷����� ��ȸ�Ѵ�
		 * 
		 */
		sb.append(" SELECT 				                	\n");
		sb.append("       A.BNUM AS BNUM 	                \n");
		sb.append("      ,A.BSUBJECT AS BSUBJECT 	        \n");
		sb.append("      ,A.BWRITER AS BWRITER 	            \n");
		sb.append("      ,A.BPW AS BPW 	                    \n");
		sb.append("      ,A.BMEMO AS BMEMO 	                \n");
		sb.append("      ,A.DELETEYN AS DELETEYN 	        \n");
		sb.append("      ,A.INSERTDATE AS INSERTDATE 	    \n");
		sb.append("      ,A.UPDATEDATE AS UPDATEDATE 	    \n");
		sb.append(" FROM  						            \n");
		sb.append("       KOS_BOARD A         	            \n");
		sb.append("       where  A.BNUM = ?     	        \n");
		
		return sb.toString();
	}

	// ���� 
	public static String getBoardDeleteQuery() {
		/*
    	Ư������: ���� �̷� �÷��� 'Y'����'N'�� �ٲ۴�
    	�۹�ȣ �� ã�Ƽ� �����Ѵ�
		 */
		StringBuffer sb = new StringBuffer();
		sb.append("UPDATE    KOS_BOARD 					\n");
		sb.append("SET       DELETEYN       = 'N'  		\n"); 			
		sb.append("         ,UPDATEDATE  	= SYSDATE 	\n");
		sb.append("WHERE     1=1						\n");
		sb.append("AND   	 DELETEYN 		= 'Y' 		\n");
		sb.append("AND       BNUM 			= ? 		\n"); // ? parameterIndex 1��
		
		return sb.toString();
	};
}
