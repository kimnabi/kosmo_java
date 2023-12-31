package a.b.c.kos.mem.dao;

import java.util.ArrayList;

import a.b.c.kos.mem.vo.MemVO;

public interface MemDAO {
	public ArrayList<MemVO> memSelectAll();
	public ArrayList<MemVO> memSearchBykeyword(String keyword,String searchfilter,String fromDate,String toDate);
	public ArrayList<MemVO> memSelect(MemVO mvo);
	public boolean memInsert(MemVO mvo);
	public boolean memUpdate(MemVO mvo);
	public boolean memDelete(MemVO mvo);
}
