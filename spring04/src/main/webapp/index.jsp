<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <title>북마크 서비스</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <!-- 부트스트랩 CDN 링크 -->
  <link href="https://stackpath.bootstrapcdn.com/bootstrap/5.1.3/css/bootstrap.min.css" rel="stylesheet">
  <style>
    /* 추가한 사용자 정의 CSS 스타일 */
    body {
      background-color: #f8f9fa;
      font-family: Arial, sans-serif;
      margin: 20px;
    }
    
    h3 {
      color: #343a40;
    }

    form {
      background-color: #fff;
      padding: 20px;
      border-radius: 10px;
      box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
      margin-bottom: 20px;
    }

    input[type="text"] {
      border-radius: 5px;
      padding: 8px;
      margin-bottom: 10px;
    }

    button[type="submit"] {
      padding: 8px 20px;
      border-radius: 5px;
      background-color: #007bff;
      color: #fff;
      border: none;
    }

    button[type="submit"]:hover {
      background-color: #0056b3;
    }
  </style>
</head>
<body>
  <img src="resources/img/kakao.jpg" width="500" height="300">
  <h3>북마크 정보 검색</h3>
  <form action="one">
    아이디: <input type="text" name="id"><br>
    <button type="submit">서버로 전송</button>
  </form>
  <hr>
  <h3>북마크 전체 검색</h3>
  <a href="list"> 
    <button>전체 검색 요청</button>
  </a>
  <hr>
  <h3>북마크 추가</h3>
  <form action="insert">
    아이디: <input type="text" name="id"> <br>
    이름: <input type="text" name="name"> <br>
    URL: <input type="text" name="url"> <br>
    IMG: <input type="text" name="img"> <br>
    <button type="submit">서버로 전송</button>
  </form>
  <hr>
  <h3>북마크 수정</h3>
  <form action="update">
    아이디: <input type="text" name="id"> <br>
    이름: <input type="text" name="name"> <br>
    <button type="submit">서버로 전송</button>
  </form>
  <h3>북마크 삭제</h3>
  <form action="delete">
    삭제할 아이디: <input type="text" name="id"> <br>
    <button type="submit">서버로 전송</button>
  </form>
</body>
</html>