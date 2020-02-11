package com.capgemini.librarymanagementsystem.dto;

public class StudentBean {

	private int Id;
	private int Book_id;
	private int student_id;
	private String Borrow_date;
	private String Return_date;
	public int getStudent_id() {
		return student_id;
	}
	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}



	
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public int getBook_id() {
		return Book_id;
	}
	public void setBook_id(int book_id) {
		Book_id = book_id;
	}
	
	public String getBorrow_date() {
		return Borrow_date;
	}
	public void setBorrow_date(String borrow_date) {
		Borrow_date = borrow_date;
	}
	public String getReturn_date() {
		return Return_date;
	}
	public void setReturn_date(String return_date) {
		Return_date = return_date;
	}
	public StudentBean(int id, int book_id, String borrow_date, String return_date) {
		super();
		Id = id;
		Book_id = book_id;
		
		Borrow_date = borrow_date;
		Return_date = return_date;
	}
	
	
	
	public StudentBean() {
		
	}
	
	
	
}
