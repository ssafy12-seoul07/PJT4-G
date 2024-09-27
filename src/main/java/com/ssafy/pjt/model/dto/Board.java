package com.ssafy.pjt.model.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Board implements Serializable{
	private static final long serialVersionUID = 1L;
	
	//여기로 저장하자
	private List<Review> reviewList = new ArrayList<>();
	
	private String videoId;
	private String title;
	private String part;
	private String channelName;
	private int viewCnt;
	private String regDate;

	public Board() {
	}

	public Board(String videoId, String title, String part, String channelName) {
		this.videoId = videoId;
		this.title = title;
		this.part = part;
		this.channelName = channelName;
		this.viewCnt = 0;
		this.regDate = new Date().toString();
	}

	
	public List<Review> getReviewList() {
//		return new ArrayList<>(reviewList.values());\
		return reviewList;
	}

	public void setReviewList(List<Review> reviewList) {
		this.reviewList = reviewList;
	}

	public String getVideoId() {
		return videoId;
	}

	public void setVideoId(String videoId) {
		this.videoId = videoId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPart() {
		return part;
	}

	public void setPart(String part) {
		this.part = part;
	}

	public String getChannelName() {
		return channelName;
	}

	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}

	public int getViewCnt() {
		return viewCnt;
	}

	public void setViewCnt(int viewCnt) {
		this.viewCnt = viewCnt;
	}

	public String getRegDate() {
		return regDate;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}


	@Override
	public String toString() {
		return "Board [videoId=" + videoId + ", title=" + title + ", part=" + part + ", channelName=" + channelName + ", regDate="
				+ regDate + ", viewCnt=" + viewCnt + "]";
	}



}
