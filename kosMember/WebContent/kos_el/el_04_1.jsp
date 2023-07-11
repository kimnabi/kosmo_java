<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<%	
	int num1 = Integer.parseInt(request.getParameter("num1"));
	int num2 = Integer.parseInt(request.getParameter("num2"));
%>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>el_04_1</title>
</head>
<body>
<h3>el_04_1</h3>
<hr>

<!-- el_04_1.jsp?num1=20&num2=10 -->
num1의 값(JSP) : <%=num1 %><br/>
num2의 값(JSP) : <%=num2 %><br/>
<br/>
num1의 값(EL) : ${param.num1 }<br/> <!-- ${num1 }은 바인딩 객체가 없어서 출력되지 않는다. -->
num2의 값(EL) : ${param.num2 }<br/> <!-- request.getParameter()로 가져온 객체가 없어도 출력된다 -->
num1 + num2(잘못된 코드) : ${param.num1 } + ${param.num2 }<br/>
<br/>

[사칙 연산]<br/>
num1 + num2 : ${param.num1 + param.num2 }<br/>


[비교 연산]<br/>

<%
pageContext.setAttribute("num_r1", num1);
pageContext.setAttribute("num_r2", num2);
%>
<c:set var="fnum" value="100"/>
<c:set var="snum" value="9"/>
<!-- int 형 데이타 비교할때 는 -->
num1이 더 큽니까? : ${fnum - snum > 0 }<br/>
num1의 값(EL) :      ${param.num1+'10' }<br/>
num1이 더 큽니까? : ${Integer.parseInt(param.num1) - Integer.parseInt(param.num2) >0}<br/>
num1이 더 큽니까? : ${Integer.parseInt(param.num1) > Integer.parseInt(param.num2)}<br/>
num1이 더 큽니까? : ${param.num1+"1" gt param.num2+"1" }<br/>
num1이 더 큽니까? : ${param.num1 gt param.num2 ? "예" : "아니요" }<br/>
<br/>
num1과 num2가 같습니까? : ${param.num1 == param.num2 }<br/>
num1과 num2가 같습니까? : ${param.num1 eq param.num2 }<br/>
</body>
</html>