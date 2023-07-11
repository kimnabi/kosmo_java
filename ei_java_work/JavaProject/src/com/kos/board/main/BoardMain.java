package com.kos.board.main;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import com.kos.board.dao.BoardDAO;
import com.kos.board.dao.BoardDAOImpl;
import com.kos.board.vo.BoardVO;

public class BoardMain {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		System.out.println("BoardMain.main() �Լ� ���� ���� >>> : ");
		
		// Scanner Ŭ������ �̿��ؼ� �Է� �����͸� �ް�
		System.out.println("ISUD TYPE�� �Է� �Ͻÿ� >>> : ");
		Scanner sc = new Scanner(System.in);
		String isudType = sc.next();
		isudType = isudType.toUpperCase();
		// ���ڿ� �ϳ��� �Է� �޾� "I"�� ���� ���ڸ�  if ���� �����Ѵ�
			if("I".equals(isudType)) {
					BoardVO bvo = null;
					bvo = new BoardVO();
					System.out.println("�� ��ȣ�� �Է� �Ͻÿ� >>> : ");
					bvo.setBnum(sc.next());
					System.out.println("�� ������ �Է� �Ͻÿ� >>> : ");
					bvo.setBsubject(sc.next());
					System.out.println("�� ������ �Է� �Ͻÿ� >>> : ");
					bvo.setBwriter(sc.next());
					System.out.println("�н������� �Է� �Ͻÿ� >>> : ");
					bvo.setBpw(sc.next());
					System.out.println("�� ������ �Է� �Ͻÿ� >>> : ");
					bvo.setBmemo(sc.next());
					
					BoardDAO test = null;
							test = new BoardDAOImpl();
					int qRes = test.boardInsert(bvo);
					if(qRes == 1) {
						System.out.println("BoardMain main() : >>> "+qRes);
					} else {
						System.err.println("BoardMain main() : >>> �Է½���");
					}
				
				}// end if
			if("SALL".equals(isudType)) {
				
				System.out.println("�� �����ü�� ����մϴ� >>> : ");
				ArrayList<BoardVO> resList = null;
				BoardDAO test = null;
				test = new BoardDAOImpl();
				resList = test.boardSelectAll();
				for(BoardVO bvo : resList) {
					System.out.println("BoardMain main() >>>" + bvo.getBmemo());
					System.out.println("BoardMain main() >>>" + bvo.getBnum());
					System.out.println("BoardMain main() >>>" + bvo.getBsubject());
					System.out.println("BoardMain main() >>>" + bvo.getBpw());
					System.out.println("BoardMain main() >>>" + bvo.getBwriter());
					System.out.println("BoardMain main() >>>" + bvo.getDeleteyn());
					System.out.println("BoardMain main() >>>" + bvo.getInsertdate());
					System.out.println("BoardMain main() >>>" + bvo.getUpdatedate());
				}
			}
			if("S".equals(isudType)) {
				
				BoardVO bvo = new BoardVO();
				System.out.println("�� �����  �۹�ȣ �ϳ� ���Է��ϼ��� >>> : ");
				bvo.setBnum(sc.next());
				ArrayList<BoardVO> resList = null;
					BoardDAO test = null;
					test = new BoardDAOImpl();
					resList = test.boardSelect(bvo);
					for(BoardVO _bvo : resList) {
						System.out.println("BoardMain main() >>>" + _bvo.getBmemo());
						System.out.println("BoardMain main() >>>" + _bvo.getBnum());
						System.out.println("BoardMain main() >>>" + _bvo.getBsubject());
						System.out.println("BoardMain main() >>>" + _bvo.getBpw());
						System.out.println("BoardMain main() >>>" + _bvo.getBwriter());
						System.out.println("BoardMain main() >>>" + _bvo.getDeleteyn());
						System.out.println("BoardMain main() >>>" + _bvo.getInsertdate());
						System.out.println("BoardMain main() >>>" + _bvo.getUpdatedate());
					}
				}// end if
			    if("U".equals(isudType)) {
				
				    	BoardVO bvo = null;
						bvo = new BoardVO();
						System.out.println("�� ��ȣ�� �Է� �Ͻÿ� >>> : ");
						bvo.setBnum(sc.next());
						System.out.println("�� ������ �Է� �Ͻÿ� >>> : ");
						bvo.setBsubject(sc.next());
						System.out.println("�� ������ �Է� �Ͻÿ� >>> : ");
						bvo.setBmemo(sc.next());
						
						BoardDAO test = null;
								test = new BoardDAOImpl();
						int qRes = test.boardUpdate(bvo);
						if(qRes == 1) {
							System.out.println("BoardMain main() : >>> "+qRes);
						} else {
							System.err.println("BoardMain main() : >>> �Է½���");
						}
			    	}//end if
			    if("D".equals(isudType)) {
					
					BoardVO bvo = new BoardVO();
					System.out.println("�� �����  �۹�ȣ �ϳ� ���Է��ϼ��� >>> : ");
					bvo.setBnum(sc.next());
					BoardDAO test = null;
					test = new BoardDAOImpl();
					
				int qRes = test.boardDelete(bvo);
				if(qRes == 1) {
					System.out.println("BoardMain main() : >>> "+qRes);
				} else {
					System.err.println("BoardMain main() : >>> ��������");
				}	
					}// end if
			sc.close();
	}// end main

} // end class BoardMain
