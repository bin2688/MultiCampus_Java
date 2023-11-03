<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String id = request.getParameter("id");
	String[] list = {"root", "admin", "hong"};
	
	String result = "사용가능한 아이디입니다.";
	for(String s : list){
		if(s.equals(id)){
			result = "이미 사용중인 아이디입니다.";
			break;
	    }
	}
%>
<%= result %>
