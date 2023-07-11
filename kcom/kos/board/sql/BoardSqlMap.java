package a.b.c.com.kos.board.sql;

public abstract class BoardSqlMap {
	
	public static String getBoardInsertQuery() {
		
		StringBuffer sb = new StringBuffer();
		sb.append(" INSERT INTO 					\n");
		sb.append("   KOS_BOARD 					\n");
		sb.append(" 			(   				\n");
		sb.append(" 				 BNUM  			\n"); // COLUMN INDEX 1
		sb.append(" 				,BSUBJECT  		\n"); // COLUMN INDEX 2
		sb.append(" 				,BWRITER  		\n"); // COLUMN INDEX 3
		sb.append(" 				,BPW  			\n"); // COLUMN INDEX 4
		sb.append(" 				,BMEMO  	    \n"); // COLUMN INDEX 5
		sb.append(" 				,DELETEYN  		\n"); // COLUMN INDEX 6
		sb.append(" 				,INSERTDATE  	\n"); // COLUMN INDEX 7
		sb.append(" 				,UPDATEDATE  	\n"); // COLUMN INDEX 8	
		sb.append(" 			)   				\n");
		sb.append(" 	 VALUES   					\n");
		sb.append(" 			(   				\n"); 
		sb.append(" 				 ?  			\n"); // parameterIndex 1
		sb.append(" 				,?  			\n"); // parameterIndex 2
		sb.append(" 				,?  			\n"); // parameterIndex 3
		sb.append(" 				,?  			\n"); // parameterIndex 4
		sb.append(" 				,?  	    	\n"); // parameterIndex 5
		sb.append(" 				,'Y'  			\n"); // Y
		sb.append(" 				,SYSDATE  		\n"); // SYSDATE
		sb.append(" 				,SYSDATE  		\n"); // SYSDATE
		sb.append(" 			)   				\n");
		
		return sb.toString();		
	}
	
	// 전체 조회 
	public static String getBoardSelectAllQuery() {
			
		StringBuffer sb = new StringBuffer();
		sb.append( " SELECT 							\n");
		sb.append( "       A.BNUM 		AS BNUM 		\n");
		sb.append( "      ,A.BSUBJECT 	AS BSUBJECT 	\n");
		sb.append( "      ,A.BWRITER 	AS BWRITER 		\n");
		sb.append( "      ,A.BPW 		AS BPW 			\n");
		sb.append( "      ,A.BMEMO 		AS BMEMO 		\n");
		sb.append( "      ,A.DELETEYN  	AS DELETEYN 	\n");
		sb.append( "      ,TO_CHAR(A.INSERTDATE, 'YYYY-MM-DD') AS INSERTDATE 	\n");
		sb.append( "      ,TO_CHAR(A.UPDATEDATE, 'YYYY-MM-DD') AS UPDATEDATE 	\n");					
		sb.append( " FROM  								\n");
		sb.append( "       KOS_BOARD A         			\n");
		sb.append( " WHERE 1=1 							\n");
		sb.append( " AND   A.DELETEYN = 'Y' 			\n");
		sb.append( " ORDER BY 1         				\n");		
		
		return sb.toString();
	}
	
	// 조건 조회
	public static String getBoardSelectQuery() {
		
		StringBuffer sb = new StringBuffer();
		sb.append( " SELECT 							\n");
		sb.append( "       A.BNUM 		AS BNUM 		\n");
		sb.append( "      ,A.BSUBJECT 	AS BSUBJECT 	\n");
		sb.append( "      ,A.BWRITER 	AS BWRITER 		\n");
		sb.append( "      ,A.BPW 		AS BPW 			\n");
		sb.append( "      ,A.BMEMO 		AS BMEMO 		\n");
		sb.append( "      ,A.DELETEYN  	AS DELETEYN 	\n");
		sb.append( "      ,TO_CHAR(A.INSERTDATE, 'YYYY-MM-DD') AS INSERTDATE 	\n");
		sb.append( "      ,TO_CHAR(A.UPDATEDATE, 'YYYY-MM-DD') AS UPDATEDATE 	\n");					
		sb.append( " FROM  								\n");
		sb.append( "       KOS_BOARD A         			\n");
		sb.append( " WHERE 1=1 							\n");
		sb.append( " AND   A.DELETEYN = 'Y' 			\n");
		sb.append( " AND   A.BNUM     =  ? 				\n");
		sb.append( " ORDER BY 1         				\n");		
		
		return sb.toString();
	}
	
	// 수정 
	public static String getBoardUpdateQuery() {
		
		StringBuffer sb = new StringBuffer();
		sb.append("UPDATE    KOS_BOARD 					\n");
		sb.append("SET       BMEMO 			= ?  		\n"); // ? parameterIndex 1번			
		sb.append("         ,UPDATEDATE  	= SYSDATE 	\n");
		sb.append("WHERE     1=1						\n");
		sb.append("AND   	 DELETEYN 		= 'Y' 		\n");
		sb.append("AND       BNUM 			= ? 		\n"); // ? parameterIndex 2번
			
		return sb.toString();
	}
	
	// 삭제 
	public static String getBoardDeleteQuery() {
		
		StringBuffer sb = new StringBuffer();
		sb.append("UPDATE    KOS_BOARD 					\n");
		sb.append("SET       DELETEYN       = 'N'  		\n"); 			
		sb.append("         ,UPDATEDATE  	= SYSDATE 	\n");
		sb.append("WHERE     1=1						\n");
		sb.append("AND   	 DELETEYN 		= 'Y' 		\n");
		sb.append("AND       BNUM 			= ? 		\n"); // ? parameterIndex 1번
		
		return sb.toString();
	};
}





















