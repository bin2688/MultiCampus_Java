
<%@page import="com.multi.mvc05.ReplyDTO"%>
<%@page import="java.util.List"%>
<%@page import="com.multi.mvc05.BbsDTO2"%>
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
	//컨트롤러에서 모델로 지정한 것 request.getAttribute("모델이름");
	BbsDTO2	bag = (BbsDTO2)request.getAttribute("bag");
	List<ReplyDTO> list = (List<ReplyDTO>)request.getAttribute("list");
%>
게시판 id <%=bag.getId() %> <br>
게시판 title <%=bag.getTitle() %> <br>
게시판 content <%=bag.getContent()%> <br>
게시판 writer <%=bag.getWriter()%>
<hr color="red">
	<% for(ReplyDTO dto : list){ %>
	- <%= dto.getId() %>, <%= dto.getOriid() %>, <%= dto.getContent() %>, <%= dto.getWriter() %> <br>
	<%} %>

</body>
</html>