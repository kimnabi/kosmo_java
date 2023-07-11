package a.b.c.com.kos.common;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import a.b.c.com.kos.mem.sql.MemberSqlMap;

public class ChabunUtils {

	public static final String BIZ_GUBUN_MEMBER = "M";
	public static final String BIZ_GUBUN_G_BOARD = "GB";
	public static final String BIZ_GUBUN_M_BOARD = "MB";
	
	public static String numPad(String c) {
			
		for (int i=c.length(); i < 4; i++) {
			c = "0" + c;
		}			
		return c;
	}

	public static String getMemChabun() {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rsRs = null;
		String common = "";
		
		try {
			conn = KosConnectivity.getConnection();
			String sql = MemberSqlMap.chabun_query[MemberSqlMap.CHABUN_MEMBER_0];
//			String sql = MemberSqlMap.chabun_query[0];
			pstmt = conn.prepareStatement(sql);
			System.out.println("Member 채번 >>> : \n" + sql);			
			rsRs = pstmt.executeQuery();
			
			if (rsRs !=null) {
				while(rsRs.next()) {
					common = rsRs.getNString("COMMON");
					System.out.println("common >>> : " + common);		
				}
			}
		}catch(Exception e) {
			System.out.println("채번 쿼리 수행 중 에러가 >>> : " + e);			
		}		
		
		return 	BIZ_GUBUN_MEMBER
				.concat(DateFormatUtil.ymdFormat())
				.concat(ChabunUtils.numPad(common));
	}
	
	public static String getMemLpadChabun() {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rsRs = null;
		String common = "";
		
		try {
			conn = KosConnectivity.getConnection();
			String sql = MemberSqlMap.chabun_query[MemberSqlMap.CHABUN_MEMBER_1];
			pstmt = conn.prepareStatement(sql);
			System.out.println("Member LPAD 채번 >>> : \n" + sql);			
			rsRs = pstmt.executeQuery();
			
			if (rsRs !=null) {
				while(rsRs.next()) {
					common = rsRs.getNString("COMMON");
					System.out.println("common >>> : " + common);		
				}
			}
		}catch(Exception e) {
			System.out.println("채번 쿼리 수행 중 에러가 >>> : " + e);			
		}		
		
		return 	BIZ_GUBUN_MEMBER
				.concat(DateFormatUtil.ymdFormat())
				.concat(common);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mno = ChabunUtils.getMemChabun();
		System.out.println("mno >>> : " + mno);
		String mno_1 = ChabunUtils.getMemLpadChabun();
		System.out.println("mno_1 >>> : " + mno_1);
	}

}
