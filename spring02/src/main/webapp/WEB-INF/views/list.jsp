<%@page import="com.multi.mvc02.BookDTO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="yellow">
<%
	ArrayList<BookDTO> list = (ArrayList<BookDTO>)request.getAttribute("list");

	for(BookDTO bag: list){

%>

 id <%=bag.getId() %> <br>
	<a href="one?id=<%=bag.getId()%>"> 이름 name <%=bag.getName() %> </a> <br>
url <%=bag.getUrl()%> <br>
<hr color="red">
<% } %>
</body>
</html>