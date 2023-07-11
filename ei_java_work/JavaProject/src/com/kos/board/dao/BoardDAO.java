package com.kos.board.dao;

import java.util.ArrayList;

import com.kos.board.vo.BoardVO;

public interface BoardDAO {
	
	public ArrayList<BoardVO> boardSelectAll();
	public ArrayList<BoardVO> boardSelect(BoardVO bvo);
	//게시판 회원정보 입력기능
	public int boardInsert(BoardVO bvo);
	//게시판 회원정보 갱신기능
	public int boardUpdate(BoardVO bvo);
	//게시판 회원정보 삭제기능
	public int boardDelete(BoardVO bvo);

}
