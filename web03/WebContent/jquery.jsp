<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">


	function age() {
		alert('나이계산처리할 예정');
		let yearTag = document.getElementById('year');
		let yearValue = yearTag.value; //string이라 숫자로 바꿔주어야함.  parseInt(),  parseFloat()
		let year2 = 2023;
		let age = year2 - parseInt(yearValue);
		alert('당신의 나이는' + age);
	}
	function rec() {
		alert('사각형의 면적 계산처리할 예정');
		let wTag = document.getElementById('w')
		let wValue = wTag.value;
		let hTag = document.getElementById('h')
		let hValue = hTag.value
		let result = parseFloat(wValue) * parseFloat(hValue)
		alert('사각형의 면적은' + result)
		
		
	}
</script>
</head>
<body>
태어난 해 입력: <input name="year" id="year" value="2000"> <button onclick="age()">나이계산</button><br>
사각형의 면적은 <input name="w" id="w"> 세로: <input name="h" id="h"> <button onclick="rec()">사각형의 면적계산</button>
<hr>
</body>
</html>