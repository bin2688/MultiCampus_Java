<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    //브라우저에 심어놓은 쿠키들을 한꺼번에 다 가지고 온다.
    //브라우저 --> 서버, request
    Cookie[] cookies = request.getCookies();
    String apple = "";
    String ice = "";
    //==> 서블릿으로 변환될 때 service()안으로 코드가 다 들어가 생성.
    int sum = 0;	
    for(Cookie c : cookies){
    	if(c.getName().equals("apple") || c.getName().equals("ice")){
    	out.print(c.getName() + " " + c.getValue() + "<br>");
    	sum = sum + Integer.parseInt(c.getValue());
    	}
    }
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
애플과 아이스의 값은<%=sum%>

</body>
</html>