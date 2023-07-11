<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>jstl_02</title>
</head>
<body>
<h3>jstl_02</h3>
<hr>
<!--
<%-- 
<c:set var="code" value="abc001" scope="request" />
<c:set var="name" value="컴퓨터" scope="request" />
<c:set var="price" value="5000000"  scope="request" />
--%>
 -->
 <!-- EL변수 설정 : scope는 생략시 page -->
<c:set var="code" value="abc001" scope="page" />
<c:set var="name" value="컴퓨터" />
<c:set var="price" value="5000000" />
 
<jsp:forward page="jstl_02_1.jsp" />
</body>
</html>