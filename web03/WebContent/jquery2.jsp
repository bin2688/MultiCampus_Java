<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-3.7.1.js"></script>
<script type="text/javascript">
	$(function() {
		$('#b1').click(function() {
			let yearValue = $('#year').val()
			let year2 = 2023
			let age = year2 - parseInt(yearValue);
			alert('당신의 나이는 ' + age)
		})
		$('#b2').click(function() {
			let wValue = $('#w').val()
			let hValue = $('#h').val()
			let result = parseFloat(wValue) * parseFloat(hValue)
			alert('사각형의 면적은' + result)
		})
	})
</script>
</head>
<body>

태어난 해 입력: <input name="year" id="year" value="2000"> 
			<button id="b1">나이계산</button><br>
사각형의 면적은 <input name="w" id="w"> 세로: <input name="h" id="h"> 
			<button id="b2">사각형의 면적계산</button>
</body>
</html>