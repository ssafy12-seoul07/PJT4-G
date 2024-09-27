package com.ssafy.pjt.model.repository;

import java.util.List;

import com.ssafy.pjt.model.dto.Board;
import com.ssafy.pjt.model.dto.Review;

public interface BoardRepository {
	//전체 게시글 가져오기
	public abstract List<Board> selectAll();

	//게시글 조회하기
	public abstract Board selectOne(String videoId);

	//게시글 조회수 증가
	public abstract void updateViewCnt(String videoId);
	
	// 댓글 작성
	public abstract void insertReview(Review review);
	
	// 댓글 수정
	public abstract void updateReview(Review review);
	
	// 댓글 삭제
	public abstract void deleteReview(Review review);

	// 댓글 조회
	public abstract Review selectOneReview(Review review);

}
