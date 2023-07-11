package a.b.c.com.kosmem.common;

import javax.servlet.jsp.JspWriter;

public class JSFunction {
	
	// 메시지 알림창을 띄운 후, 명시한 URL로 이동함 
/*
 *  msg : 알림창에 띄울 메세지
 *  url : 알림창을 닫은 후 이동할 페이지 URL
 *  out : 자바 스크립트 코드를 삽입할 출력 스트림 
 */
	public static void alertLocation(String msg, String url, JspWriter out) {
		try {
			String script = "" 
						    + "<script>"
						    + "		alert('"+msg+"');"
						    + "		location.href='/jsp/"+url+"';"	
						    + "</script>";
			out.println(script);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//메세지 알림창을 띄운 후 이전 페이지로 돌아감 
	public static void alertBack(String msg, JspWriter out) {
		try {
			String script = "" 
				    		+ "<script>"
				    		+ "		alert('"+msg+"');"
				    		+ "		history.back();"	
				    		+ "</script>";
			out.println(script);
		}
		catch (Exception e) {
			e.printStackTrace();
		}	
	}
}
