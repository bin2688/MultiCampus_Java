<%@page import="com.multi.mvc05.BbsDTO2"%>
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
	ArrayList<BbsDTO2> list = (ArrayList<BbsDTO2>)request.getAttribute("list");

	for(BbsDTO2 bag: list){

%>

게시판 id <%=bag.getId() %> <br>
	<a href="one?id=<%=bag.getId()%>">게시판 title <%=bag.getTitle() %> </a> <br>
게시판 writer <%=bag.getWriter()%> <br>
<hr color="red">
<% } %>
</body>
</html>