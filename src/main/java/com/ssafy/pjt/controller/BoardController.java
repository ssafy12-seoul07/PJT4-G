package com.ssafy.pjt.controller;

import java.io.IOException;

import com.ssafy.pjt.model.service.BoardService;
import com.ssafy.pjt.model.service.BoardServiceImpl;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/")
public class BoardController extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	private BoardService service = BoardServiceImpl.getInstance();

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		
		switch (action) {}
		
	}

	
}
