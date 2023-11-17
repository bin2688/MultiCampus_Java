
<%@page import="org.springframework.web.servlet.mvc.method.RequestMappingInfoHandlerMethodMappingNamingStrategy"%>
<%@page import="com.multi.mvc05.ReplyDTO"%>
<%@page import="java.util.List"%>
<%@page import="com.multi.mvc05.BbsDTO2"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
		BbsDTO2	bag = (BbsDTO2)request.getAttribute("bag");
    	session.setAttribute("user", "apple");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="resources/js/jquery-3.7.1.js"></script>
<script type="text/javascript">
	$(function() {
		$('#b1').click(function() {
			$.ajax({
				url:"insert4",
				data: {
					oriid :<%=bag.getId()%> ,
					content: $('#reply').val() ,
					writer : '${user}'
				},
				success: function(response) { // 일반적으로 response씀
					$('#result').append(response)
				}
			}) //ajax
		}) // b1
	}) //$
</script>
</head>
<body bgcolor="yellow">
<%
	//컨트롤러에서 모델로 지정한 것 request.getAttribute("모델이름");
	List<ReplyDTO> list = (List<ReplyDTO>)request.getAttribute("list");
%>
게시판 id <%=bag.getId()%> <br>
게시판 title <%=bag.getTitle() %> <br>
게시판 content <%=bag.getContent()%> <br>
게시판 writer <%=bag.getWriter()%>
<hr color="red">
댓글달기 <input id="reply" value="나는 댓글!"><button id="b1">댓글달기</button>
<hr color="blue">
<div id="result">
	<% for(ReplyDTO dto : list){ %>
	- <%= dto.getId() %>, <%= dto.getContent() %>, <%= dto.getWriter() %> <br>
	<%} %>
</div>
</body>
</html>