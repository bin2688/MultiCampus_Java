<%@page import="bean.BbsVO"%>
<%@page import="bean.BbsDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

      <% 
      String title = request.getParameter("title");
      String content = request.getParameter("content"); 
      String no = request.getParameter("no"); 
  
      BbsDAO dao = new BbsDAO();
      
      int result = dao.update(title, content, Integer.parseInt(no));
       String resultText = "수정실패";
      if(result ==1){
      resultText = "수정성공";
      }

      %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h5>당신이 입력한 게시판정보를 확인해주세요.</h5>
<hr color="green">
<%=resultText%>
</body>
</html>