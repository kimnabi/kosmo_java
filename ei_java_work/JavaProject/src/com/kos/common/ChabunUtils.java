package com.kos.common;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.kos.mem.sql.MemberSqlMap;

public class ChabunUtils {

	public static final String BIZ_GUBUN_MEMBER = "M"; // �Ϲ� ȸ�� ����
	public static final String BIZ_GUBUN_G_BOARD = "GB";
	public static final String BIZ_GUBUN_M_BOARD = "MB";
	
	public static String numPad(String c) {
		// ���ڿ������� ���ڸ� �տ� �ڽŸ� ������ ���ڸ��� �������
		// "0"�� �־��ش� ��) 43 --> 0043 
		for (int i=c.length(); i < 4; i++) {
			c = "0" + c;
		}
		// new SimpleDateFormat("yyyyMMdd").format(new Date());
		//DateFormatUtil�� ���� ��¥ ����Ÿ �� �����ϰ� yyyyMMdd ��¥�������� 
		//��ȯ�Ͽ� �ֻ����θ� Ŭ����Object�� concat �Լ� ȣ���Ͽ�  ���ڿ� ��¥ �� numPad�Լ���  ������� �������� ���ڿ�(0001)�� ���δ�
		return DateFormatUtil.ymdFormat().concat(c);
	}
	public static String numLPad(String c) {
		// ���ڿ������� ���ڸ� �տ� �ڽŸ� ������ ���ڸ��� �������
		// "0"�� �־��ش� ��) 43 --> 0043 
		for (int i=c.length(); i < 4; i++) {
			c = "0" + c;
		}
		return c;
	}
	//DB�������� ä������� ���� �� ��û�ؼ�
	// common �÷��� �ִ�Ʃ�ø� ���ڿ��� �޾ƿ´�
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
			System.out.println("Member ä�� ��ü ���� >>> : \n" + sql);			
			rsRs = pstmt.executeQuery();
			
			if (rsRs !=null) {
				while(rsRs.next()) {
					common = rsRs.getNString("COMMON");
					System.out.println("common >>> : " + common);		
				}
			}
		}catch(Exception e) {
			System.out.println("ä�� ���� ���� �� ������ >>> : " + e);			
		}		
		
		//return BIZ_GUBUN_MEMBER.concat(ChabunUtils.numPad(common)); //M + ��¥���� 20230330 +��������(��:0009)  
//		return ChabunUtils.numPad(common); //��¥���� 20230330 +��������(��:0009)  
		return ChabunUtils.numLPad(common); //��¥���� 20230330 +��������(��:0009)  
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String mno = ChabunUtils.getMemChabun();
		System.out.println("mno >>> : " + mno);
	}

}
