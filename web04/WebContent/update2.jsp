<%@page import="bean.BbsDTO2"%>
<%@page import="bean.BbsDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 
	1. 앞 페이지에서 전달된 데이터들을 가방을 만들어서 다 집어넣기
	2. dao db처리하고
	3. dao로부터 받은 결과가 1이면 alert("수정성공") ->bbs.jsp로 넘어감
	4. 받은 결과가 1이아니면 alert("수정 처리중 문제가 발생했습니다")
 -->
 <!-- 1 -->
 	<jsp:useBean id="bag" class="bean.BbsDTO2"></jsp:useBean>
 	<jsp:setProperty property="*" name="bag"/>
 	
 <!-- 2 -->	
 	<%
 		BbsDAO dao = new BbsDAO();
 		int result = dao.update(bag);
 		if(result == 1){
 	%>	
 		<script>
 		alert('수정성공!!')
 		location.href="bbs.jsp"
 		</script>		
 	<% 
 		}else{
    %>
 	<script>
 		alert('수정 처리중에 문제가 발생했습니다.')
 		</script>
 	
 	<% } %>
</body>
</html>