<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix ="c" uri = "jakarta.tags.core" %>
<%@ page import="java.util.*" %>
<%@ page import="com.ssafy.pjt.model.dto.Review" %>
<%@ page import="com.ssafy.pjt.model.dto.Board" %>

    

<%-- <%
	Board board = (Board) request.getAttribute("board");
	List<Review> list = (List<Review>) board.getReviewList().values();
%> --%>

<table>
	<tr>
		<th>ȸ�� ���̵�</th>
		<th>���� ����</th>
		<th>�ۼ���</th>
		<th>�������</th>
	</tr>
	
	<%-- <c:forEach items ="${list }" var="Review"> 
		<tr>
			<td>${Review.id }</td>	
			<td>${Review.content }</td>	
			<td>${Review.writer }</td>	
			<td>${Review.regDate }</td>	
		</tr>
		
	</c:forEach>  --%>
</table>
