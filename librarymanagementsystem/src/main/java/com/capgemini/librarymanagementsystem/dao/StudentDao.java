package com.capgemini.librarymanagementsystem.dao;

import java.util.List;

import com.capgemini.librarymanagementsystem.dto.BookInfoBean;
import com.capgemini.librarymanagementsystem.dto.StudentBean;

public interface StudentDao {

	
	public StudentBean loginStudent(int id, String password);
	public List<BookInfoBean> searchBook(String bookName);
	public List<BookInfoBean> allBooks();
	public boolean borrowBook(StudentBean bean);
//	public boolean returnBook(String bookname);
	
	
}
