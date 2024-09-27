<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix ="c" uri = "jakarta.tags.core" %>
<%@ page import="java.util.*" %>
<%@ page import="com.ssafy.pjt.model.dto.Review" %>
<%@ page import="com.ssafy.pjt.model.dto.Board" %>

    



<table>
	<tr>
		<th>회원 아이디</th>
		<th>리뷰 내용</th>
		<th>작성자</th>
		<th>등록일자</th>
	</tr>
	
	<c:forEach items ="${list }" var="review"> 
		<tr>
			<td>${review.id }</td>	
			<td>${review.content }</td>	
			<td>${review.writer }</td>	
			<td>${review.regDate }</td>	
		</tr>
		
	</c:forEach>
</table>
