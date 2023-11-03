<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%  String money = request.getParameter("money");
	String choice = request.getParameter("choice");
	int money2 = Integer.parseInt(money);
	switch(choice){
	case "1" : money2 = money2 - 1000; break; //switch는 브레이크 걸어야함. 안걸면 뒤에도 다실행
	case "2" : money2 = money2 + 1000;
	}
%>
<%= money2 %>
