package a.b.c.com.kos.main;

import java.util.ArrayList;
import java.util.Scanner;

import a.b.c.com.kos.common.ChabunUtils;
import a.b.c.com.kos.mem.dao.MemberDAO;
import a.b.c.com.kos.mem.dao.MemberDAOImpl;
import a.b.c.com.kos.mem.vo.MemberVO;

public class MemberMain {
	
	// �Է� 
	public int memInsert(	String mid, 
							String mpw, 
							String mname, 
							String mhp,
							String memail,
							String maddr) {		
		System.out.println("MemberMain.memInsert() �Լ� ���� ���� >>> : ");		
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
	
	// ��ü��ȸ �Լ�
	public ArrayList<MemberVO> memSelectAll() {
		System.out.println("MemberMain.memSelectAll() �Լ� ���� ���� >>> : ");	
		
		MemberDAO mdao = new MemberDAOImpl();;
		ArrayList<MemberVO> aList = mdao.memSelectAll();
		
		return aList;
	}
	
	// ������ȸ �Լ�
	public ArrayList<MemberVO> memSelect(String mno) {
		System.out.println("MemberMain.memSelect() �Լ� ���� ���� >>> : ");
		System.out.println("mno >>> : " 		+ mno);
		
		MemberVO mvo = null;
		mvo = new MemberVO();
		mvo.setMno(mno);
		
		MemberDAO mdao = new MemberDAOImpl();;
		ArrayList<MemberVO> aList = mdao.memSelect(mvo);
		
		return aList;
	}
	
	// ����
	public int memUpdate(	String mno, 
							String memail, 
							String maddr) {
		System.out.println("MemberMain.memUpdate() �Լ� ���� ���� >>> : ");
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
		System.out.println("::: MemberMain.memberPrint() �Լ� ���� ���� >>> : ");
		
		if (aList !=null && aList.size() > 0) {
			System.out.println("::: MemberMain.memberPrint() ��ȸ�� �����ʹ� >>> : ");
			
			for (int i=0; i < aList.size(); i++) {				
				MemberVO _mvo = aList.get(i);
				MemberVO.printMemberVO(_mvo);
			}
			
		}else {
			System.out.println("ArrayList �� �����Ͱ� �����ϴ�. >>> : ");
		}
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		System.out.println("MemberMain.main() �Լ� ���� ���� >>> : ");
		
		// Scanner Ŭ������ �̿��ؼ� �Է� �����͸� �ް�
		System.out.println("ISUD TYPE�� �Է� �Ͻÿ� >>> : ");
		Scanner sc = new Scanner(System.in);
		String isudType = sc.next();
		isudType = isudType.toUpperCase();
		
		// �Է� 
		if ("I".equals(isudType)) {			
			
			String mid = ""; 
			String mpw = ""; 
			String mname = "";
			String mhp = "";
			String memail = "";
			String maddr = "";
			
			System.out.println("�����͸� �Է��Ͻÿ�");
			Scanner sc_i = new Scanner(System.in);
			System.out.println("���̵� �Է��Ͻÿ� >>> : ");
			mid = sc_i.next();
			System.out.println("��й�ȣ�� �Է��Ͻÿ� >>> : ");
			mpw = sc_i.next();
			System.out.println("�̸��� �Է��Ͻÿ� >>> : ");
			mname = sc_i.next();
			System.out.println("�ڵ�����ȣ�� �Է��Ͻÿ� >>> : ");
			mhp = sc_i.next();
			System.out.println("�̸����� �Է��Ͻÿ� >>> : ");
			memail = sc_i.next();
			System.out.println("�ּҸ� �Է��Ͻÿ� >>> : ");
			maddr = sc_i.next();
						
			MemberMain mm_i = new MemberMain();
			int nCnt = mm_i.memInsert(	mid, 
										mpw, 
										mname, 
										mhp, 
										memail, 
										maddr);
			
			if (nCnt >= 1) {
				System.out.println("�Է� ���� >>> : " + nCnt);
			}else {
				System.out.println("�Է� ���� >>> : " + nCnt);
			}
			
			sc_i.close();
		}
		
		// ��ü ��ȸ
		if ("SALL".equals(isudType)) {
			
			MemberMain mm_sall = new MemberMain();
			ArrayList<MemberVO> aList = mm_sall.memSelectAll();
			MemberMain.memberPrint(aList);
						
		}
		
		// ���� ��ȸ
		if ("S".equals(isudType)) {
			
			String mno = "";					
			
			System.out.println("�����͸� �Է��Ͻÿ�");
			Scanner sc_s = new Scanner(System.in);
			System.out.println("�۹�ȣ�� �Է��Ͻÿ� >>> : ");
			mno = sc_s.next();				
			
			MemberMain mm_s = new MemberMain();
			ArrayList<MemberVO> aList = mm_s.memSelect(mno);
			MemberMain.memberPrint(aList);	
			
			sc_s.close();
		}

		// ����
		if ("U".equals(isudType)) {
			
			String mno = "";		
			String memail = "";
			String maddr = "";
			
			System.out.println("�����͸� �Է��Ͻÿ�");
			Scanner sc_u = new Scanner(System.in);
			System.out.println("ȸ����ȣ�� �Է��Ͻÿ� >>> : ");
			mno = sc_u.next();			
			System.out.println("�̸����� �Է��Ͻÿ� >>> : ");
			memail = sc_u.next();
			System.out.println("�ּҸ� �Է��Ͻÿ� >>> : ");
			maddr = sc_u.next();
						
			MemberMain mm_u = new MemberMain();
			int nCnt = mm_u.memUpdate(	mno, 
										memail, 
										maddr);
			
			if (nCnt >= 1) {
				System.out.println("���� ���� >>> : " + nCnt);
			}else {
				System.out.println("���� ���� >>> : " + nCnt);
			}
			
			sc_u.close();		
		}
		
		sc.close();
	}
}
