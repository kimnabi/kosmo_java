package a.b.c.kos.mem.service;

import java.util.ArrayList;

import a.b.c.kos.mem.dao.MemDAO;
import a.b.c.kos.mem.dao.MemDAOImpl;
import a.b.c.kos.mem.vo.MemVO;

public class MemServiceImpl implements MemService {

	@Override
	public ArrayList<MemVO> memSelectAll() {
		// TODO Auto-generated method stub
		MemDAO mdao = null;
		mdao= new MemDAOImpl();
		 ArrayList<MemVO> aList =mdao.memSelectAll();
		return aList;
	}

	@Override
	public ArrayList<MemVO> memSelect(MemVO mvo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean memInsert(MemVO mvo) {
		// TODO Auto-generated method stub
		//DAO 생성
		MemDAO mdao = null;
		mdao= new MemDAOImpl();
		boolean bool =mdao.memInsert(mvo);
		return bool;
	}

	@Override
	public boolean memUpdate(MemVO mvo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean memDelete(MemVO mvo) {
		// TODO Auto-generated method stub
		return false;
	}

}
