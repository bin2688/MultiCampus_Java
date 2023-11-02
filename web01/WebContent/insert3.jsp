<%@page import="bean.ProductVO"%>
<%@page import="bean.ProductDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   
      <% 
      String id = request.getParameter("id"); 
      String name = request.getParameter("name"); 
      String content = request.getParameter("content"); 
      String price = request.getParameter("price"); 
      String company = request.getParameter("company"); 
      String img = request.getParameter("img"); 
      //2. DAO에 데이터를 주소 DB처리 요청
   	  ProductDAO dao = new ProductDAO();
      ProductVO bag = new ProductVO();
      bag.setId(id);
      bag.setName(name);
      bag.setContent(content);
      bag.setPrice(Integer.parseInt(price));
      bag.setCompany(company);
      bag.setImg(img);
      
      dao.insert(bag);
      
      //3. 결과를 html로 만들어서 클라이언트에 전송
      %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h5>제품정보가 등록되었습니다.</h5>
<hr color="green">
등록된 제품은 <%= id %>,<%= name %>,<%=content%>,<%=price%>,<%=company%>,<%=img%>
</body>
</html>