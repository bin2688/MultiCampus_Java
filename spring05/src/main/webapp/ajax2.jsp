<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="resources/js/jquery-3.7.1.js"></script>
<script type="text/javascript">
	//jquery는 버튼하나당 함수하나!, 요청하나당 함수하나	
	//특정한 이벤트가 발생하기를 기다렸다가
	//이벤트가 발생하면 자동으로 함수를 실행시켜주는 방식의 함수를 사용함. ==> 콜백함수
	//$() == document.ready()
	$(function() {
		$('#b1').click(function() {
			$.ajax({ //json				
				url: "test",
				success: function(x) { //브라우저가 http통신 결과를 받아온다. - 파라메터값넣기
					alert("ajax통신결과 >>" + x)
					$('#result').html(x)
				} //success	
			}) //ajax
		}) //b1
		$('#b2').click(function() {
			$.ajax({ //json				
				url: "test2",
				success: function(x) { //브라우저가 http통신 결과를 받아온다. - 파라메터값넣기
					alert("b2 ajax호출 실행결과 >>" + x)
					$('#result').html(x)
				} //success	
			}) //ajax
		}) //b1
	}) //$
</script>
</head>
<body>
	<button id="b1">컴퓨터 구매항목 확인</button>
	<button id="b2">클릭</button>
	<hr color="red">
	<div id="result">ajax통신 결과 들어가는 곳.</div>
</body>
</html>