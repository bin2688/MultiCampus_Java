
<%@page import="bean.ProductDTO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <jsp:useBean id="bag" class="bean.ProductDTO"></jsp:useBean>
    <jsp:setProperty property="*" name="bag"/>
    
    <%
    //bag에 데이터가 들어가 있지 않으면 장바구니에 추가하지 말아라.
   	    ArrayList<ProductDTO> list = null;
   	    String s = "";
    	if(bag.getId() != null){
			if(session.getAttribute("basket") == null){
    		list = new ArrayList<>();
			}else{
			list = (ArrayList<ProductDTO>)session.getAttribute("basket");	
			}
   			list.add(bag);
   			session.setAttribute("basket", list);
    	}else{
    		if (session.getAttribute("basket") == null) {
    			s = "장바구니에 아무것도 들어있지 않음.";
    		} else {
    			list = (ArrayList<ProductDTO>) session.getAttribute("basket");
    		}
    	}
    	%>
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
	<% if(session.getAttribute("basket") != null) { %>
	<br> 장바구니 개수 <%=list.size() %>개 
		<%=session.getAttribute("id")%>님 로그인 되었습니다.
		<a href="logout.jsp">
				<button type="button" class="btn btn-danger">
				<span class="spinner-grow spinner-grow-sm"></span>로그아웃</button>
			</a>
		<% } 
			if(session.getAttribute("basket") != null){
		%>
			<hr>
			<table class="table tablehover">
			<tr>
				<td>아이디</td>
				<td>물건이름</td>
				<td>가격</td>
				<td>주문하기</td>
			</tr>
			<% for(ProductDTO bag2: list) {%>
			<tr>
				<td><%= bag2.getId() %></td>
				<td><%= bag2.getTitle() %></td>
				<td><%= bag2.getPrice()%></td>
				<td><button>주문하기</button></td>
			</tr>
			<%}//for %>
			</table>
		<%}//if %>
	</div>
</div>
</body>
</html>