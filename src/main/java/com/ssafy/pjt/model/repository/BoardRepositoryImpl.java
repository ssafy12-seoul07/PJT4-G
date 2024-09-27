package com.ssafy.pjt.model.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ssafy.pjt.model.dto.Board;
import com.ssafy.pjt.model.dto.Review;

public class BoardRepositoryImpl implements BoardRepository {
	
	private static BoardRepository repo = new BoardRepositoryImpl();
	
	//게시글 관리 하겠다 
	// 메모리를 DB라고 생각
	private Map<String, Board> boards = new HashMap<>(); // 맵으로 관리 
	
	private BoardRepositoryImpl() {
//		boards.put("id", new Board("id", "title", "part", "channelName"));
		boards.put("50WCSpZtdmA", new Board("50WCSpZtdmA", "Shim EuDdeum 10 Minute Morning Stretch Everydayㅣ2023 Renewal", "전신", "힘으뜸"));
		boards.put("Kk7TQGqQ3nA", new Board("Kk7TQGqQ3nA", "하루 두 번🧘🏻‍♀️반드시 해야하는 20분 전신순환 스트레칭 Ep.08 - 피로회복, 디톡스, 심신안정, 혈액순환, 라인정리 효과 (Whole body stretch)", "전신", "빵느"));
		boards.put("MTU4iCDntjs", new Board("MTU4iCDntjs", "4 Minute OFFICE STRETCHING(full body)", "전신", "Allblanc TV"));
		boards.put("D3yExRi7EME&t=791s", new Board("D3yExRi7EME&t=791s", "뭉친 어깨, 뻣뻣한 골반 풀어주는 요가 | 앉아서 하는 요가 스트레칭 | 어깨 근육 풀기, 골반풀기", "상체", "Mindful Yoga with Eileen"));
		
	}
	
	public static BoardRepository getInstance() {
		return repo;
	}

	@Override
	public List<Board> selectAll() {
//		return list; // 리스트로 관리했으면 이렇게 
//		return (List<Board>) boards.values();
		List<Board> tmp = new ArrayList<>();
		for(String key:boards.keySet()) {
			tmp.add(boards.get(key));
		}
		return tmp;
	}

	@Override
	public Board selectOne(String videoId) {
		return boards.get(videoId);
	}

	
	@Override
	public void updateViewCnt(String videoId) {
		Board b = boards.get(videoId);
		b.setViewCnt(b.getViewCnt()+1);
	}
	
	@Override
	public void insertReview(Review review) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateReview(Review review) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void deleteReview(Review review) {
		// TODO Auto-generated method stub
		
	}


}
