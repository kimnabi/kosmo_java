<%@page import="a.b.c.kos.mem.vo.PersonVO"%>
<%@page import="java.util.List"%>
<%@page import="a.b.c.kos.mem.vo.MemVO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.HashMap"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%

%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>el_07</title>
</head>
<body>
<h3>el_07</h3>
<hr>
   test1: ${requestScope.myMap.get("test1")} </br>
   test1: ${ myMap.test1} </br>
 <hr>
  이름:${vo1.name }</br>
  나이:${vo1.age }</br>
 <hr>
  이름:${list[1].name }</br>
  나이:${list[1].age }</br>
   
</body>
</html>