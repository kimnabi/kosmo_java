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
		System.out.println("*** �޴� ���� ***");
		System.out.println("1. ��üȸ�� ���� ���");
		System.out.println("2. ���� ȸ�� ���� ���");
		System.out.println("3. ȸ�� ���� ���� ���");
		System.out.println("4. ȸ�� ���� ����");
		System.out.println("4. ȸ�� ���� ����");
		System.out.println("5. ���α׷� ����");
	}
	
	int getUserSelect() {
		System.out.println("���� >> ");
		int choice = sc.nextInt();
		return choice;
	}
	String getUserDMLSelect() {
		System.out.println("����� �ѹ� �Է� : ");
		String num = sc.next();
		return num;
	}
	MemberVO getUserDMLInsert() {
		MemberVO mvo = null;
		mvo = new MemberVO();
		
		System.out.println("����� �ѹ� �Է� :>>>>>>> ");
		System.out.println("���̵� �Է��Ͻÿ� >>> : ");
		mvo.setMid(sc.next());
		System.out.println("��й�ȣ�� �Է��Ͻÿ� >>> : ");
		mvo.setMpw(sc.next());
		System.out.println("�̸��� �Է��Ͻÿ� >>> : ");
		mvo.setMname(sc.next());
		System.out.println("�ڵ�����ȣ�� �Է��Ͻÿ� >>> : ");
		mvo.setMhp(sc.next());
		System.out.println("�̸����� �Է��Ͻÿ� >>> : ");
		mvo.setMemail(sc.next());
		System.out.println("�ּҸ� �Է��Ͻÿ� >>> : ");
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
			System.out.println("���α׷� ����~");
			return false;
		default:
			System.out.println("�� �� �Է�~");
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
