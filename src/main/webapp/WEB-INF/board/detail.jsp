<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상세 페이지</title>
</head>
<body>
	<div>${board.title }</div>
	<div>${board.writer }</div>
	<div>${board.viewCnt }</div>
	<div>${board.regDate }</div>
	
	<%@ include file="reviewList.jsp"  %>
	
	<form action="main" method="post">
		<input type="hidden" name="action" value="write">
		<input type="hidden" name="videoId" value="${board.id}">
				
		<div>
			작성자 :  <input type="text" name="writer" value="익명">
		</div>
		<div>
			내용 :  <textarea rows="10" cols="30" name="content"></textarea>
		</div>
		<input type="submit" value="리뷰 등록">
	</form>
	
	<a href="board?action=delete&id=${board.id }">삭제</a>
	<a href="board?action=updateform&id=${board.id }">수정</a>
</body>
</html>