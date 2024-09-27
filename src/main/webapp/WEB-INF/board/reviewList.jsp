<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix ="c" uri = "jakarta.tags.core" %>
<%@ page import="java.util.*" %>
<%@ page import="com.ssafy.pjt.model.dto.Review" %>
<%@ page import="com.ssafy.pjt.model.dto.Board" %>

    

<%
	Board board = (Board) request.getAttribute("board");
	List<Review> list = (List<Review>) board.getReviewList().values();
%>

<table>
	<tr>
		<th>회원 아이디</th>
		<th>리뷰 내용</th>
		<th>작성자</th>
		<th>등록일자</th>
		</tr>
	
	<c:forEach items ="${list }" var="Review"> 
		<tr>
			<tb>${Review.id }</tb>	
			<tb>${Review.content }</tb>	
			<tb>${Review.writer }</tb>	
			<tb>${Review.regDate }</tb>	
			<tb><a href="board.action=detail&id="${board.id }">{board.title}</a></tb>
			
		</tr>
		
	</c:forEach> 
</table>
