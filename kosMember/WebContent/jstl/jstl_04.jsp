<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jstl_04</title>
</head>
<body>
<h3>jstl_04</h3>
<hr>
<!-- jstl_03.jsp?num1=100&num2=50 -->
<!-- 
	param : request.getParamter("mid");
 -->
<%
	// String numS = request.getParameter("num");	
	int num = 0;
	
	try {
		String numS = request.getParameter("num");		
	 	if (!(numS !=null && numS.length() > 0)) return;
		//num = Integer.parseInt(null);
		
		if(num == 1) {
			out.println("처음 뵙겠습니다. (java:if)");	
		} else if(num == 2) {
			out.println("안녕하세요. (java:if)");
		} else {
			out.println("반갑습니다. (java:if)");
		}
		
	}catch(Exception e){
		e.printStackTrace();
	}
	
	
%>
<br/><br/>

<c:if test="${param.num == 1 }" >
	처음 뵙겠습니다. (c:if)
</c:if>
<c:if test="${param.num == 2 }" >
	안녕하세요. (c:if)
</c:if>
<c:if test="${param.num == 3 }" >
	반갑습니다. (c:if)
</c:if>
<br/><br/>

<%--
JAVA : switch(비교값) case 기준값 default
JSTL core : <c:choose>
				<c:when test="조건식">실행문</c:when>
				<c:when test="조건식">실행문</c:when>
				<c:otherwise>실행문</c:otherwise>
			</c:choose>
--%>

<%
switch(num) {
	case 1 :
		out.println("처음 뵙겠습니다. (java:switch)");
		break;
	case 2 :
		out.println("안녕하세요. (java:switch)");
		break;
	default : 
		out.println("반갑습니다. (java:switch)");
		break;
}
%>
<br/><br/>
<c:choose>
	<c:when test="${param.num == 1 }">
		처음 뵙겠습니다. (c:choose)
	</c:when>
	<c:when test="${param.num == 2 }">
		안녕하세요. (c:choose)
	</c:when>
	<c:otherwise>
		반갑습니다. (c:choose)
	</c:otherwise>
</c:choose>

</body>
</html>