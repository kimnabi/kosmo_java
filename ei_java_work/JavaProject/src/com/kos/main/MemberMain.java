package com.kos.main;

import java.util.ArrayList;
import java.util.Scanner;
import com.kos.mem.dao.MemberDAO;
import com.kos.mem.dao.MemberDAOImpl;
import com.kos.mem.vo.MemberVO;

public class MemberMain {

	public static void main(String[] args) {
		//	MemberInfoView MView = new MemberInfoView();
		//	MView.menuLoop();
		System.out.println("MemberMain.main() 함수 진입 성공 >>> : ");
		
		// Scanner 클래스를 이용해서 입력 데이터를 받고
		System.out.println("ISUD TYPE을 입력 하시오 >>> : ");
		Scanner sc = new Scanner(System.in);
		String isudType = sc.next();
		isudType = isudType.toUpperCase();
		// 문자열 하나를 입력 받아 "I"와 같은 문자면  if 절이 실행한다
		if("SALL".equals(isudType)) {
			System.out.println("글 목록전체을 출력합니다 >>> : ");
			ArrayList<MemberVO> resList = null;
			MemberDAO test = null;
			test = new MemberDAOImpl();
			resList = test.memSelectAll();
			System.out.println(">>>>>>>>>>>>>>>>>>>>>>>"+resList);
			for(MemberVO mvo : resList) {
			    System.out.println(">>>>>>>>>>>>>>>>>>>>>>>"+mvo.getMname());
			}
	    } //end if
		if("S".equals(isudType)) {
			
			System.out.println("글 목록중  글번호 하나 를입력하세요 >>> : ");
			String num=sc.next();
			MemberVO res = null;
				MemberDAO test = null;
				test = new MemberDAOImpl();
				res = test.memSelect(num);
				System.out.println(res);
		}// end if
		if ("I".equals(isudType)) {
			
			MemberVO mvo = new MemberVO();
			System.out.println("데이터를 입력하시오");
//			Scanner sc_i = new Scanner(System.in);
//			System.out.println("회원번호를 입력하시오 >>> : ");
//			mno = sc_i.next();
			//mno = ch
			System.out.println("아이디를 입력하시오 >>> : ");
			mvo.setMid(sc.next());
			System.out.println("비밀번호를 입력하시오 >>> : ");
			mvo.setMpw(sc.next());
			System.out.println("이름을 입력하시오 >>> : ");
			mvo.setMname(sc.next());
			System.out.println("핸드폰번호를 입력하시오 >>> : ");
			mvo.setMhp(sc.next());
			System.out.println("이메일을 입력하시오 >>> : ");
			mvo.setMemail(sc.next());
			System.out.println("주소를 입력하시오 >>> : ");
			mvo.setMaddr(sc.next());
			//mvo = new MemberVO("1", mid, mname, mhp, memail, maddr, 'N',"sysdate", "sysdate");		
			MemberDAO test = null;
			test = new MemberDAOImpl();
			int qRes = test.memInsert(mvo);
			if(qRes == 1) {
				System.out.println("MemberMain main() : >>> "+qRes);
			} else {
				System.err.println("MemberMain main() : >>> 입력실패");
			}
			
		} //end   "I".equals(isudType)
		if ("U".equals(isudType)) {
			
			MemberVO mvo = new MemberVO();
			System.out.println("데이터를 입력하시오");
//			Scanner sc_i = new Scanner(System.in);
			System.out.println("회원번호를 입력하시오 >>> : ");
			mvo.setMno(sc.next());

			System.out.println("이메일을 입력하시오 >>> : ");
			mvo.setMemail(sc.next());
			System.out.println("주소를 입력하시오 >>> : ");
			mvo.setMaddr(sc.next());
			//mvo = new MemberVO("1", mid, mname, mhp, memail, maddr, 'N',"sysdate", "sysdate");		
			MemberDAO test = null;
			test = new MemberDAOImpl();
			int qRes = test.memUpdate(mvo);
			if(qRes == 1) {
				System.out.println("MemberMain main() : >>> "+qRes);
			} else {
				System.err.println("MemberMain main() : >>> 입력실패");
			}
			
		} //end   "I".equals(isudType)
		if ("D".equals(isudType)) {
			System.out.println("글 목록중  삭제할 글번호 하나 를입력하세요 >>> : ");
			String num=sc.next();

			MemberDAO test = null;
			test = new MemberDAOImpl();
			int qRes = test.memDelete(num);
			if(qRes == 1) {
				System.out.println("MemberMain main() : >>> "+qRes);
			} else {
				System.err.println("MemberMain main() : >>> 입력실패");
			}
		}//end   "D".equals(isudType)
		sc.close();
	} //end main

}
