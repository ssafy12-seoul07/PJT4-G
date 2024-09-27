<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core"%>
<%@ page import="java.util.*" %>
<%@ page import="com.ssafy.pjt.model.dto.Board" %>
<%@ page import="com.ssafy.pjt.model.repository.BoardRepositoryImpl" %>
<%@ page import="com.ssafy.pjt.model.repository.BoardRepository" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>영상 목록</title>
</head>
<body>
	<table>
		<tr>
			<th>Video ID</th>
			<th>제목</th>
			<th>Part</th>
			<th>채널 이름</th>
			<th>조회 수</th>
			<th>등록일</th>
		</tr>
		
		<c:foreach items="${list }" var="video">
			<tr>
				<th>${video.videoId }</th>
				<th><a href="board?action=detail&id=${video.id }">${video.title }</a></th>
				<th>${video.part }</th>
				<th>${video.channelName }</th>
				<th>${video.viewCnt }
				<th>${video.regDate }</th>
			</tr>
		</c:foreach>
			
	</table>
</body>
</html>