<%@page import="bean.MemberVO"%>
<%@page import="bean.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
     String id = request.getParameter("id");
    
    MemberDAO dao = new MemberDAO();
	MemberVO bag = dao.one(id);
    
    %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
검색해온 id: <%=bag.getId()%> <br> <!-- =을 쓸땐 끝에 ;를 붙이지않는다  -->
검색해온 pw: <%=bag.getPw()%> <br>
검색해온 name: <%=bag.getName()%> <br>
검색해온 tel: <%=bag.getTel()%> <br>
</body>
</html>