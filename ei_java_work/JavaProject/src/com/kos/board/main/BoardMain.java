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
		System.out.println("BoardMain.main() 함수 진입 성공 >>> : ");
		
		// Scanner 클래스를 이용해서 입력 데이터를 받고
		System.out.println("ISUD TYPE을 입력 하시오 >>> : ");
		Scanner sc = new Scanner(System.in);
		String isudType = sc.next();
		isudType = isudType.toUpperCase();
		// 문자열 하나를 입력 받아 "I"와 같은 문자면  if 절이 실행한다
			if("I".equals(isudType)) {
					BoardVO bvo = null;
					bvo = new BoardVO();
					System.out.println("글 번호을 입력 하시오 >>> : ");
					bvo.setBnum(sc.next());
					System.out.println("글 제목을 입력 하시오 >>> : ");
					bvo.setBsubject(sc.next());
					System.out.println("글 쓴이을 입력 하시오 >>> : ");
					bvo.setBwriter(sc.next());
					System.out.println("패스워드을 입력 하시오 >>> : ");
					bvo.setBpw(sc.next());
					System.out.println("글 내용을 입력 하시오 >>> : ");
					bvo.setBmemo(sc.next());
					
					BoardDAO test = null;
							test = new BoardDAOImpl();
					int qRes = test.boardInsert(bvo);
					if(qRes == 1) {
						System.out.println("BoardMain main() : >>> "+qRes);
					} else {
						System.err.println("BoardMain main() : >>> 입력실패");
					}
				
				}// end if
			if("SALL".equals(isudType)) {
				
				System.out.println("글 목록전체을 출력합니다 >>> : ");
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
				System.out.println("글 목록중  글번호 하나 를입력하세요 >>> : ");
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
						System.out.println("글 번호을 입력 하시오 >>> : ");
						bvo.setBnum(sc.next());
						System.out.println("글 제목을 입력 하시오 >>> : ");
						bvo.setBsubject(sc.next());
						System.out.println("글 내용을 입력 하시오 >>> : ");
						bvo.setBmemo(sc.next());
						
						BoardDAO test = null;
								test = new BoardDAOImpl();
						int qRes = test.boardUpdate(bvo);
						if(qRes == 1) {
							System.out.println("BoardMain main() : >>> "+qRes);
						} else {
							System.err.println("BoardMain main() : >>> 입력실패");
						}
			    	}//end if
			    if("D".equals(isudType)) {
					
					BoardVO bvo = new BoardVO();
					System.out.println("글 목록중  글번호 하나 를입력하세요 >>> : ");
					bvo.setBnum(sc.next());
					BoardDAO test = null;
					test = new BoardDAOImpl();
					
				int qRes = test.boardDelete(bvo);
				if(qRes == 1) {
					System.out.println("BoardMain main() : >>> "+qRes);
				} else {
					System.err.println("BoardMain main() : >>> 삭제실패");
				}	
					}// end if
			sc.close();
	}// end main

} // end class BoardMain
