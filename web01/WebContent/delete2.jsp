
<%@page import="bean.BbsDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
     String no = request.getParameter("no");
    
    BbsDAO dao = new BbsDAO();
    int result = dao.delete(Integer.parseInt(no));
    
   
    String resultText = "게시판탈퇴실패함";
    String resultImg = "3.png";
    
    if(result == 1){
    	resultText = "게시판탈퇴성공함";
    	resultImg = "1.png";
    }
    
    %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h4><%= resultText %></h4> <br>
<img src="img/<%=resultImg %>"> <!--이미지가 폴더안에 있어서 폴더위치도 척어줘야함 -->
</body>
</html>