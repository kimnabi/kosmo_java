package a.b.c.com.kosmem.common;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

import a.b.c.kos.mem.sql.MemQueryMap;



public class ChabunUtils {
	
	private static Logger log = LoggerFactory.getLogger(ChabunUtils.class);
	public static final String BIZ_GUBUN_MEMBER = "M"; // 
	public static final String BIZ_GUBUN_G_BOARD = "GB";
	public static final String BIZ_GUBUN_M_BOARD = "MB";
	
	public static String numPad(String c) {
		// 
		// "0" ־��ش� ��) 43 --> 0043 
		for (int i=c.length(); i < 4; i++) {
			c = "0" + c;
		}
		
		return DateFormatUtil.ymdFormat().concat(c);
	}
	public static String numLPad(String c) {
	
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
            
			String sql = MemQueryMap.chabun_query[MemQueryMap.CHABUN_MEMBER_1];
			//세션 있는지 여부에따라 아래의쿼리문은 테이블 데이타가 있을경우 쓴다
			//String sql = KosmoBoardSqlMap.chabun_query[KosmoBoardSqlMap.CHABUN_MEMBER_2];
//			String sql = MemberSqlMap.chabun_query[0];
			pstmt = conn.prepareStatement(sql);
			log.debug("pstmt >>> {}",pstmt);
			rsRs = pstmt.executeQuery();
			log.debug("rsRs >>> {}",rsRs);
			
			if (rsRs !=null) {
				log.debug("if(rsRs !=null) 블록진입 ");
				while(rsRs.next()) {
					common = rsRs.getNString("COMMON");// 컬럼명 오타 주의하자
					log.debug("common >>> : {}" , common);
					//System.out.println("common >>> : " + common);		
				}
			}
		}catch(Exception e) {
			e.printStackTrace();			
		}		
		String chnum =BIZ_GUBUN_MEMBER.concat(ChabunUtils.numPad(common));
		log.debug("return BIZ_GUBUN_MEMBER.concat(ChabunUtils.numPad(common))>>> : {}" , chnum);
		return chnum; //채번 숫자형식이 M + 20230330 +0009  
//		return ChabunUtils.numPad(common); //채번 숫자형식이 20230330 + 0009  
	//	return ChabunUtils.numLPad(common); //채번 숫자형식이 0001로 포매팅한다 
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String kno = ChabunUtils.getMemChabun();
		System.out.println("mno >>> : " + kno);
	}

}
