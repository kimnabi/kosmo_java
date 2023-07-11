package a.b.c.com.kos.main;

import java.util.ArrayList;
import java.util.Scanner;

import a.b.c.com.kos.common.ChabunUtils;
import a.b.c.com.kos.mem.dao.MemberDAO;
import a.b.c.com.kos.mem.dao.MemberDAOImpl;
import a.b.c.com.kos.mem.vo.MemberVO;

public class MemberMain {
	
	// 입력 
	public int memInsert(	String mid, 
							String mpw, 
							String mname, 
							String mhp,
							String memail,
							String maddr) {		
		System.out.println("MemberMain.memInsert() 함수 진입 성공 >>> : ");		
		System.out.println("mid >>> : " 		+ mid);
		System.out.println("mpw >>> : " 		+ mpw);
		System.out.println("mname >>> : " 		+ mname);
		System.out.println("mhp >>> : " 		+ mhp);
		System.out.println("memail >>> : " 		+ memail);
		System.out.println("maddr >>> : " 		+ maddr);		
		
		MemberVO mvo = null;
		mvo = new MemberVO();
		
//		String mno = ChabunUtils.getMemChabun();
		String mno = ChabunUtils.getMemLpadChabun();
		mvo.setMno(mno);
		mvo.setMid(mid);
		mvo.setMpw(mpw);
		mvo.setMname(mname);
		mvo.setMhp(mhp);
		mvo.setMemail(memail);
		mvo.setMaddr(maddr);
		
		MemberDAO mdao = new MemberDAOImpl();
		int nCnt = mdao.memInsert(mvo);
		
		return nCnt;
	}	
	
	// 전체조회 함수
	public ArrayList<MemberVO> memSelectAll() {
		System.out.println("MemberMain.memSelectAll() 함수 진입 성공 >>> : ");	
		
		MemberDAO mdao = new MemberDAOImpl();;
		ArrayList<MemberVO> aList = mdao.memSelectAll();
		
		return aList;
	}
	
	// 조건조회 함수
	public ArrayList<MemberVO> memSelect(String mno) {
		System.out.println("MemberMain.memSelect() 함수 진입 성공 >>> : ");
		System.out.println("mno >>> : " 		+ mno);
		
		MemberVO mvo = null;
		mvo = new MemberVO();
		mvo.setMno(mno);
		
		MemberDAO mdao = new MemberDAOImpl();;
		ArrayList<MemberVO> aList = mdao.memSelect(mvo);
		
		return aList;
	}
	
	// 수정
	public int memUpdate(	String mno, 
							String memail, 
							String maddr) {
		System.out.println("MemberMain.memUpdate() 함수 진입 성공 >>> : ");
		System.out.println("mno >>> : " 		+ mno);		
		System.out.println("memail >>> : " 		+ memail);
		System.out.println("maddr >>> : " 		+ maddr);
		
		MemberVO mvo = null;
		mvo = new MemberVO();
		mvo.setMno(mno);
		mvo.setMemail(memail);
		mvo.setMaddr(maddr);		
		
		MemberDAO mdao = new MemberDAOImpl();;
		int nCnt = mdao.memUpdate(mvo);
		
		return nCnt;
	}	
		
	public static void memberPrint(ArrayList<MemberVO> aList) {
		System.out.println("::: MemberMain.memberPrint() 함수 진입 성공 >>> : ");
		
		if (aList !=null && aList.size() > 0) {
			System.out.println("::: MemberMain.memberPrint() 조회된 데이터는 >>> : ");
			
			for (int i=0; i < aList.size(); i++) {				
				MemberVO _mvo = aList.get(i);
				MemberVO.printMemberVO(_mvo);
			}
			
		}else {
			System.out.println("ArrayList 에 데이터가 없습니다. >>> : ");
		}
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		System.out.println("MemberMain.main() 함수 진입 성공 >>> : ");
		
		// Scanner 클래스를 이용해서 입력 데이터를 받고
		System.out.println("ISUD TYPE을 입력 하시오 >>> : ");
		Scanner sc = new Scanner(System.in);
		String isudType = sc.next();
		isudType = isudType.toUpperCase();
		
		// 입력 
		if ("I".equals(isudType)) {			
			
			String mid = ""; 
			String mpw = ""; 
			String mname = "";
			String mhp = "";
			String memail = "";
			String maddr = "";
			
			System.out.println("데이터를 입력하시오");
			Scanner sc_i = new Scanner(System.in);
			System.out.println("아이디를 입력하시오 >>> : ");
			mid = sc_i.next();
			System.out.println("비밀번호를 입력하시오 >>> : ");
			mpw = sc_i.next();
			System.out.println("이름을 입력하시오 >>> : ");
			mname = sc_i.next();
			System.out.println("핸드폰번호를 입력하시오 >>> : ");
			mhp = sc_i.next();
			System.out.println("이메일을 입력하시오 >>> : ");
			memail = sc_i.next();
			System.out.println("주소를 입력하시오 >>> : ");
			maddr = sc_i.next();
						
			MemberMain mm_i = new MemberMain();
			int nCnt = mm_i.memInsert(	mid, 
										mpw, 
										mname, 
										mhp, 
										memail, 
										maddr);
			
			if (nCnt >= 1) {
				System.out.println("입력 성공 >>> : " + nCnt);
			}else {
				System.out.println("입력 실패 >>> : " + nCnt);
			}
			
			sc_i.close();
		}
		
		// 전체 조회
		if ("SALL".equals(isudType)) {
			
			MemberMain mm_sall = new MemberMain();
			ArrayList<MemberVO> aList = mm_sall.memSelectAll();
			MemberMain.memberPrint(aList);
						
		}
		
		// 조건 조회
		if ("S".equals(isudType)) {
			
			String mno = "";					
			
			System.out.println("데이터를 입력하시오");
			Scanner sc_s = new Scanner(System.in);
			System.out.println("글번호를 입력하시오 >>> : ");
			mno = sc_s.next();				
			
			MemberMain mm_s = new MemberMain();
			ArrayList<MemberVO> aList = mm_s.memSelect(mno);
			MemberMain.memberPrint(aList);	
			
			sc_s.close();
		}

		// 수정
		if ("U".equals(isudType)) {
			
			String mno = "";		
			String memail = "";
			String maddr = "";
			
			System.out.println("데이터를 입력하시오");
			Scanner sc_u = new Scanner(System.in);
			System.out.println("회원번호를 입력하시오 >>> : ");
			mno = sc_u.next();			
			System.out.println("이메일을 입력하시오 >>> : ");
			memail = sc_u.next();
			System.out.println("주소를 입력하시오 >>> : ");
			maddr = sc_u.next();
						
			MemberMain mm_u = new MemberMain();
			int nCnt = mm_u.memUpdate(	mno, 
										memail, 
										maddr);
			
			if (nCnt >= 1) {
				System.out.println("수정 성공 >>> : " + nCnt);
			}else {
				System.out.println("수정 실패 >>> : " + nCnt);
			}
			
			sc_u.close();		
		}
		
		sc.close();
	}
}
