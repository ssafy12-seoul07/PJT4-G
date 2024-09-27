package com.ssafy.pjt.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import com.ssafy.pjt.model.dto.Board;
import com.ssafy.pjt.model.dto.Review;
import com.ssafy.pjt.model.service.BoardService;
import com.ssafy.pjt.model.service.BoardServiceImpl;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/main")
public class BoardController extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	private BoardService service = BoardServiceImpl.getInstance();

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String action = req.getParameter("action");
		
		switch (action) {
		case "write":
			doReviewWrite(req, res);
			break;
		case "댓글수정폼":
			doReviewModifyform(req, res);
			break;
		case "댓글수정":
			doReviewModify(req, res);
			break;
		case "댓글삭제":
			doReviewRemove(req, res);
			break;
		case "detail":
			doDetail(req, res);
			break;
		case "list":
			doList(req, res);
			break;
		}
		
	}

	private void doList(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		req.setAttribute("list", service.getList());
		req.getRequestDispatcher("/WEB-INF/board/list.jsp").forward(req, res);
		
	}

	private void doDetail(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String id = req.getParameter("id");
		
		req.setAttribute("board", service.getBoard(id));
		req.getRequestDispatcher("/WEB-INF/board/detail.jsp").forward(req, res);
		
	}
	
	private void doReviewModifyform(HttpServletRequest req, HttpServletResponse res) {
		int id = Integer.parseInt(req.getParameter("id"));
		String videoId = req.getParameter("videoId");
		
		
		Review review = new Review();
		review.setId(id);
		review.setVideoId(videoId);
		
		Review getreview = service.getReview(review);
		req.setAttribute("review", getreview);
		
	}

	private void doReviewModify(HttpServletRequest req, HttpServletResponse res) throws IOException {
		Board board = service.getBoard(req.getParameter("videoId"));
		Review review = service.getReview(board.getReviewList().get(Integer.parseInt(req.getParameter("id"))));
		
		review.setContent(req.getParameter("content"));
		
		service.modifyReview(review);
		
		res.sendRedirect("main?action=list");
	}

	
	private void doReviewRemove(HttpServletRequest req, HttpServletResponse res) throws IOException {
		Board board = service.getBoard(req.getParameter("videoId"));
		Review review = service.getReview(board.getReviewList().get(Integer.parseInt(req.getParameter("id"))));
		
		
		service.deleteReview(review);
		
		res.sendRedirect("main?action=list");
		
	}

	private void doReviewWrite(HttpServletRequest req, HttpServletResponse res) throws IOException {
		String videoId = req.getParameter("videoId");
		String writer = req.getParameter("writer");
		String content = req.getParameter("content");
		
		//객체를 만들겠다
		Review review = new Review(videoId, writer, content);
		
		service.writeReview(review);
		
		res.sendRedirect("main?action=list");
		
	}

	
}
