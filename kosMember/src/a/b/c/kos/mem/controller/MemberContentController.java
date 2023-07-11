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

public class MemberContentController implements Controller {
	
	private  Logger logger = LoggerFactory.getLogger(this.getClass());
	@Override
	public String requestHandler(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		  req.setCharacterEncoding("UTF-8");
	      logger.info("MemberContentController 블록 진입  >>> ");
	      resp.setCharacterEncoding("UTF-8");
	        
			String mnum = req.getParameter("mnumCheck");
			logger.debug("req.getParameter(\"mnumCheck\") >>>>>> {}",mnum);
			String nextPage = null;
			MemVO mvo = null;
			MemDAO mdao =null;
			
			mvo = new MemVO();
			mvo.setMnum(mnum);
			mdao = new MemDAOImpl();
			ArrayList<MemVO> aList = mdao.memSelect(mvo);
			logger.debug("ArrayList<MemVO> aList >>>>>> {}",aList);
			boolean bool = aList.size() >0 && aList != null;
			if(bool) {
				logger.debug("Content 결과값 ====================================== {}",aList);
				req.setAttribute("aList", aList);
				//logger.debug("req.setAttribute(\"aList\"):{}",mvo);
				logger.debug("req.setAttribute(\"aList\"):{}",aList);
				nextPage = "/kosmem/mem_view_el.jsp";
			}else {
				
				//에러 :데이타가 없을 경우...
				//nextPage = "/kosmem/mem";
			}
			return nextPage;
	}

}
