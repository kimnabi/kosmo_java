<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%	
	//int sum = (int) request.getAttribute("sum_1");
	//pageContext.setAttribute("sum", sum);
%>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>el_02_1</title>
</head>
<body>
<h3>el_02_1</h3>
<hr>

1부터 100까지의 누적합(EL) : ${requestScope.sum_1 }
<!-- 
	param : request.getParamter("mid");
 1부터 100까지의 누적합(EL) : ${sum_1 }
 -->
</body>
</html>