package a.b.c.com.kos.main;

import java.util.ArrayList;
import java.util.Scanner;

import a.b.c.com.kos.board.dao.BoardDAO;
import a.b.c.com.kos.board.dao.BoardDAOImpl;
import a.b.c.com.kos.board.vo.BoardVO;

public class BoardMain {
	
	// �Է� 
	public int boardInsert(String bnum, String bsubject, String bwriter, 
							String bpw, String bmemo) {
		System.out.println("BoardMain.boardInsert() �Լ� ���� ���� >>> : ");
		System.out.println("bnum >>> : " 		+ bnum);
		System.out.println("bsubject >>> : " 	+ bsubject);
		System.out.println("bwriter >>> : " 	+ bwriter);
		System.out.println("bpw >>> : " 		+ bpw);
		System.out.println("bmemo >>> : " 		+ bmemo);
		
		BoardVO bvo = null;
		bvo = new BoardVO();
		bvo.setBnum(bnum);
		bvo.setBsubject(bsubject);
		bvo.setBwriter(bwriter);
		bvo.setBpw(bpw);
		bvo.setBmemo(bmemo);
		
		BoardDAO bdao = new BoardDAOImpl();
		int nCnt = bdao.boardInsert(bvo);
		
		return nCnt;
	}	
	
	// ��ü��ȸ �Լ�
	public ArrayList<BoardVO> boardSelectAll() {
		System.out.println("BoardMain.boardSelectAll() �Լ� ���� ���� >>> : ");
		
		BoardVO bvo = null;
		bvo = new BoardVO();
		
		BoardDAO bdao = new BoardDAOImpl();
		ArrayList<BoardVO> aList = bdao.boardSelectAll(bvo);
		
		return aList;
	}
	
	// ������ȸ �Լ�
	public ArrayList<BoardVO> boardSelect(String bnum) {
		System.out.println("BoardMain.boardSelect() �Լ� ���� ���� >>> : ");
		System.out.println("bnum >>> : " 		+ bnum);
		
		BoardVO bvo = null;
		bvo = new BoardVO();
		bvo.setBnum(bnum);
		
		BoardDAO bdao = new BoardDAOImpl();
		ArrayList<BoardVO> aList = bdao.boardSelect(bvo);
		
		return aList;
	}
	
	
	// ����
	public int boardUpdate(String bnum, String bmemo) {
		System.out.println("BoardMain.boardUpdate() �Լ� ���� ���� >>> : ");
		System.out.println("bnum >>> : " 		+ bnum);		
		System.out.println("bmemo >>> : " 		+ bmemo);
		
		BoardVO bvo = null;
		bvo = new BoardVO();
		bvo.setBnum(bnum);	
		bvo.setBmemo(bmemo);
		
		BoardDAO bdao = new BoardDAOImpl();
		int nCnt = bdao.boardUpdate(bvo);
		
		return nCnt;
	}	
	
	// ����
	public int boardDelete(String bnum) {
		System.out.println("BoardMain.boardDelete() �Լ� ���� ���� >>> : ");
		System.out.println("bnum >>> : " 		+ bnum);		
		
		BoardVO bvo = null;
		bvo = new BoardVO();
		bvo.setBnum(bnum);	
		
		BoardDAO bdao = new BoardDAOImpl();
		int nCnt = bdao.boardDelete(bvo);
		
		return nCnt;
	}	
	
	public static void boardPrint(ArrayList<BoardVO> aList) {
		System.out.println("::: BoardMain.boardPrint() �Լ� ���� ���� >>> : ");
		
		if (aList !=null && aList.size() > 0) {
			System.out.println("::: BoardMain.boardPrint() ��ȸ�� �����ʹ� >>> : ");
			
			for (int i=0; i < aList.size(); i++) {
				
				BoardVO _ovo = aList.get(i);
				
				String bnum 		= _ovo.getBnum();
				String bsubject 	= _ovo.getBsubject();
				String bwriter 		= _ovo.getBwriter();
				String bpw 			= _ovo.getBpw();					
				String bmemo 		= _ovo.getBmemo();
				String deleteyn 	= _ovo.getDeleteyn();
				String insertdate 	= _ovo.getInsertdate();
				String updatedate 	= _ovo.getUpdatedate();
				
				System.out.println(	  
									  bnum 			+ ", " 
									+ bsubject 		+ ", " 
									+ bwriter 		+ ", "
				                   	+ bpw 			+ ", " 
									+ bmemo 		+ ", " 
				                   	+ deleteyn 		+ ", " 
									+ insertdate 	+ ", " 
				                   	+ updatedate
				                  );
			}
			
		}else {
			System.out.println("ArrayList �� �����Ͱ� �����ϴ�. >>> : ");
		}
		
	}
	
