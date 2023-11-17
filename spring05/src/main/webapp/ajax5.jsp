<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="resources/js/jquery-3.7.1.js"></script>
<script type="text/javascript">

	$(function() {
		$('#b1').click(function() {
			$.ajax({ 			
				url: "test",
				success: function(x) { 
					alert("ajax통신결과 >>" + x)
					$('#result').html(x) 
				} //success	
			}) //ajax
		}) //b1
		$('#b2').click(function() {
			$.ajax({ //json				
				url: "test2",
				success: function(x) { 
					alert("b2 ajax호출 실행결과 >>" + x)
					$('#result').html(x)
				} //success	
			}) //ajax
		}) //b1
	}) //$
</script>
</head>
<body>
	<button id="b1">과일 목록을 가지고 와보자</button>
	<button id="b2">여행 목록을 가지고 와보자.</button>
	<hr color="red">
	<div id="result">ajax통신 결과 들어가는 곳.</div>
</body>
</html>