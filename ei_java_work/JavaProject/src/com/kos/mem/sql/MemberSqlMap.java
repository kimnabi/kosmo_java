package com.kos.mem.sql;

public class MemberSqlMap {
	
	public static final int  CHABUN_MEMBER = 0;
	public static final int  CHABUN_MEMBER_1 = 1;
	//public static final int  CHABUN_MEMBER2 = 1 ;
//	public static final String[] chabun_query = null;
	private static String sql = "SELECT /*+ INDEX_DESC(A SYS_C0010821) */* NVL(MAX(SUBSTR(A.MNO,-4)),0) +1 AS COMMON FROM KOS_MEMBER A"; 
	// 채번번호를 자리수를 제거한 숫자를 COMMON 컬럼으로 나타낸다 예) 0006
	private static String sql1 = "SELECT /*+ INDEX_DESC(A SYS_C0010821) */"
			+"  LPAD(NVL(MAX(SUBSTR(A.MNO,-4)),0),4) +1 AS COMMON"
			+"  FROM KOS_MEMBER A"; // 채번번호를 자리수를 제거한 숫자를 COMMON 컬럼으로 나타낸다 예) 6
	public static String[] chabun_query = {sql, sql1};	
	

		
	

	public static String getMemInsertQuery() {
		StringBuffer sb = new StringBuffer();
		sb.append("insert into KOS_MEMBER (   \n");	
		sb.append("	     MNO                  \n");
	    sb.append("		,MID	              \n");
		sb.append("	    ,MPW                  \n");
		sb.append("	    ,MNAME	              \n");
	    sb.append("		,MHP	              \n");
	    sb.append("		,MEMAIL               \n");
	    sb.append("		,MADDR	              \n");
	    sb.append("	    ,DELETEYN	          \n");
	    sb.append("     ,INSERTDATE	          \n");
	    sb.append("     ,UPDATEDATE           \n");
	    sb.append("	) VALUES (                \n");
	    sb.append("	 ?                        \n");
	    sb.append(" ,?                        \n");
	    sb.append(" ,?                        \n");
	    sb.append(" ,?                        \n");
	    sb.append(" ,?                        \n");
	    sb.append(" ,?                        \n");
	    sb.append(" ,?                        \n");
	    sb.append(" ,'Y'                      \n");//잊지말자
	    sb.append("	,sysdate                  \n");
	    sb.append("	,sysdate            )     \n");
			
		return sb.toString();
		
	}
	public static String getMemSelectAllQuery() {
	StringBuffer sb = new StringBuffer();
		
		/*
		 * 
		 * 전체컬럼( BNUM,BSUBJECT,BWRITER	
           ,BPW,BMEMO,DELETEYN	
           ,INSERTDATE,UPDATEDATE)을 조회한다
		 * 
		 */
		sb.append(" SELECT 					                \n");
		sb.append("       A.MNO AS MNO 	                    \n");
		sb.append("      ,A.MID AS MID 	                    \n");
		sb.append("      ,A.MPW AS MPW 	                    \n");
		sb.append("      ,A.MNAME AS BNAME  	            \n");
		sb.append("      ,A.MHP AS MHP 	                    \n");
		sb.append("      ,A.MEMAIL AS MEMAIL 	            \n");
		sb.append("      ,A.MADDR AS MADDR 	                \n");
		sb.append("      ,A.DELETEYN AS DELETEYN 	        \n");
		sb.append("      ,A.INSERTDATE AS INSERTDATE 	    \n");
		sb.append("      ,A.UPDATEDATE AS UPDATEDATE 	    \n");
		sb.append(" FROM  						            \n");
		sb.append("       KOS_MEMBER A         	            \n");
		
		return sb.toString();
		
	}//end getMemSelectAllQuery()
	public static String getMemSelectQuery() {
		StringBuffer sb = new StringBuffer();
		sb.append(" SELECT 					                \n");
		sb.append("       A.MNO AS MNO 	                    \n");
		sb.append("      ,A.MID AS MID 	                    \n");
		sb.append("      ,A.MPW AS MPW 	                    \n");
		sb.append("      ,A.MNAME AS BNAME  	            \n");
		sb.append("      ,A.MHP AS MHP 	                    \n");
		sb.append("      ,A.MEMAIL AS MEMAIL 	            \n");
		sb.append("      ,A.DELETEYN AS DELETEYN 	        \n");
		sb.append("      ,A.INSERTDATE AS INSERTDATE 	    \n");
		sb.append("      ,A.UPDATEDATE AS UPDATEDATE 	    \n");
		sb.append(" FROM  						            \n");
		sb.append("       KOS_MEMBER A         	            \n");
		sb.append(" WHERE A.MNO = ?        	                \n");
		return sb.toString();
		
	}//end getMemSelectQuery()
	
	public static String getMemDeleteQuery() {
		StringBuffer sb = new StringBuffer();
		
		sb.append("	UPDATE  KOS_MEMBER 					\n");	
		sb.append("	SET  	DELETEYN 		=  'N'		\n"); // parameterIndex 2	
		sb.append("			,UPDATEDATE 	= SYSDATE 	\n"); 	
		sb.append("WHERE     1=1						\n");
		sb.append("AND   	 DELETEYN 		= 'Y' 		\n");
		sb.append("AND       MNO			= ? 		\n");
		return sb.toString();
		
	}
	public static String getMemUpdateQuery() {
		StringBuffer sb = new StringBuffer();
		
		sb.append(" UPDATE  KOS_MEMBER 				    	\n");
		sb.append(" SET   				    		        \n");
		sb.append("			 MEMAIL 		= ? 		    \n"); // parameterIndex 1		
		sb.append("			,MADDR 			= ? 		    \n"); // parameterIndex 2	
		sb.append("			,UPDATEDATE 	= SYSDATE 	    \n"); 	
		sb.append("WHERE     1=1							\n");
		sb.append("AND   	 DELETEYN 		= 'Y' 			\n");
		sb.append("AND       MNO 			= ? 			\n"); // COLUMN INDEX 3
		return sb.toString();
		
	}
}
