package com.kos.main;

import java.util.ArrayList;
import java.util.Scanner;

import com.kos.login.dao.LoginDAO;
import com.kos.login.dao.LoginDAOImpl;
import com.kos.mem.vo.MemberVO;

public class LoginMain {
	
	public static void main(String[] args) {
		// Scanner 클래스를 이용해서 입력 데이터를 받고
		MemberVO mvo = null;
		mvo = new MemberVO();
		Scanner sc = new Scanner(System.in);
		System.out.println("ID을 입력 하시오 >>> : ");
		mvo.setMid(sc.next());
		System.out.println("PW을 입력 하시오 >>> : ");
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
