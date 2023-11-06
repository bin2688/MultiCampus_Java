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
		$('#b1').click(
				function() {
					$.ajax({
						url : "data/company_mock.json",
						success : function(json) {
							$(json).each(
									function(i, one) {
										//console.log(one.email)
										let idValue = one.id
										let nameValue = one.name
										let addrValue = one.addr
										let telValue = one.tel
										let domainValue = one.domain
										console.log(idValue + " " + nameValue+ " " + addrValue + " " + telValue + " " + domainValue)
										$.ajax({
											url : "db_create2.jsp",
											data : {
												id : idValue,
												name : nameValue,
												addr : addrValue,
												tel : telValue,
												domain : domainValue
											},
											success : function(result) {
												console.log(result) //'1'
												console.log(result.length)
												if (result.trim() == '1') {
													console.log('db저장 성공')
												} else {
													console.log('db저장 실패')
												}
											} // success
										}) // ajax
									}) //foreach
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