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
		System.out.println("MemberMain.main() �Լ� ���� ���� >>> : ");
		
		// Scanner Ŭ������ �̿��ؼ� �Է� �����͸� �ް�
		System.out.println("ISUD TYPE�� �Է� �Ͻÿ� >>> : ");
		Scanner sc = new Scanner(System.in);
		String isudType = sc.next();
		isudType = isudType.toUpperCase();
		// ���ڿ� �ϳ��� �Է� �޾� "I"�� ���� ���ڸ�  if ���� �����Ѵ�
		if("SALL".equals(isudType)) {
			System.out.println("�� �����ü�� ����մϴ� >>> : ");
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
			
			System.out.println("�� �����  �۹�ȣ �ϳ� ���Է��ϼ��� >>> : ");
			String num=sc.next();
			MemberVO res = null;
				MemberDAO test = null;
				test = new MemberDAOImpl();
				res = test.memSelect(num);
				System.out.println(res);
		}// end if
		if ("I".equals(isudType)) {
			
			MemberVO mvo = new MemberVO();
			System.out.println("�����͸� �Է��Ͻÿ�");
//			Scanner sc_i = new Scanner(System.in);
//			System.out.println("ȸ����ȣ�� �Է��Ͻÿ� >>> : ");
//			mno = sc_i.next();
			//mno = ch
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
			//mvo = new MemberVO("1", mid, mname, mhp, memail, maddr, 'N',"sysdate", "sysdate");		
			MemberDAO test = null;
			test = new MemberDAOImpl();
			int qRes = test.memInsert(mvo);
			if(qRes == 1) {
				System.out.println("MemberMain main() : >>> "+qRes);
			} else {
				System.err.println("MemberMain main() : >>> �Է½���");
			}
			
		} //end   "I".equals(isudType)
		if ("U".equals(isudType)) {
			
			MemberVO mvo = new MemberVO();
			System.out.println("�����͸� �Է��Ͻÿ�");
//			Scanner sc_i = new Scanner(System.in);
			System.out.println("ȸ����ȣ�� �Է��Ͻÿ� >>> : ");
			mvo.setMno(sc.next());

			System.out.println("�̸����� �Է��Ͻÿ� >>> : ");
			mvo.setMemail(sc.next());
			System.out.println("�ּҸ� �Է��Ͻÿ� >>> : ");
			mvo.setMaddr(sc.next());
			//mvo = new MemberVO("1", mid, mname, mhp, memail, maddr, 'N',"sysdate", "sysdate");		
			MemberDAO test = null;
			test = new MemberDAOImpl();
			int qRes = test.memUpdate(mvo);
			if(qRes == 1) {
				System.out.println("MemberMain main() : >>> "+qRes);
			} else {
				System.err.println("MemberMain main() : >>> �Է½���");
			}
			
		} //end   "I".equals(isudType)
		if ("D".equals(isudType)) {
			System.out.println("�� �����  ������ �۹�ȣ �ϳ� ���Է��ϼ��� >>> : ");
			String num=sc.next();

			MemberDAO test = null;
			test = new MemberDAOImpl();
			int qRes = test.memDelete(num);
			if(qRes == 1) {
				System.out.println("MemberMain main() : >>> "+qRes);
			} else {
				System.err.println("MemberMain main() : >>> �Է½���");
			}
		}//end   "D".equals(isudType)
		sc.close();
	} //end main

}
