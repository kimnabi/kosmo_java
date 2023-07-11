package a.b.c.com.kos.mem.dao;

import java.util.ArrayList;

import a.b.c.com.kos.mem.vo.MemberVO;

public interface MemberDAO {

	public int memInsert(MemberVO mvo);
	public ArrayList<MemberVO> memSelectAll();
	public ArrayList<MemberVO> memSelect(MemberVO mvo);
	public int memUpdate(MemberVO mvo);
}
