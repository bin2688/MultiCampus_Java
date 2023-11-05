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
		$.ajax({
			url: "https://api.rss2json.com/v1/api.json?rss_url=https%3A%2F%2Fwww.chosun.com%2Farc%2Foutboundfeeds%2Frss%2Fcategory%2Fentertainments%2F%3FoutputType%3Dxml&api_key=ocald5gczwyncv0feqewnacyz8v8qy4husjmvmaq",
			success: function(x) {
				console.log(x) //브라우저 콘솔에 출력
				list = x.items //[{title.., content..,},{},{}]
				for(let i = 0; i< list.length; i++){
				console.log(list[i].title)
				console.log(list[i].link)
				console.log(list[i].content)
				aTag = "<a href=" + list[i].link + ">" + list[i].title + "</a>"
				 $('#d1').append(aTag + " " + list[i].content)  
				 //append()기존에 있는거에 붙여줌, html()은 다 덮어쓰는 것
				}
			}, // success
			error: function(e) {
				alert('에러발생함.')
			} // error
		}) //ajax	
		$.ajax({
			url: " https://api.rss2json.com/v1/api.json?rss_url=https%3A%2F%2Fwww.chosun.com%2Farc%2Foutboundfeeds%2Frss%2Fcategory%2Fpolitics%2F%3FoutputType%3Dxml&api_key=ocald5gczwyncv0feqewnacyz8v8qy4husjmvmaq",
			success: function(x) {
				console.log(x) //브라우저 콘솔에 출력
				list = x.items //[{title.., content..,},{},{}]
				for(let i = 0; i< list.length; i++){
				console.log(list[i].title)
				console.log(list[i].link)
				console.log(list[i].content)
				aTag = "<a href=" + list[i].link + ">" + list[i].title + "</a>"
				 $('#d1').append(aTag + " " + list[i].content)  
				 //append()기존에 있는거에 붙여줌, html()은 다 덮어쓰는 것
				}
			}, // success
			error: function(e) {
				alert('에러발생함.')
			} // error
		}) //ajax	
	}) //$
	
</script>
</head>
<body background="green">
<h3>신문뉴스 데이터 받아오기(ajax로)</h3>
<div>
	<div id="top">
		<jsp:include page="ajaxtop.jsp"></jsp:include> <!-- 액션태그(동적으로처리) -->
	</div>
	<hr>
	<div id= "d1"></div>
	
</div>	
</body>
</html>