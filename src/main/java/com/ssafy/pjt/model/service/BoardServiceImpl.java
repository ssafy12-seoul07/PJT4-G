package com.ssafy.pjt.model.service;

import java.util.List;

import com.ssafy.pjt.model.dto.Board;
import com.ssafy.pjt.model.dto.Review;
import com.ssafy.pjt.model.repository.BoardRepository;
import com.ssafy.pjt.model.repository.BoardRepositoryImpl;

public class BoardServiceImpl implements BoardService {

	private static BoardService service = new BoardServiceImpl();
	private BoardRepository repo = BoardRepositoryImpl.getInstance();

	private BoardServiceImpl() {
	}

	public static BoardService getInstance() {
		return service;
	}

	@Override
	public List<Board> getList() {
		return repo.selectAll();
	}

	@Override
	public Board getBoard(String videoId) {
		repo.updateViewCnt(videoId);
		return repo.selectOne(videoId);
	}

	@Override
	public void writeReview(Review review) {
		repo.insertReview(review);

	}

	@Override
	public void modifyReview(Review review) {
		repo.updateReview(review);

	}

	@Override
	public void deleteReview(Review review) {
		repo.deleteReview(review);

	}

}
