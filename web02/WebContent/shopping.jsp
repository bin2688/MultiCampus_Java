<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%
    //댓글을 쓸 때 로그인했을 때와 하지않았을 때 화면이 다름.
    //로그인했을 때, 안했을 때 판단을 세션에 id가 저장되어있는지 확인해서 판단한다.
    if(session.getAttribute("id") == null){
    	//id라는 이름으로 저장된 세션이 없다.
    	out.print("로그인되지 않았습니다. 먼저 로그인을 해주세요");
    	out.print("로그인 아이디: <input name=id>");
    }else{
    	//id라는 이름으로 저장된 세션이 있다.  	
    	out.print(session.getAttribute("id") + "님이 로그인되었습니다.");
    	
    }
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
쇼핑 페이지 - 로그인되었을 때만 구매목록을 확인할 수 있습니다.
</body>
</html>