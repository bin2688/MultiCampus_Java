<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    	session.setAttribute("view", 0);  //object <---Integer(int) 자동변환
    	//value위치의 타입이 object이라고 설정되어있음.
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<a href="세션설정보기.jsp">세션설정보기</a>
</body>
</html>