<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head></head>
<body>	
	<hr color="red">	
	전체 게시물 카운트 >>> ${count}개 <br>
	전체 페이지 카운트 >>> ${pages}개 <br>
	<%  int pages = (int)request.getAttribute("pages");
		for(int p = 1; p <= pages; p++){
	%>	
		<a href="list4?page=<%=p%>">
		<button style="background: pink;"><%=p%></button>
		</a>&nbsp;&nbsp;
	<%	
		}
	%>
	<hr color="red">
	<table border="1">
		<tr bgcolor="lime">
			<td>행번호</td>
			<td>id</td>
			<td>이메일</td>
			<td>자동차</td>
		</tr>
		<c:forEach items="${list}" var="vo">
			<tr>
				<td>${vo.row_no}</td>
				<td>${vo.id}</td>
				<td>${vo.email}</td>
				<td>${vo.car}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>

