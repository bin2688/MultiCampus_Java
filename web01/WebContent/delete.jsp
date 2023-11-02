<%@page import="bean.MemberVO"%>
<%@page import="bean.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
     String id = request.getParameter("id");
    
    MemberDAO dao = new MemberDAO();
    
    int result = dao.delete(id);
    String resultText = "회원탈퇴실패함";
    
    if(result == 1){
    	resultText = "회원탈퇴성공함";
    }
    
    %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h4><%= resultText %></h4>
</body>
</html>