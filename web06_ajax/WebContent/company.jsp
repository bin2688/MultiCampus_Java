<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-3.7.1.js"></script>
<script type="text/javascript">
//body태그에 있는 것 중에서 특정한 것을 선택한 이후에
//그 선택된 것이 이벤트가 발생했을 때 입력값으로 사용한 이름없는 함수를 실행시켜줘!
//콜백함수 
$(function() {
	$('#b1').click(function() {
		$.ajax({
			url: "data/company_mock.json",
			success: function(json) {
				
				for(let i = 0; i < json.length; i++){
					console.log(json[i].addr)
					console.log(json[i].domain)
					console.log("-----------")
					
				}
			}// success	
		}) //ajax
	})//b1
})//$
</script>
</head>
<body>
<button id="b1">company_mock.json읽어와서 추출하기</button>
<button id="b2">company_mock.xml읽어와서 추출하기</button>
</body>
</html>