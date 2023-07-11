<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
 <%--
 
 <jsp:forward page="el_02_01.jsp" />
  --%>
    <%
    int sum = 0;
    
    for(int i =1;i <= 100;i++){
    	  sum+=i;	
    }
    //page 영역은  한페이지내...
    pageContext.setAttribute("sum", sum);

    out.println("out.println:: sum >>>: "+sum);
    
    request.setAttribute("sum_1", sum);
    
    RequestDispatcher rd = request.getRequestDispatcher("el_02_01.jsp");
    rd.forward(request, response);
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>el_02</title>
</head>
<body>
</html>