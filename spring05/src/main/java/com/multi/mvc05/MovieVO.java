package com.multi.mvc05;


public class MovieVO {
	private String sub;
	private String price;
	
	public String getSub() {
		return sub;
	}
	public void setSub(String sub) {
		this.sub = sub;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "MovieVO [sub=" + sub + ", price=" + price + "]";
	}
	
}
