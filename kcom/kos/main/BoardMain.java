package a.b.c.com.kos.main;

import java.util.ArrayList;
import java.util.Scanner;

import a.b.c.com.kos.board.dao.BoardDAO;
import a.b.c.com.kos.board.dao.BoardDAOImpl;
import a.b.c.com.kos.board.vo.BoardVO;

public class BoardMain {
	
	// 입력 
	public int boardInsert(String bnum, String bsubject, String bwriter, 
							String bpw, String bmemo) {
		System.out.println("BoardMain.boardInsert() 함수 진입 성공 >>> : ");
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
	
	// 전체조회 함수
	public ArrayList<BoardVO> boardSelectAll() {
		System.out.println("BoardMain.boardSelectAll() 함수 진입 성공 >>> : ");
		
		BoardVO bvo = null;
		bvo = new BoardVO();
		
		BoardDAO bdao = new BoardDAOImpl();
		ArrayList<BoardVO> aList = bdao.boardSelectAll(bvo);
		
		return aList;
	}
	
	// 조건조회 함수
	public ArrayList<BoardVO> boardSelect(String bnum) {
		System.out.println("BoardMain.boardSelect() 함수 진입 성공 >>> : ");
		System.out.println("bnum >>> : " 		+ bnum);
		
		BoardVO bvo = null;
		bvo = new BoardVO();
		bvo.setBnum(bnum);
		
		BoardDAO bdao = new BoardDAOImpl();
		ArrayList<BoardVO> aList = bdao.boardSelect(bvo);
		
		return aList;
	}
	
	
	// 수정
	public int boardUpdate(String bnum, String bmemo) {
		System.out.println("BoardMain.boardUpdate() 함수 진입 성공 >>> : ");
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
	
	// 삭제
	public int boardDelete(String bnum) {
		System.out.println("BoardMain.boardDelete() 함수 진입 성공 >>> : ");
		System.out.println("bnum >>> : " 		+ bnum);		
		
		BoardVO bvo = null;
		bvo = new BoardVO();
		bvo.setBnum(bnum);	
		
		BoardDAO bdao = new BoardDAOImpl();
		int nCnt = bdao.boardDelete(bvo);
		
		return nCnt;
	}	
	
	public static void boardPrint(ArrayList<BoardVO> aList) {
		System.out.println("::: BoardMain.boardPrint() 함수 진입 성공 >>> : ");
		
		if (aList !=null && aList.size() > 0) {
			System.out.println("::: BoardMain.boardPrint() 조회된 데이터는 >>> : ");
			
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
			System.out.println("ArrayList 에 데이터가 없습니다. >>> : ");
		}
		
	}
	
	// main() 함수는 콘솔 어플리케션의 시작점 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("BoardMain.main() 함수 진입 성공 >>> : ");
		
		// Scanner 클래스를 이용해서 입력 데이터를 받고
		System.out.println("ISUD TYPE을 입력 하시오 >>> : ");
		Scanner sc = new Scanner(System.in);
		String isudType = sc.next();
		isudType = isudType.toUpperCase();
		
		// 함수를 호출해서 
		// 해당 함수에서 DAO를 호출할 예정이다.
		
		// 입력 
		if ("I".equals(isudType)) {
			
			String bnum 	= "";
			String bsubject = "";
			String bwriter 	= "";
			String bpw 		= "";
			String bmemo 	= "";
			
			System.out.println("데이터를 입력하시오");
			Scanner sc_i = new Scanner(System.in);
			System.out.println("글번호를 입력하시오 >>> : ");
			bnum = sc_i.next();
			System.out.println("글제목을 입력하시오 >>> : ");
			bsubject = sc_i.next();
			System.out.println("글쓴이를 입력하시오 >>> : ");
			bwriter = sc_i.next();
			System.out.println("비밀번호를 입력하시오 >>> : ");
			bpw = sc_i.next();
			System.out.println("내용을 입력하시오 >>> : ");
			bmemo = sc_i.next();
						
			BoardMain bm = new BoardMain();
			int nCnt = bm.boardInsert(bnum, bsubject, bwriter, bpw, bmemo);
			
			if (nCnt >= 1) {
				System.out.println("입력 성공 >>> : " + nCnt);
			}else {
				System.out.println("입력 실패 >>> : " + nCnt);
			}
			
			sc_i.close();
		}
		
		// 전체 조회
		if ("SALL".equals(isudType)) {
			
			BoardMain bm_sall = new BoardMain();
			ArrayList<BoardVO> aList = bm_sall.boardSelectAll();
			BoardMain.boardPrint(aList);			
		}
		
		// 조건 조회
		if ("S".equals(isudType)) {
			
			String bnum = "";					
			
			System.out.println("데이터를 입력하시오");
			Scanner sc_s = new Scanner(System.in);
			System.out.println("글번호를 입력하시오 >>> : ");
			bnum = sc_s.next();				
			
			BoardMain bm_s = new BoardMain();
			ArrayList<BoardVO> aList = bm_s.boardSelect(bnum);
			BoardMain.boardPrint(aList);	
			
			sc_s.close();
		}

		// 수정
		if ("U".equals(isudType)) {
			
			String bnum = "";		
			String bmemo = "";
			
			System.out.println("데이터를 입력하시오");
			Scanner sc_u = new Scanner(System.in);
			System.out.println("글번호를 입력하시오 >>> : ");
			bnum = sc_u.next();			
			System.out.println("내용을 입력하시오 >>> : ");
			bmemo = sc_u.next();
						
			BoardMain bm_u = new BoardMain();
			int nCnt = bm_u.boardUpdate(bnum, bmemo);
			
			if (nCnt >= 1) {
				System.out.println("수정 성공 >>> : " + nCnt);
			}else {
				System.out.println("수정 실패 >>> : " + nCnt);
			}
			
			sc_u.close();		
		}
		
		// 삭제
		if ("D".equals(isudType)) {
			
			String bnum = "";					
			
			System.out.println("데이터를 입력하시오");
			Scanner sc_d = new Scanner(System.in);
			System.out.println("글번호를 입력하시오 >>> : ");
			bnum = sc_d.next();				
						
			BoardMain bm_d = new BoardMain();
			int nCnt = bm_d.boardDelete(bnum);
			
			if (nCnt >= 1) {
				System.out.println("삭제 성공 >>> : " + nCnt);
			}else {
				System.out.println("삭제 실패 >>> : " + nCnt);
			}
			
			sc_d.close();			
		}
		
		sc.close();
	}

}




















