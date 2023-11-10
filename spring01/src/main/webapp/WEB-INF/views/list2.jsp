
<%@page import="com.multi.mvc01.ProductDTO"%>
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
	ArrayList<ProductDTO> list = (ArrayList<ProductDTO>)request.getAttribute("list");


%>
<table border="1">
	<tr>
		<td>상품id</td>
		<td>상품title</td>
		<td>상품img</td>
	</tr>
<%for(ProductDTO bag: list){%>	
	<tr bgcolor="lightblue">
		<td><%=bag.getId() %></td>
		<td><%=bag.getTitle() %></td>
		<td>
		<a href="one2?id=<%=bag.getId()%>"><img src="resources/img/<%=bag.getImg()%>"></a>
		</td>
	</tr>
<% } %>
</table>
</body>
</html>