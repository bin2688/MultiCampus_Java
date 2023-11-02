<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="java.util.ArrayList"%>
<%@page import="bean.MemberVO"%>
<%@page import="bean.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    MemberDAO dao = new MemberDAO();
    
    ArrayList<MemberVO> list = dao.list();

    
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
 <td class="menu">아이디</td>
 <td class="menu">패스워드</td>
 <td class="menu">이름</td>
 <td class="menu">전화번호</td>
 <td class="menu">상세정보</td>
<tr>
<% for(MemberVO bag: list){ %>
			<tr>
				<td  class="deta"><%=bag.getId()%></td>			
				<td  class="deta"><%=bag.getPw()%></td>		
				<td  class="deta"><textarea cols="20" rows="5" name="content"><%=bag.getName()%></textarea></td>				
				<td  class="deta"><%=bag.getTel()%></td>
				<td  class="deta"><%=bag.getTel()%></td>
				<td  class="deta">
					<a href="one.jsp?id=<%=bag.getId()%>">
						<button style="background: gold">상세정보보기</button>
					</a></td>
			</tr>
<% } //for %>
</table>
</body>
</html>