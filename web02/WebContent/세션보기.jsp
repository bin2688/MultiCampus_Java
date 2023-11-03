<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    	out.print(session.getAttribute("name") + "<br>"); // == ${name}
    	out.print(session.getAttribute("age") + "<br>"); // == ${age}

    	//if(session.getAttribute("age") != null){
    	int age2 = (int)session.getAttribute("age"); 
    	//}
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<hr color="red">
세션에 저장된 name 값은 ${name} <br> <!--자주쓰는 속성값은 $로도 가능  -->
세션에 저장된 age 값은 ${age} <br>
내년나이는 <%=age2 + 1%>세
</body>
</html>