
<%@page import="bean.BbsVO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="bean.BbsDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    BbsDAO dao = new BbsDAO();
    
    ArrayList<BbsVO> list = dao.list(); 
    %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	body {
		background: gray;
	}

 	.deta {
 		width: 100px;
 		background: blue;
 		color: white;
 	}
	.menu {
		color: red;
		background: black;
	}

</style>
</head>
<body>
<table border="1" align="center">
<tr>
 <td class="menu">번호</td>
 <td class="menu">제목</td>
 <td class="menu">내용</td>
 <td class="menu">작성자</td>
<tr>
<% for(BbsVO bag: list){ %>
			<tr>
				<td  class="deta"><%=bag.getNo()%></td>		
		
				<td  class="deta">
				<a href="one2.jsp?no=<%=bag.getNo()%>"><%=bag.getTitle() %></a>
				</td>		
			
				<td  class="deta"><textarea cols="20" rows="5" name="content"><%=bag.getContent()%></textarea></td>		
			
				<td  class="deta"><%=bag.getWriter()%></td>
				
			</tr>
<% } //for %>
</table>
</body>
</html>