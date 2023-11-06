
<%@page import="bean.Company2DAO"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    //1. 브라우저로부터 넘어온 데이터를 받아서 dto를 만들어서 dto에 넣어준다.
    //액션태그사용
    //2. dao객체 생성해서 dto를 주면서 insert(dto)요청
    %>
	<jsp:useBean id="bag" class="bean.Company2DTO"></jsp:useBean>
	<jsp:setProperty property="*" name="bag"/>
	<%
	Company2DAO dao = new Company2DAO();
	int result = dao.insert(bag);
	%><%= result %>