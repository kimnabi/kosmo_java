package a.b.c.kos.mem.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import a.b.c.kos.mem.dao.MemDAO;
import a.b.c.kos.mem.dao.MemDAOImpl;
import a.b.c.kos.mem.vo.MemVO;

public class MemberListController implements Controller {
	
	private  Logger logger = LoggerFactory.getLogger(this.getClass());

	@Override
	public String requestHandler(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
	    req.setCharacterEncoding("UTF-8");
        logger.info("MemberListController 블록 진입  >>> ");
        resp.setCharacterEncoding("UTF-8");
        //파라메터 수집
		//DAO 생성
		//MemService mser = null;
		//mser = new MemServiceImpl()
		String nextPage = null;
		MemDAO mdao =null;
		mdao = new MemDAOImpl();
		ArrayList<MemVO> aList = mdao.memSelectAll();
		logger.debug("ArrayList<MemVO> aList >>>>>> {}",aList);
		boolean bool = aList.size() >0 && aList != null;
		logger.debug("bool >>>>>> {}",bool);
		if(bool) {
			logger.debug("Search 결과값 ====================================== {}",aList);
			req.setAttribute("aList", aList);
			//logger.debug("req.setAttribute(\"aList\"):{}",mvo);
			logger.debug("req.setAttribute(\"aList\"):{}",aList);
			nextPage = "/kosmem/memSelectAll.jsp";
		}
		return nextPage;
	}

}
