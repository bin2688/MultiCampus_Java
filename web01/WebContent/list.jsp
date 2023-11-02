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
</head>
<body>
<table>
<% for(MemberVO bag: list){ %>
			<tr>
				<td class="left">id:</td>
				<td>
					<%=bag.getId() %>
				</td>
			</tr>
			<tr>
				<td class="left">pw:</td>
				<td>
					<%=bag.getPw() %>
				</td>
			</tr>
			<tr>
				<td class="left">name: </td>
				<td>
					<textarea cols="20" rows="5" name="content"><%=bag.getName()%></textarea>
				</td>
			</tr>
			<tr>
				<td class="left">tel: </td>
				<td>
					<%=bag.getTel()%>
				</td>
			</tr>
<% } //for %>
</table>
</body>
</html>