package com.kos.main;

import java.util.ArrayList;
import java.util.Scanner;

import com.kos.login.dao.LoginDAO;
import com.kos.login.dao.LoginDAOImpl;
import com.kos.mem.vo.MemberVO;

public class LoginMain {
	
	public static void main(String[] args) {
		// Scanner Ŭ������ �̿��ؼ� �Է� �����͸� �ް�
		MemberVO mvo = null;
		mvo = new MemberVO();
		Scanner sc = new Scanner(System.in);
		System.out.println("ID�� �Է� �Ͻÿ� >>> : ");
		mvo.setMid(sc.next());
		System.out.println("PW�� �Է� �Ͻÿ� >>> : ");
		mvo.setMpw(sc.next());
			ArrayList<MemberVO> resList = null;
			LoginDAO test = null;
			test = new LoginDAOImpl();
			resList = test.loginCheck(mvo);
			System.out.println(">>>>>>>>>>>>>>>>>>>>>>>"+resList);
			for(MemberVO res : resList) {
			    System.out.println(">>>>>>>>>>>>>>>>>>>>>>>"+res);
			}
			sc.close();
	}
}
