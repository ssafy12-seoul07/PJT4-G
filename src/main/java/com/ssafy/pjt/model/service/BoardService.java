package com.ssafy.pjt.model.service;

import java.util.List;

import com.ssafy.pjt.model.dto.Board;
import com.ssafy.pjt.model.dto.Review;

public interface BoardService {
	// 전체 게시글 조회
	public abstract List<Board> getList(); // public abstract 생략가능

	// 게시글 조회
	public abstract Board getBoard(String videoId);

	// 댓글 작성
	public abstract void writeReview(Review review);

	// 댓글 수정
	public abstract void modifyReview(Review review);

	// 댓글 삭제
	public abstract void deleteReview(Review review);
	
	// 댓글 조회
	public abstract Review getReview(Review review);

}
