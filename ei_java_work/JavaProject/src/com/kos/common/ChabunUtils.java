package com.kos.common;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.kos.mem.sql.MemberSqlMap;

public class ChabunUtils {

	public static final String BIZ_GUBUN_MEMBER = "M"; // 일반 회원 구분
	public static final String BIZ_GUBUN_G_BOARD = "GB";
	public static final String BIZ_GUBUN_M_BOARD = "MB";
	
	public static String numPad(String c) {
		// 문자열형태의 숫자를 앞에 자신를 포함한 네자리를 빈공간에
		// "0"를 넣어준다 예) 43 --> 0043 
		for (int i=c.length(); i < 4; i++) {
			c = "0" + c;
		}
		// new SimpleDateFormat("yyyyMMdd").format(new Date());
		//DateFormatUtil를 통해 날짜 데이타 를 생성하고 yyyyMMdd 날짜형식으로 
		//변환하여 최상위부모 클래스Object의 concat 함수 호출하여  문자열 날짜 와 numPad함수로  만들어진 숫자형식 문자열(0001)를 붙인다
		return DateFormatUtil.ymdFormat().concat(c);
	}
	public static String numLPad(String c) {
		// 문자열형태의 숫자를 앞에 자신를 포함한 네자리를 빈공간에
		// "0"를 넣어준다 예) 43 --> 0043 
		for (int i=c.length(); i < 4; i++) {
			c = "0" + c;
		}
		return c;
	}
	//DB서버에서 채번만드는 쿼리 로 요청해서
	// common 컬럼에 있는튜플를 문자열로 받아온다
	public static String getMemChabun() {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rsRs = null;
		String common = "";
		
		try {
			conn = KosConnectivity.getConnection();
//			String sql = MemberSqlMap.chabun_query[MemberSqlMap.CHABUN_MEMBER];
			String sql = MemberSqlMap.chabun_query[MemberSqlMap.CHABUN_MEMBER_1];
//			String sql = MemberSqlMap.chabun_query[0];
			pstmt = conn.prepareStatement(sql);
			System.out.println("Member 채번 전체 쿼리 >>> : \n" + sql);			
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
		
		//return BIZ_GUBUN_MEMBER.concat(ChabunUtils.numPad(common)); //M + 날짜형식 20230330 +숫자형식(예:0009)  
//		return ChabunUtils.numPad(common); //날짜형식 20230330 +숫자형식(예:0009)  
		return ChabunUtils.numLPad(common); //날짜형식 20230330 +숫자형식(예:0009)  
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mno = ChabunUtils.getMemChabun();
		System.out.println("mno >>> : " + mno);
	}

}
