<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<%@ page import="com.ssafy.pjt.model.dto.Review" %>
<%@ page import="com.ssafy.pjt.model.dto.Board" %>
<%@ taglib prefix ="c" uri = "jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상세 페이지</title>
</head>
<body>
	<div>${board.title }</div>
	<div>${board.part }</div>
	<div>${board.channelName }</div>
	<div>${board.viewCnt }</div>
	<div>${board.regDate }</div>
	
	<%@ include file="reviewList.jsp"  %>c
<%-- 	<jsp:include page="reviewList.jsp"></jsp:include> --%>

<!-- <table> -->
<!-- 	<tr> -->
<!-- 		<th>회원 아이디</th> -->
<!-- 		<th>리뷰 내용</th> -->
<!-- 		<th>작성자</th> -->
<!-- 		<th>등록일자</th> -->
<!-- 	</tr> -->
	
<%-- 	<c:forEach items ="${list }" var="review">  --%>
<!-- 		<tr> -->
<%-- 			<td>${review.id }</td>	 --%>
<%-- 			<td>${review.content }</td>	 --%>
<%-- 			<td>${review.writer }</td>	 --%>
<%-- 			<td>${review.regDate }</td>	 --%>
<!-- 		</tr> -->
		
<%-- 	</c:forEach> --%>
<!-- </table> -->


	<form action="main" method="post">
		<input type="hidden" name="action" value="write">
		<input type="hidden" name="videoId" value="${board.videoId}">
				
		<div>
			작성자 :  <input type="text" name="writer" value="익명">
		</div>
		<div>
			내용 :  <textarea rows="10" cols="30" name="content"></textarea>
		</div>
		<input type="submit" value="리뷰 등록">
	</form>
	
	<a href="main?action=remove&id=${board.videoId }">삭제</a>
	<a href="main?action=updateform&id=${board.videoId }">수정</a>
</body>
</html>