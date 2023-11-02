
<%@page import="bean.ProductVO"%>
<%@page import="bean.ProductDAO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    ProductDAO dao = new ProductDAO();
    ArrayList<ProductVO> list = dao.list(); 
    %>
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	body {
		background: white;
	}

 	.deta {
 		width: 100px;
 		background: blue;
 		color: white;
 	}
	.menu {
		color: red;
		background: orange;
	}

</style>
</head>
<body>
<h3>상품목록입니다.</h3>
<table border="1" align="center">
<tr>	
 	<td class="menu">상품번호</td>
 	<td class="menu">상품명</td>
 	<td class="menu">상품가격</td>
 	<td class="menu">상품이미지</td>
</tr>
<% for(ProductVO bag: list){ %>
			<tr>
				<td  class="deta"><%=bag.getId()%></td>				
				<td  class="deta">
				<a href="one3.jsp?id=<%=bag.getId()%>"><%=bag.getName()%></a></td>			
				<td  class="deta"><%=bag.getPrice()%></td>
				<td  class="deta"><img src="img/<%=bag.getImg()%>" width="100"></td>
			</tr>
<% } //for %>
</table>
</body>
</html>