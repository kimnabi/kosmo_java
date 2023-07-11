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
			System.out.println("insert ����!!");
		} else {
			System.out.println("insert ����!!");
		}
	}

	public void update() {
		System.out.println("�����͸� �Է��Ͻÿ�");
		Scanner sc = MemberInfoView.getScanner();
		System.out.println("ȸ����ȣ�� �Է��Ͻÿ� >>> : ");
		mvo.setMno(sc.next());

		System.out.println("�̸����� �Է��Ͻÿ� >>> : ");
		mvo.setMemail(sc.next());
		System.out.println("�ּҸ� �Է��Ͻÿ� >>> : ");
		mvo.setMaddr(sc.next());

		///////////////////////////////////////
		
		int res = test.memUpdate(mvo); 
		boolean bool = res > 0; 
	
		if (bool) {
			System.out.println("update ����!!");
		} else {
			System.out.println("update ����!!");
		}
	}

	public  void delete() {
		System.out.println("�� �����  ������ �۹�ȣ �ϳ� ���Է��ϼ��� >>> : ");
		Scanner sc = MemberInfoView.getScanner();
		String mno=sc.next();

		///////////////////////////////////////
		int res = test.memDelete(mno); 
		boolean bool = res > 0; 
		if (bool) {
			System.out.println("delete ����!!");
		} else {
			System.out.println("delete ����!!");
		}
	}
}
