package com.capgemini.librarymanagementsystem.dto;

public class BookInfoBean {

	
	private String bookId;
	private String bookname;
	private String authorName;
	private double price;
	private int quantity;
	
	public BookInfoBean() {
		
	}
	public BookInfoBean(String bookId, String bookname, String authorName, double price, int quantity) {
		super();
		this.bookId = bookId;
		this.bookname = bookname;
		this.authorName = authorName;
		this.price = price;
		this.quantity = quantity;
	}
	public String getBookId() {
		return bookId;
	}
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	

}
