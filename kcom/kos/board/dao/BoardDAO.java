package a.b.c.com.kos.board.dao;

import java.util.ArrayList;

import a.b.c.com.kos.board.vo.BoardVO;

public interface BoardDAO {

	// ют╥б 
	public int boardInsert(BoardVO bvo);
	public ArrayList<BoardVO> boardSelectAll(BoardVO bvo);
	public ArrayList<BoardVO> boardSelect(BoardVO bvo);	
	public int boardUpdate(BoardVO bvo);
	public int boardDelete(BoardVO bvo);
}
