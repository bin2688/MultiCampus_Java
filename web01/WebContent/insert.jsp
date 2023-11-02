<%@page import="bean.MemberVO"%>
<%@ page import="bean.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!--
    jsp에서 해야하는 작업 3가지.
    1. form안에 입력한 데이터 받아서 저장해두자.  ==> java
    2. 받은 데이터를 DAO에게 주자.  ==> java
    3. 결과를 html로 만들자.  ==> html
      -->
      <% //자바코드를 넣는 스크립트릿(let, 릿, 작은 프로그램, 작은 코드블럭)
      //HttpSevletRequest request = new HttpSevletRequest();
      //미리 톰킷에서 자주 사용하는 부품은 new를 이용해서 객체를 만들어놨음
      //미리 만들어서 제공하는 객체(부품) ==> 내장된 객체
      //클라이언트로부터 데이터를 받아오는 객체 ==> request
      //1. form안에 입력한 데이터 받아서 저장해두자.
      String id = request.getParameter("id"); //input안에 있는 name="id"값을 가져온다.
      String pw = request.getParameter("pw"); //input안에 있는 name="id"값을 가져온다.
      String name = request.getParameter("name"); //input안에 있는 name="id"값을 가져온다.
      String tel = request.getParameter("tel"); //input안에 있는 name="id"값을 가져온다.
      
      //2. DAO에 데이터를 주소 DB처리 요청
      //jsp = java + html
      MemberDAO dao = new MemberDAO();
      MemberVO bag = new MemberVO();
      bag.setId(id);
      bag.setPw(pw);
      bag.setName(name);
      bag.setTel(tel);
      
      dao.insert(bag);
      //3. 결과를 html로 만들어서 클라이언트에 전송
      %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h5>당신이 입력한 회원정보를 확인해주세요.</h5>
<hr color="green">
가입한 아이디는 <%= id %> <br> <!--id변수에 있는 것 보여줘(프린트) -->
가입한 패스워드는 <%= pw %> <br>
가입한 이름은 <%= name %> <br>
가입한 전화번호는 <%= tel %> <br>
</body>
</html>