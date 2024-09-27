<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>영상 등록</title>
</head>
<body>
	<h2>영상 수정</h2>
	<form action="board" method="post">
		<input type="hidden" name="action" value="update">
		<input type="hidden" name="id" value="${board.id }">
		<div>
			글 제목 :  <input type="text" name="title" value="${board.title }">
		</div>
		<div>
			글 쓰니 :  <input type="text" name="writer" value="${board.writer }">
		</div>
		<div>
			글 내용 :  <textarea rows="10" cols="30" name="content">${board.content }</textarea>
		</div>
		<input type="submit" value="게시글 수정">
	</form>
</body>
</html>