package a.b.c.com.kos.mem.sql;

public abstract class MemberSqlMap {
	
	public static final short CHABUN_MEMBER_0 = 0;
	public static final short CHABUN_MEMBER_1 = 1;
	
	public static String[] chabun_query = {
		"SELECT  /*+ INDEX_DESC(A SYS_C0011098) */ NVL(MAX(SUBSTR(A.MNO, -4)), 0) + 1 AS COMMON FROM KOS_MEMBER A",
		"SELECT  /*+ INDEX_DESC(A SYS_C0011098) */ LPAD(NVL(MAX(SUBSTR(A.MNO, -4)), 0) + 1, 4, 0) AS COMMON FROM KOS_MEMBER A"
	};
	
	
	public static String getMemInsertQuery(){
		
		StringBuffer sb = new StringBuffer();			
		sb.append("	INSERT INTO 						\n");	
		sb.append("		KOS_MEMBER 				    	\n");
		sb.append("		          (			    		\n");
		sb.append("      			 MNO 				\n"); // COLUMN INDEX 1	
		sb.append("					,MID 				\n"); // COLUMN INDEX 2
	    sb.append("					,MPW   				\n"); // COLUMN INDEX 3
	    sb.append("					,MNAME 				\n"); // COLUMN INDEX 4	
	    sb.append("					,MHP 				\n"); // COLUMN INDEX 5	 
	    sb.append("					,MEMAIL 			\n"); // COLUMN INDEX 6		    	   
		sb.append("					,MADDR 				\n"); // COLUMN INDEX 7		
	    sb.append("					,DELETEYN   		\n"); // COLUMN INDEX 8
	    sb.append("					,INSERTDATE 		\n"); // COLUMN INDEX 9
	    sb.append("					,UPDATEDATE 		\n"); // COLUMN INDEX 10	    
		sb.append("			      )						\n");
		sb.append("	       VALUES   					\n");
		sb.append("	       		 (  					\n");
		sb.append("     				 ? 				\n"); // parameterIndex 1
		sb.append("						,? 				\n"); // parameterIndex 2
	    sb.append("						,?   			\n"); // parameterIndex 3
	    sb.append("						,?   			\n"); // parameterIndex 4
	    sb.append("						,? 				\n"); // parameterIndex 5
	    sb.append("						,? 				\n"); // parameterIndex 6
	    sb.append("						,?				\n"); // parameterIndex 7
	    sb.append("						,'Y'			\n"); // DELETEYN : Y
	    sb.append("						,SYSDATE		\n"); // INSERTDATE : SYSDATE
	    sb.append("						,SYSDATE   		\n"); // UPDATEDATE : SYSDATE	    		  
		sb.append("	              )						\n");		
		
		return sb.toString();
	}

	public static String getMemSelectAllQuery(){
		
		
		StringBuffer sb = new StringBuffer();
		sb.append(" SELECT 										\n");
		sb.append("     	 A.MNO 				MNO 			\n"); // COLUMN INDEX 1	
		sb.append("			,A.MID  			MID 			\n"); // COLUMN INDEX 2
	    sb.append("			,A.MPW  			MPW   			\n"); // COLUMN INDEX 3
	    sb.append("			,A.MNAME  			MNAME 			\n"); // COLUMN INDEX 4
	    sb.append("			,A.MHP  			MHP 			\n"); // COLUMN INDEX 5	    
	    sb.append("			,A.MEMAIL  			MEMAIL 			\n"); // COLUMN INDEX 6		    	   
		sb.append("			,A.MADDR  			MADDR 			\n"); // COLUMN INDEX 7		
	    sb.append("			,A.DELETEYN  		DELETEYN   		\n"); // COLUMN INDEX 8
	    sb.append("			,A.INSERTDATE  		INSERTDATE 		\n"); // COLUMN INDEX 9
	    sb.append("			,A.UPDATEDATE  		UPDATEDATE 		\n"); // COLUMN INDEX 10	    
	    sb.append("	FROM 										\n");
	    sb.append("		 	KOS_MEMBER A 						\n");
	    sb.append( " WHERE 	1=1 								\n");
		sb.append( " AND   	A.DELETEYN = 'Y' 					\n");
		sb.append( " ORDER BY 1         						\n");	
		
		return sb.toString();
	}
	
	
	public static String getMemSelectQuery(){
		
		
		StringBuffer sb = new StringBuffer();
		sb.append(" SELECT 										\n");
		sb.append("     	 A.MNO 				MNO 			\n"); // COLUMN INDEX 1	
		sb.append("			,A.MID  			MID 			\n"); // COLUMN INDEX 2
	    sb.append("			,A.MPW  			MPW   			\n"); // COLUMN INDEX 3
	    sb.append("			,A.MNAME  			MNAME 			\n"); // COLUMN INDEX 4
	    sb.append("			,A.MHP  			MHP 			\n"); // COLUMN INDEX 5	    
	    sb.append("			,A.MEMAIL  			MEMAIL 			\n"); // COLUMN INDEX 6		    	   
		sb.append("			,A.MADDR  			MADDR 			\n"); // COLUMN INDEX 7		
	    sb.append("			,A.DELETEYN  		DELETEYN   		\n"); // COLUMN INDEX 8
	    sb.append("			,A.INSERTDATE  		INSERTDATE 		\n"); // COLUMN INDEX 9
	    sb.append("			,A.UPDATEDATE  		UPDATEDATE 		\n"); // COLUMN INDEX 10	    
	    sb.append("	FROM 										\n");
	    sb.append("		 	KOS_MEMBER A 						\n");
	    sb.append( " WHERE 	1=1 								\n");
		sb.append( " AND   	A.DELETEYN  = 'Y' 					\n");
		sb.append( " AND   	A.MNO		= ? 					\n"); // parameterIndex 1
		sb.append( " ORDER BY 1         						\n");	
		
		return sb.toString();
	}
	
	public static String getMemUpdateQuery(){
		
		StringBuffer sb = new StringBuffer();			
		sb.append("	UPDATE  							\n");	
		sb.append("		   	 KOS_MEMBER 			    \n");	
		sb.append("	SET  								\n");	
		sb.append("			 MEMAIL 		= ? 		\n"); // parameterIndex 1		
		sb.append("			,MADDR 			= ? 		\n"); // parameterIndex 2	
		sb.append("			,UPDATEDATE 	= SYSDATE 	\n"); 	
		sb.append("	WHERE  	 MNO 			= ?			\n"); // parameterIndex 3
		sb.append("	AND  	 DELETEYN  		= 'Y'		\n"); 
								
		return sb.toString();
	}

}
