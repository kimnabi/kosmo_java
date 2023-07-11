package a.b.c.kos.mem.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@WebServlet("*.do")
public class MemController extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
//	private  Logger logger = LogManager.getLogger(MemController.class);
	private  Logger logger = LoggerFactory.getLogger(this.getClass());


	@Override
	public void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
        req.setCharacterEncoding("UTF-8");
        logger.info("service 블록 진입  >>> ");
        resp.setCharacterEncoding("UTF-8");
        
    	String url=req.getRequestURI();
    	logger.debug("req.getRequestURI() :{}", url);
		//System.out.println(url);		
		String ctx=req.getContextPath();
		logger.debug("req.getContextPath() :{}", ctx);
		//System.out.println(ctx);		
		// 실제로 요청한 명령이 무엇이지 파악
		String command=url.substring(ctx.length());
        logger.debug("command :{}", command);
     // 요청에 따른 분기작업(if~ else if~)
     	Controller controller=null;
     	String nextPage=null;
     		
    	// 핸들러매핑->HandlerMapping
	    HandlerMapping mapping=new HandlerMapping();
	    controller=mapping.getController(command);
	    nextPage=controller.requestHandler(req, resp);
		// forward, redirect
		if(nextPage!=null) {
			if(nextPage.indexOf("redirect:")!=-1) {
				//            redirect:/MVC04/memberList.do
				resp.sendRedirect(nextPage.split(":")[1]); // redirect
			}else {
			//	RequestDispatcher rd=req.getRequestDispatcher(ViewResolver.makeView(nextPage)); // forward
					RequestDispatcher rd=req.getRequestDispatcher(nextPage); // forward
				    rd.forward(req, resp);
			}
		}		
	}
}
