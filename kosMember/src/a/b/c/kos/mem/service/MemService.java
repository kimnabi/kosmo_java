package a.b.c.kos.mem.service;

import java.util.ArrayList;

import a.b.c.kos.mem.vo.MemVO;

public interface MemService {
		
	public ArrayList<MemVO> memSelectAll();
//	public ArrayList<MemVO> memSelectAll();
	public ArrayList<MemVO> memSelect(MemVO mvo);
	public boolean memInsert(MemVO mvo);
	public boolean memUpdate(MemVO mvo);
	public boolean memDelete(MemVO mvo);	
}
