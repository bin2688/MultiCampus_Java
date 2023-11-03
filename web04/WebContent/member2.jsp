<%@page import="bean.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- 1. 입력한 값을 받아서 램에 넣어두기  -->
    <!-- 2. db처리하세요.!  -->
    <!-- 3. 결과를 알려주세요.(html) -->
    <!--bag을 만들어서 클라이언트로부터 넘어온 데이터를 bag에 넣어서  ㄴㅇㅁㄴㅇ -->
    <jsp:useBean id="bag" class="bean.MemberDTO"></jsp:useBean>
    <jsp:setProperty property="*" name="bag"/>
    <%
    	MemberDAO dao = new MemberDAO();
    	int result = dao.insert(bag);
    	String resultText = "";
    	if(result ==1) {
    		resultText = "회원가입에 성공했습니다";
    	}else{
    		resultText = "회원가입에 성공했습니다";
    	}
    %>
    
    <!-- 밑에 과정을  요약한게 윗줄 -->
    <%
/*    	String id = request.getParameter("id");
    	String pw = request.getParameter("id");
    	String name = request.getParameter("name");
    	String tel = request.getParameter("tel");
    	
    	 MemberDTO bag = new MemberDTO();
    	    bag.setId(id);
    	    bag.setPw(pw);
    	    bag.setName(name);
    	    bag.setTel(tel); 
    	*/

   
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/project.css">
<!-- Latest compiled and minified CSS -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css"
	rel="stylesheet">

<!-- Latest compiled JavaScript -->
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
	<div id="total">
		<div id="top">
			<jsp:include page="top.jsp"></jsp:include>
		</div>
		<div id="top2">
			<jsp:include page="top2.jsp"></jsp:include>
		</div>
		<div id="center">
 				<%=resultText %>
 		</div>
 <a href="member.jsp">회원가입/로그인페이지로 이동</a>
</body>
</html>