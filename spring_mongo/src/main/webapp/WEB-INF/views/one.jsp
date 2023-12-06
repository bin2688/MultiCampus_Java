<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="UTF-8">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>하나 검색</title>
    <style>
        /* Add your CSS styles here */
        table {
            width: 100%;
            border-collapse: collapse;
            margin-bottom: 20px;
        }

        th, td {
            border: 1px solid #ddd;
            padding: 8px;
            text-align: left;
        }

        th {
            background-color: #f2f2f2;
        }
    </style>
</head>
<body>
<form action="update.memo">
    <table>
        <thead>
            <tr>
                <th>항목명</th>
                <th>값</th>
            </tr>
        </thead>
        <tbody>
            <tr>
                <td>번호 :</td>
                <td>
                <input name="_id" value="${vo._id}" type="hidden">
                </td>
            </tr>
            <tr>
                <td>이름 :</td>
                <td>
                <input name="name" value="${vo.name}" readonly="readonly">
                </td>
            </tr>
            <tr>
                <td>내용 :</td>
                <td>
                <input name="content" value="${vo.content}" style="background: blue">
                </td>
            </tr>
            <tr>
                <td>날씨 :</td>
                <td>
                <input name="weather" value="${vo.weather}" readonly="readonly">
                </td>
            </tr>
            <tr>
                <td>날짜 :</td>
                <td>
                <input name="date" value="${vo.date}" readonly="readonly">
                </td>
            </tr>
        </tbody>
    </table>
<a href="update.memo">
	<button style="background: lime">메모수정요청</button>
</a>
</form>
<a href="delete.memo?_id=${vo._id}">
	<button style="background: lime">메모삭제요청</button>
</a>
<a href="list.memo">
	<button style="background: lime">전체메모요청</button>
</a>
</body>
</html>