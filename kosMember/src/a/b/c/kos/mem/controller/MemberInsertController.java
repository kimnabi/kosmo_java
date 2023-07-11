package a.b.c.kos.mem.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import a.b.c.com.kosmem.common.ChabunUtils;
import a.b.c.kos.mem.service.MemService;
import a.b.c.kos.mem.service.MemServiceImpl;
import a.b.c.kos.mem.vo.MemVO;

public class MemberInsertController implements Controller {
	
	private  Logger logger = LoggerFactory.getLogger(this.getClass());

	@Override
	public String requestHandler(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		    req.setCharacterEncoding("UTF-8");
	        logger.info("MemberInsertController 블록 진입  >>> ");
	        resp.setCharacterEncoding("UTF-8");
			String isudType = req.getParameter("ISUD_TYPE");
			logger.debug("isudType >>> {}",isudType);
			String mname = req.getParameter("mname");
			logger.debug("mname >>> {}",mname);
			String mid = req.getParameter("mid");
			logger.debug("mid >>> {}",mid);
			String mpw = req.getParameter("mpw");
			logger.debug("mpw >>> {}",mpw);
			String mhpstr0 = req.getParameter("mhp");
			logger.debug("mhpstr0 >>> {}", mhpstr0);
			String mhpstr1 = req.getParameter("mhp1");
			logger.debug("mhpstr1 >>> {}",mhpstr1);
			String mhpstr2 = req.getParameter("mhp2");
			logger.debug("mpw >>> {}",mpw);
			String mhp = mhpstr0.concat("-")+mhpstr1.concat("-")+mhpstr2;
			logger.debug("mhpstr1 >>> {}",mhpstr1);
			//String s =    mhpStr[0].substring(3)+mhpStr[1].substring(3, 7)+
			String EmailStr1 = req.getParameter("memail");
			logger.debug("mhpstr >>> {}",EmailStr1);
			String EmailStr2 = req.getParameter("memail1");
			logger.debug("memail1 >>> {}",EmailStr2);
			String memail = EmailStr1.concat("@")+EmailStr2;
			logger.debug("memail >>> {}",memail);
			
			String mgender = req.getParameter("mgender");
			logger.debug("mgender >>> {}",mgender);
			
			String[] mhobbystr = req.getParameterValues("mhobby"); //복수 파라메터
			//mhobbystr[0].v
			logger.debug("mhobbystr >>> {}",mhobbystr);
			logger.debug("mhobbystr.length >>> {}",mhobbystr.length);
			String mhobby = "";
			for(int i =0 ; i< mhobbystr.length;i++) {
				if(i<mhobbystr.length-1)  
					mhobby +=mhobbystr[i].concat(",");
				else
					mhobby +=mhobbystr[i];
			}
			logger.debug("mhobby >>> {}",mhobby);

			String mzone = req.getParameter("mzone");
			logger.debug("mzone >>> {}",mzone);
			String roadStr1 = req.getParameter("mroad");
			logger.debug("mroad >>> {}",roadStr1);
			String roadStr2 = req.getParameter("mroaddetail");
			logger.debug("mroaddetail >>> {}",roadStr2);
			String mroad = roadStr1.concat("@")+roadStr2;
			logger.debug("mzone >>> {}",mroad);
			String mjibun = req.getParameter("mjibun");
			logger.debug("mjibun >>> {}",mjibun);
			//String mlocal = req.getParameter("mlocal");
			String mmsg = req.getParameter("mmsg");
			logger.debug("mmsg >>> {}",mmsg);
			
			//String deleteyn = req.getParameter("deleteyn");
			//String isudType = req.getParameter("isudType");
			boolean bool = "I".equals(isudType.toUpperCase());
			logger.debug("isudType.toUpperCase() >>>", isudType.toUpperCase());
			String nextPage=null;
			
			if(bool) {
					logger.debug("if(bool) >>> {}",bool);
					//dto 생성
					MemVO mvo = null;
					//채번 얻어오기
					String mnum = ChabunUtils.getMemChabun();
					logger.debug("mnum >>> {}",mnum);
					ArrayList<MemVO> alist = null;
													 alist = new ArrayList<MemVO>();
					mvo = new MemVO(mnum, mname, mid, 
													 mpw, mhp, memail, mgender, mhobby,
													 mzone, mroad, mjibun, mmsg);
					logger.debug("new MemVO >>> {}",mvo);
				//	alist.add(mvo);//테스트
				// alist.add(mvo);//테스트
				//	alist.add(mvo);//테스트
					//service 호출
					MemService mSer = null;
					mSer = new MemServiceImpl();
					logger.debug("MemService mSer>>> {}",mSer);
					boolean res =mSer.memInsert(mvo);
					
					 
					logger.debug("Insert 결과값 ====================================== {}",res);
					if(res) {
								logger.debug("if(res) 블록진입");
								ArrayList<MemVO>aList =mSer.memSelectAll();
								logger.debug("mSer.memSelectAll():{}",aList);
					       	//	req.setAttribute("name", filename);
								//req.setAttribute("mhp", mhpstr0);
								//req.setAttribute("mhp1", mhpstr1);
								//logger.debug("req.setAttribute(\"mhp1\"):{}",mhpstr1);
								//req.setAttribute("mhp2", mhpstr2);
								//logger.debug("req.setAttribute(\"mhp2\"):{}",mhpstr2);
//								req.setAttribute("aList", mvo);
								req.setAttribute("aList", aList);
								//logger.debug("req.setAttribute(\"aList\"):{}",mvo);
								logger.debug("req.setAttribute(\"aList\"):{}",aList);
								nextPage = "redirect:/kosMember/memberList.do";
							//포워딩 설정
								//RequestDispatcher rd = req.getRequestDispatcher("/kosmem/memSelectAll.jsp");
								//logger.debug("RequestDispatcher rd :{}",rd);
								//rd.forward(req, resp);
								} // end if res
			}
		return nextPage;
	}

}
