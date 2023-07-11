<%@page import="a.b.c.kos.mem.vo.EL_MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="java.util.ArrayList" %>

<%
	String[] study = {"JAVA", "View", "SQL", "Servlet/JSP/SPRING", "Android", "IoT", "Project"};
	request.setAttribute("study", study);
	
	ArrayList<String> list = new ArrayList<>();
	list.add("오렌지");
	list.add("바나나");
	list.add("사과");
	list.add("멜론");
	list.add("레몬");
	request.setAttribute("list", list);
	
	EL_MemberVO mvo = new EL_MemberVO();
	mvo.setIrum("박준범");
	mvo.setId("PJP");
	mvo.setPw("1234");
	mvo.setAge("37");
	mvo.setAddr("서울 강북구 미아동");
	mvo.setTel("02-111-2222");
	request.setAttribute("mvo", mvo);
	
	
	ArrayList<EL_MemberVO> mlist = new ArrayList<>();
	
	mlist.add(new EL_MemberVO("홍길동", "hong", "1234", "11", "서울시", "010-1111-1111"));
	mlist.add(new EL_MemberVO("홍길동", "hong", "1234", "22", "서울시", "010-1111-1111"));
	mlist.add(new EL_MemberVO("홍길동", "hong", "1234", "33", "서울시", "010-1111-1111"));
	mlist.add(new EL_MemberVO("홍길동", "hong", "1234", "44", "서울시", "010-1111-1111"));
	mlist.add(new EL_MemberVO("홍길동", "hong", "1234", "55", "서울시", "010-1111-1111"));
	request.setAttribute("mlist", mlist);
%>    

<jsp:forward page="el_06_1.jsp" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>el_06</title>
</head>
<body>
<h3>el_06</h3>
<hr>

</body>
</html>