	// main() �Լ��� �ܼ� ���ø��ɼ��� ������ 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("BoardMain.main() �Լ� ���� ���� >>> : ");
		
		// Scanner Ŭ������ �̿��ؼ� �Է� �����͸� �ް�
		System.out.println("ISUD TYPE�� �Է� �Ͻÿ� >>> : ");
		Scanner sc = new Scanner(System.in);
		String isudType = sc.next();
		isudType = isudType.toUpperCase();
		
		// �Լ��� ȣ���ؼ� 
		// �ش� �Լ����� DAO�� ȣ���� �����̴�.
		
		// �Է� 
		if ("I".equals(isudType)) {
			
			String bnum 	= "";
			String bsubject = "";
			String bwriter 	= "";
			String bpw 		= "";
			String bmemo 	= "";
			
			System.out.println("�����͸� �Է��Ͻÿ�");
			Scanner sc_i = new Scanner(System.in);
			System.out.println("�۹�ȣ�� �Է��Ͻÿ� >>> : ");
			bnum = sc_i.next();
			System.out.println("�������� �Է��Ͻÿ� >>> : ");
			bsubject = sc_i.next();
			System.out.println("�۾��̸� �Է��Ͻÿ� >>> : ");
			bwriter = sc_i.next();
			System.out.println("��й�ȣ�� �Է��Ͻÿ� >>> : ");
			bpw = sc_i.next();
			System.out.println("������ �Է��Ͻÿ� >>> : ");
			bmemo = sc_i.next();
						
			BoardMain bm = new BoardMain();
			int nCnt = bm.boardInsert(bnum, bsubject, bwriter, bpw, bmemo);
			
			if (nCnt >= 1) {
				System.out.println("�Է� ���� >>> : " + nCnt);
			}else {
				System.out.println("�Է� ���� >>> : " + nCnt);
			}
			
			sc_i.close();
		}
		
		// ��ü ��ȸ
		if ("SALL".equals(isudType)) {
			
			BoardMain bm_sall = new BoardMain();
			ArrayList<BoardVO> aList = bm_sall.boardSelectAll();
			BoardMain.boardPrint(aList);			
		}
		
		// ���� ��ȸ
		if ("S".equals(isudType)) {
			
			String bnum = "";					
			
			System.out.println("�����͸� �Է��Ͻÿ�");
			Scanner sc_s = new Scanner(System.in);
			System.out.println("�۹�ȣ�� �Է��Ͻÿ� >>> : ");
			bnum = sc_s.next();				
			
			BoardMain bm_s = new BoardMain();
			ArrayList<BoardVO> aList = bm_s.boardSelect(bnum);
			BoardMain.boardPrint(aList);	
			
			sc_s.close();
		}

		// ����
		if ("U".equals(isudType)) {
			
			String bnum = "";		
			String bmemo = "";
			
			System.out.println("�����͸� �Է��Ͻÿ�");
			Scanner sc_u = new Scanner(System.in);
			System.out.println("�۹�ȣ�� �Է��Ͻÿ� >>> : ");
			bnum = sc_u.next();			
			System.out.println("������ �Է��Ͻÿ� >>> : ");
			bmemo = sc_u.next();
						
			BoardMain bm_u = new BoardMain();
			int nCnt = bm_u.boardUpdate(bnum, bmemo);
			
			if (nCnt >= 1) {
				System.out.println("���� ���� >>> : " + nCnt);
			}else {
				System.out.println("���� ���� >>> : " + nCnt);
			}
			
			sc_u.close();		
		}
		
		// ����
		if ("D".equals(isudType)) {
			
			String bnum = "";					
			
			System.out.println("�����͸� �Է��Ͻÿ�");
			Scanner sc_d = new Scanner(System.in);
			System.out.println("�۹�ȣ�� �Է��Ͻÿ� >>> : ");
			bnum = sc_d.next();				
						
			BoardMain bm_d = new BoardMain();
			int nCnt = bm_d.boardDelete(bnum);
			
			if (nCnt >= 1) {
				System.out.println("���� ���� >>> : " + nCnt);
			}else {
				System.out.println("���� ���� >>> : " + nCnt);
			}
			
			sc_d.close();			
		}
		
		sc.close();
	}

}




















