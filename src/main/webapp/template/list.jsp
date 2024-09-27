<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<table>
	<tr>
		<th>ID</th>
		<th>제목</th>
		<th>부위</th>
		<th>조회수</th>
		<th>채널명</th>
	</tr>
	
	<tr>
		<td>${board.id }</td>
		<td><a href="board?action=detail&id=${board.id} ">${board.title }</a></td>
		<td>${board.part }</td>
		<td>${board.viewCnt }</td>
		<td>${board.channelName }</td>
	</tr>
	
</table>
