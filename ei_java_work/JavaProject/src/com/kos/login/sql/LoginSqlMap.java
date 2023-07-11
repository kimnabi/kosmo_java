package com.kos.login.sql;

public class LoginSqlMap {
	
	public static String getLoginCheckQuery() {
		
		StringBuffer sb = new StringBuffer();
		sb.append(" SELECT 										\n");
		sb.append("     	 A.MID 				MID 			\n"); // COLUMN INDEX 1	
		sb.append("			,A.MPW  			MPW 			\n"); // COLUMN INDEX 2	
	    sb.append("	FROM 										\n");
	    sb.append("		 	KOS_MEMBER A 						\n");
	    sb.append( " WHERE 	1=1 								\n");
		sb.append( " AND   	A.DELETEYN  = 'Y' 					\n");
		sb.append( " AND   	A.MID		= ? 					\n"); // parameterIndex 1
		sb.append( " AND   	A.MPW		= ? 					\n"); // parameterIndex 2		
		
		return sb.toString();
	} // end getLoginCheckQuery()
	
public static String getLoginResultQuery() {
		
		StringBuffer sb = new StringBuffer();
		sb.append(" SELECT 										\n");
		sb.append("       A.MNO AS MNO 	                    	\n");
		sb.append("      ,A.MID AS MID 	                    	\n");
		sb.append("      ,A.MPW AS MPW 	                   		\n");
		sb.append("      ,A.MNAME AS BNAME  	                \n");
		sb.append("      ,A.MHP AS MHP 	                        \n");
		sb.append("      ,A.MEMAIL AS MEMAIL 	                \n");
		sb.append("      ,A.MADDR AS MADDR 	                    \n");
		sb.append("      ,A.DELETEYN AS DELETEYN 	            \n");
		sb.append("      ,A.INSERTDATE AS INSERTDATE 	        \n");
		sb.append("      ,A.UPDATEDATE AS UPDATEDATE 	        \n");
	    sb.append("	FROM 										\n");
	    sb.append("		 	KOS_MEMBER A 						\n");
	    sb.append( " WHERE 	1=1 								\n");
		sb.append( " AND   	A.DELETEYN  = 'Y' 					\n");
		sb.append( " AND   	A.MID		= ? 					\n"); // parameterIndex 1
		sb.append( " AND   	A.MPW		= ? 					\n"); // parameterIndex 2		
		
		return sb.toString();
	} // end getLoginResultQuery()

}
