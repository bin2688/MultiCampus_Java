<%@page import="java.util.ArrayList"%>
<%@page import="bean.ProductDAO"%>
<%@page import="bean.ProductDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="css/project.css">
<!-- Latest compiled and minified CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">

<!-- Latest compiled JavaScript -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>

</head>
<body>
<div id="total">
	<div id="top">
		<jsp:include page="top.jsp"></jsp:include> <!-- 액션태그(동적으로처리) -->
	</div>
	<div id="top2">
		<jsp:include page="top2.jsp"></jsp:include>
	</div>
	<div id="center">
	<% if(session.getAttribute("id") != null) { %>
		<%=session.getAttribute("id")%>님 로그인 되었습니다.
		<a href="logout.jsp">
				<button type="button" class="btn btn-danger">
				<span class="spinner-grow spinner-grow-sm"></span>로그아웃</button>
			</a>
		<% } %>
		<%
		ProductDAO dao = new ProductDAO();
		ArrayList<ProductDTO> list = dao.list();
		%>
		<table border="1" class="table table-hover">
				<thead>
					<tr class="table-warning">
						<td>상품명</td>
						<td>상품가격</td>
						<td>상품이미지</td>
					</tr>
				</thead>
				<tbody>
				<% for(ProductDTO bag: list) { %>
					<tr class="table-info">
						<td>
						<a href="product2.jsp?id=<%= bag.getId() %>"><%=bag.getTitle()%></a>
						</td>
						<td><%=bag.getPrice() %></td>
						<td><img src="img/<%=bag.getImg()%>" width="150" height="100"></td>
					</tr>
				<% }%>
				</tbody>
		</table>
	</div>
</div>
</body>
</html>