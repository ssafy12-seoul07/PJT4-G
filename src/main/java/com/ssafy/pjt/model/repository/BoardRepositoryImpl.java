package com.ssafy.pjt.model.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ssafy.pjt.model.dto.Board;
import com.ssafy.pjt.model.dto.Review;

public class BoardRepositoryImpl implements BoardRepository {

	private static BoardRepository repo = new BoardRepositoryImpl();

	// 게시글 관리 하겠다
	// 메모리를 DB라고 생각
	private Map<String, Board> boards = new HashMap<>(); // 맵으로 관리

	private BoardRepositoryImpl() {
//		boards.put("id", new Board("id", "title", "part", "channelName"));
		boards.put("50WCSpZtdmA",
				new Board("50WCSpZtdmA", "Shim EuDdeum 10 Minute Morning Stretch Everydayㅣ2023 Renewal", "전신", "힘으뜸"));
		boards.put("Kk7TQGqQ3nA", new Board("Kk7TQGqQ3nA",
				"하루 두 번🧘🏻‍♀️반드시 해야하는 20분 전신순환 스트레칭 Ep.08 - 피로회복, 디톡스, 심신안정, 혈액순환, 라인정리 효과 (Whole body stretch)", "전신",
				"빵느"));
		boards.put("MTU4iCDntjs",
				new Board("MTU4iCDntjs", "4 Minute OFFICE STRETCHING(full body)", "전신", "Allblanc TV"));
		boards.put("D3yExRi7EME&t=791s", new Board("D3yExRi7EME&t=791s",
				"뭉친 어깨, 뻣뻣한 골반 풀어주는 요가 | 앉아서 하는 요가 스트레칭 | 어깨 근육 풀기, 골반풀기", "상체", "Mindful Yoga with Eileen"));
		boards.put("02K-k6daPb4",
				new Board("02K-k6daPb4", "15 MIN Fat Burning Cardio - 서서하는 유산소 - 다이어트 운동", "전신", "빅씨스 Bigsis"));
		boards.put("gMaB-fG4u4g", new Board("gMaB-fG4u4g", "전신 다이어트 최고의 운동 [칼소폭 찐 핵핵매운맛]", "전신", "ThankyouBUBU"));
		boards.put("swRNeYw1JkY", new Board("swRNeYw1JkY", "하루 15분! 전신 칼로리 불태우는 다이어트 운동", "전신", "ThankyouBUBU"));
		boards.put("54tTYO-vU2E",
				new Board("54tTYO-vU2E", "상체 다이어트 최고의 운동 BEST [팔뚝살/겨드랑이살/등살/가슴어깨라인]", "상체", "ThankyouBUBU"));
		boards.put("QqqZH3j_vH0", new Board("QqqZH3j_vH0", "상체비만 다이어트 최고의 운동 [상체 핵매운맛]", "상체", "ThankyouBUBU"));
		boards.put("tzN6ypk6Sps", new Board("tzN6ypk6Sps", "하체운동이 중요한 이유? 이것만 보고 따라하자 ! [하체운동 교과서]", "하체", "김강민"));
		boards.put("u5OgcZdNbMo", new Board("u5OgcZdNbMo", "저는 하체 식주의자 입니다", "하체", "GYM종국"));
		boards.put("PjGcOP-TQPE", new Board("PjGcOP-TQPE", "11자복근 복부 최고의 운동 [복근 핵매운맛]", "복부", "ThankyouBUBU"));
		boards.put("7TLk7pscICk",
				new Board("7TLk7pscICk", "(Sub)누워서하는 5분 복부운동!! 효과보장! (매일 2주만 해보세요!)", "복부", "SomiFit"));
	}

	public static BoardRepository getInstance() {
		return repo;
	}

	@Override
	public List<Board> selectAll() {
//		return list; // 리스트로 관리했으면 이렇게 
//		return (List<Board>) boards.values();
		List<Board> tmp = new ArrayList<>();
		for (String key : boards.keySet()) {
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
		b.setViewCnt(b.getViewCnt() + 1);
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
