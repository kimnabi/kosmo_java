<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jstl_03</title>
</head>
<body>
<h3>jstl_03</h3>
<hr>
<!-- jstl_03.jsp?num1=100&num2=50 -->
<!-- 
	param : request.getParamter("mid");
 -->
첫 번째 수 : ${param.num1 }<br>
두 번째 수 : ${param.num2 }<br>

<%-- 
	<c:if test="조건식">
		실행문
	</c:if> 
--%>
 최대값 : <c:if test="${param.num1 - param.num2 > 0}">
 			${param.num1 }
 			</c:if>
 			<c:if test="${param.num1 - param.num2 < 0}">
 			${param.num2 }
 			</c:if>
<br>
 최소값 : <c:if test="${param.num1 - param.num2 > 0}">
 			${param.num2 }
 			</c:if>
 			<c:if test="${param.num1 - param.num2 < 0}">
 			${param.num1 }
 			</c:if>
</body>
</html>