<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
   		Cookie c1 = new Cookie("apple", "1000"); //이름 + 값 (무조건 String)
    	Cookie c2 = new Cookie("melon", "2000"); //이름 + 값
    	Cookie c3 = new Cookie("ice","2000"); //이름 + 값
 
    	response.addCookie(c1);
    	response.addCookie(c2);
    	response.addCookie(c3);
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<a href="쿠키문제보기.jsp">쿠키문제보기</a>
</body>
</html>