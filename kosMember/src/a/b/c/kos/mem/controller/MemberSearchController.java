package a.b.c.kos.mem.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import a.b.c.com.kosmem.common.CodeUtil;
import a.b.c.kos.mem.dao.*;
import a.b.c.kos.mem.vo.MemVO;


public class MemberSearchController implements Controller {
	
	private  Logger logger = LoggerFactory.getLogger(this.getClass());

	@Override
	public String requestHandler(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
	    req.setCharacterEncoding("UTF-8");
        logger.info("MemberSearchController 블록 진입  >>> ");
        resp.setCharacterEncoding("UTF-8");
        
		String keyword = req.getParameter("keyword");
		logger.debug("req.getParameter(\"keyword\") >>>>>> {}",keyword);
		String searchFilter = req.getParameter("searchFilter");
		logger.debug("req.getParameter(\"searchFilter\") >>>>>> {}",searchFilter);
		String fromDate = req.getParameter("fromdate");
		logger.debug("req.getParameter(\"fromdate\") >>>>>> {}",fromDate);
		String toDate = req.getParameter("todate");
		logger.debug("req.getParameter(\"toDate\") >>>>>> {}",toDate);
		searchFilter =CodeUtil.dBsearchFilter_lavel(searchFilter); 
		logger.debug("CodeUtil.dBsearchFilter_lavel(searchFilter) >>>>>> {}",searchFilter);
		//DAO 생성
		//MemService mser = null;
		//mser = new MemServiceImpl()
		String nextPage = null;
		MemDAO mdao =null;
		mdao = new MemDAOImpl();
		ArrayList<MemVO> aList = mdao.memSearchBykeyword(keyword, searchFilter,fromDate,toDate);
		logger.debug("ArrayList<MemVO> aList >>>>>> {}",aList);
		boolean bool = aList.size() >0 && aList != null;
		logger.debug("bool >>>>>> {}",bool);
		if(bool) {
			logger.debug("Search 결과값 ====================================== {}",aList);
			req.setAttribute("aList", aList);
			//logger.debug("req.setAttribute(\"aList\"):{}",mvo);
			logger.debug("req.setAttribute(\"aList\"):{}",aList);
			nextPage = "/kosmem/memSelectAll.jsp";
		}else {
			
			//에러 :데이타가 없을 경우...
			//nextPage = "/kosmem/mem";
		}
		return nextPage;
	}

}
