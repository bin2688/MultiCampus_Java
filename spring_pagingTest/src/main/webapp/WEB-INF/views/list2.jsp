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
		<a href="list2?page=<%=p%>">
		<button style="background: lime;"><%=p%></button>
		</a>&nbsp;&nbsp;
	<%	
		}
	%>
	<hr color="red">
	<table border="1">
		<tr bgcolor="lime">
			<td>행번호</td>
			<td>id</td>
			<td>제목</td>
			<td>내용</td>
			<td>작성자</td>
		</tr>
		<c:forEach items="${list}" var="vo">
			<tr>
				<td>${vo.bbs_no}</td>
				<td>${vo.id}</td>
				<td>${vo.title}</td>
				<td>${vo.content}</td>
				<td>${vo.writer}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>

