package a.b.c.com.kosmem.common;

import java.io.IOException;

import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class HelloCustomTag extends SimpleTagSupport {
	
	public void doTag() throws IOException{
		
		JspWriter out = getJspContext().getOut();
		out.println("<font color=red>");
		out.println("Hello My Custom Tag !!!! >>>>>>>>>>>>> AAAAAAAAAAAAAAAA");
		out.println("</font>");
	}
}
