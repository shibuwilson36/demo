package com.capgemini.librarymanagementsystem.exceptions;

public class StudentException extends RuntimeException {
	
	String msg;
	
	public StudentException(String msg) {
		this.msg = msg;
	}

	@Override
	public String getMessage() {
		
		return msg;
	}
   
}
