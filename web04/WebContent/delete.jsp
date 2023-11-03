<%@page import="bean.BbsDTO2"%>
<%@page import="bean.BbsDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 
	1. id를 받아서 dto에 저장
	2. dao db처리하고
	3. 성공하면 bbs.jsp로 넘어가자.
		bbs.jsp로 넘어가기 전에 alert()를 띄어주자.
 -->
 <!-- 1 -->
 	<jsp:useBean id="bag" class="bean.BbsDTO2"></jsp:useBean>
 	<<jsp:setProperty property="id" name="bag"/>
 	
 <!-- 2 -->	
 	<%
 		BbsDAO dao = new BbsDAO();
 		int result = dao.delete(bag);
 		if(result == 1){
 	%>	
 		<script>
 		alert('삭제성공!!')
 		location.href="bbs.jsp"
 		</script>		
 	<% 
 		}else{
    %>
 	<script>
 		alert('삭제중에 문제가 발생했습니다.')
 		</script>
 	
 	<% } %>
</body>
</html>