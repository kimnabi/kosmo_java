package com.kos.mem.controller;

import java.util.List;
import java.util.Scanner;

import com.kos.mem.dao.*;
import com.kos.mem.view.MemberInfoView;
import com.kos.mem.vo.*;

public class MemberInfoController {
	
    MemberVO mvo;
	MemberDAO test;
	
	public MemberInfoController() {
		mvo = new MemberVO();
		test = new MemberDAOImpl();
		//this.test = test; 
	}		
			
	public void selectList() {
		List<MemberVO> list = test.memSelectAll();

		for (MemberVO dto : list) {
			 
			 dto.showData();
		}
	}

	public void selectOne(String num) {

		///////////////////////////////////////
		mvo = test.memSelect(num);
		mvo.showData();
	}

	public void insert(MemberVO mvo) {
		
		///////////////////////////////////////
		int res = test.memInsert(mvo); 
		boolean bool = res > 0; 
		if (bool) {
			System.out.println("insert 성공!!");
		} else {
			System.out.println("insert 실패!!");
		}
	}

	public void update() {
		System.out.println("데이터를 입력하시오");
		Scanner sc = MemberInfoView.getScanner();
		System.out.println("회원번호를 입력하시오 >>> : ");
		mvo.setMno(sc.next());

		System.out.println("이메일을 입력하시오 >>> : ");
		mvo.setMemail(sc.next());
		System.out.println("주소를 입력하시오 >>> : ");
		mvo.setMaddr(sc.next());

		///////////////////////////////////////
		
		int res = test.memUpdate(mvo); 
		boolean bool = res > 0; 
	
		if (bool) {
			System.out.println("update 성공!!");
		} else {
			System.out.println("update 실패!!");
		}
	}

	public  void delete() {
		System.out.println("글 목록중  삭제할 글번호 하나 를입력하세요 >>> : ");
		Scanner sc = MemberInfoView.getScanner();
		String mno=sc.next();

		///////////////////////////////////////
		int res = test.memDelete(mno); 
		boolean bool = res > 0; 
		if (bool) {
			System.out.println("delete 성공!!");
		} else {
			System.out.println("delete 실패!!");
		}
	}
}
