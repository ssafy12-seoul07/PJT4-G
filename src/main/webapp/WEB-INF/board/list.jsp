<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="jakarta.tags.core"%>

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

		<c:forEach items="${list }" var="video">
			<tr>
				<td>${video.videoId }</td>
				<td><a href="main?action=detail&id=${video.videoId }">${video.title }</a></td>
				<td>${video.part }</td>
				<td>${video.channelName }</td>
				<td>${video.viewCnt }</td>
				<td>${video.regDate }</td>
			</tr>
		</c:forEach>

	</table>
</body>
</html>