<%@page import="a.b.c.kos.mem.vo.PersonVO"%>
<%@page import="java.util.List"%>
<%@page import="a.b.c.kos.mem.vo.MemVO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.HashMap"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
HashMap<String,Integer> map = new HashMap<String,Integer>();
map.put("test1", 1);

request.setAttribute("myMap",map);
PersonVO vo1 = new PersonVO("사나","23");
PersonVO vo2 = new PersonVO("피나","22");
request.setAttribute("vo1",vo1);
request.setAttribute("vo2",vo2);

List<PersonVO> list = new ArrayList<PersonVO>();
list.add(vo1);
list.add(vo2);
request.setAttribute("list", list);

//RequestDispatcher rd = request.getRequestDispatcher("el_07_1.jsp");
//rd.forward(request, response);
%>
<jsp:forward page="el_07_1.jsp" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>el_07</title>
</head>
<body>

</body>
</html>