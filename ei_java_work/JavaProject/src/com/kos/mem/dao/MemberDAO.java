package com.kos.mem.dao;

import java.util.ArrayList;

import com.kos.mem.vo.MemberVO;

public interface MemberDAO {
	
	public ArrayList<MemberVO> memSelectAll();
	// 조건조회 함수
	public abstract MemberVO memSelect(String mno);
	
	public int memInsert(MemberVO mvo); 
	public int memUpdate(MemberVO mvo);
	
	public int memDelete(String mno);
}

