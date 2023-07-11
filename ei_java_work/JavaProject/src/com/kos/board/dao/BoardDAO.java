package com.kos.board.dao;

import java.util.ArrayList;

import com.kos.board.vo.BoardVO;

public interface BoardDAO {
	
	public ArrayList<BoardVO> boardSelectAll();
	public ArrayList<BoardVO> boardSelect(BoardVO bvo);
	//�Խ��� ȸ������ �Է±��
	public int boardInsert(BoardVO bvo);
	//�Խ��� ȸ������ ���ű��
	public int boardUpdate(BoardVO bvo);
	//�Խ��� ȸ������ �������
	public int boardDelete(BoardVO bvo);

}
