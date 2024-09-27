package com.ssafy.pjt.model.dto;

import java.io.Serializable;
import java.util.Date;

public class Review implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private static int no = 1;
	private int id;
	private String videoId;
	private String content;
	private String writer;
	private String regDate;

	public Review() {
	}

	public Review(String videoId, String writer, String content) {
		this.id = no++;
		this.videoId = videoId;
		this.writer = writer;
		this.content = content;
//		this.viewCnt = 0;
		this.regDate = new Date().toString();
	}

	public static int getNo() {
		return no;
	}

	public static void setNo(int no) {
		Review.no = no;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getVideoId() {
		return videoId;
	}

	public void setVideoId(String videoId) {
		this.videoId = videoId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getRegDate() {
		return regDate;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Board [id=" + id + ", videoId=" + videoId + ", writer=" + writer + ", content=" + content + ", regDate="
				+ regDate + "]";
	}

}
