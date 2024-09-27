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
		<th>ȸ�� ���̵�</th>
		<th>���� ����</th>
		<th>�ۼ���</th>
		<th>�������</th>
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
