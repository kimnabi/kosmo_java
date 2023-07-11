package com.kos.mem.view;

import java.util.Scanner;

import com.kos.mem.controller.MemberInfoController;
import com.kos.mem.dao.MemberDAO;
import com.kos.mem.vo.MemberVO;

class MENU{
	final static int SHOW_ALL = 1;
	final static int SHOW_MEMBER = 2;
	final static int INSERT_MEMBER = 3;
	final static int UPDATE_MEMBER  = 4;
	final static int DELETE_MEMBER  = 5;
	final static int EXIT_PROGRAM = 6;
}

public class MemberInfoView {
	private static Scanner sc = new Scanner(System.in);
	
	MemberInfoController controller;
	
	public MemberInfoView() {
		controller = new MemberInfoController();
		
	//	int num = getFriendNum();
	//	controller = new MemberInfoController(num);
	}

	public static Scanner getScanner() {
		return sc;
	}
	
	void viewMenu() {
		System.out.println("*** 메뉴 선택 ***");
		System.out.println("1. 전체회원 정보 출력");
		System.out.println("2. 선택 회원 정보 출력");
		System.out.println("3. 회원 정보 저장 출력");
		System.out.println("4. 회원 정보 갱신");
		System.out.println("4. 회원 정보 삭제");
		System.out.println("5. 프로그램 종료");
	}
	
	int getUserSelect() {
		System.out.println("선택 >> ");
		int choice = sc.nextInt();
		return choice;
	}
	String getUserDMLSelect() {
		System.out.println("출력할 넘버 입력 : ");
		String num = sc.next();
		return num;
	}
	MemberVO getUserDMLInsert() {
		MemberVO mvo = null;
		mvo = new MemberVO();
		
		System.out.println("출력할 넘버 입력 :>>>>>>> ");
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
		return mvo;
	}
	
	boolean runChoice(int choice) {
		switch(choice) {
		
		case MENU.SHOW_ALL:
			controller.selectList();
			break;
		case MENU.SHOW_MEMBER:
			String mno =getUserDMLSelect();
			controller.selectOne(mno);
			break;
		case MENU.INSERT_MEMBER:
			MemberVO dto =getUserDMLInsert();
			controller.insert(dto);
			break;
		case MENU.EXIT_PROGRAM:
			System.out.println("프로그램 종료~");
			return false;
		default:
			System.out.println("잘 못 입력~");
			break;
		}
		
		return true;
	}
	
	public void menuLoop() {
		boolean isRun = true;
		while(isRun) {
			viewMenu();
			int choice = getUserSelect();
			isRun = runChoice(choice);
		}
	}
}
