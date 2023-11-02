
<%@page import="bean.BbsVO"%>
<%@page import="bean.BbsDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
     String no = request.getParameter("no");
    
    BbsDAO dao = new BbsDAO();
	BbsVO bag = dao.one(Integer.parseInt(no));
    
    %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	body {
		background: lime;
	}
 	*{
  		font-size: 20px;
 	}
 	.left {
 		width: 100px;
 		background: blue;
 		color: white;
 	}
 	#bottom {
 		background: red;
 		color: yellow;
 	}
 	input{
 		background: greenyellow;
 	}
 	textarea{
 		background: greenyellow;
 	}
</style>
</head>
<body>
<table border="1" align="center">
			<tr>
				<td class="left">번호: </td>
				<td>
					<%=bag.getNo() %>
				</td>
			</tr>
			<tr>
				<td class="left">제목: </td>
				<td>
					<%=bag.getTitle() %>
				</td>
			</tr>
			<tr>
				<td class="left">내용: </td>
				<td>
					<textarea cols="20" rows="5" name="content"><%=bag.getContent()%></textarea>
				</td>
			</tr>
			<tr>
				<td class="left">작성자: </td>
				<td>
					<%=bag.getWriter()%>
				</td>
			</tr>
		
		</table>
</body>
</html>