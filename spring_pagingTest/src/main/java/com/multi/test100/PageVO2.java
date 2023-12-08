package com.multi.test100;

public class PageVO2 {
	private int start;
	private int end;
	private int page;
	
	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public int getEnd() {
		return end;
	}
	public void setEnd(int end) {
		this.end = end;
	}
	
	public int getPage() {
		return page;
	}
	
	public void setPage(int page) {
		this.page = page;
	}
	
	public void setStartEnd() { //page별 시작 끝목록 계산하는 함수
		end = page * 5; 
		start = 1 + (page - 1) * 5;
	}
	
	@Override
	public String toString() {
		return "PageVO [start=" + start + ", end=" + end + "]";
	}
	
	
	
}
