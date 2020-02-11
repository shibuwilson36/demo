package com.capgemini.librarymanagementsystem.service;

import java.util.Date;
import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import com.capgemini.librarymanagementsystem.daoimpl.StudentImpl;
import com.capgemini.librarymanagementsystem.dto.BookInfoBean;
import com.capgemini.librarymanagementsystem.dto.StudentBean;


public class StudentServiceImpl implements StudentService{
	
	static Logger log = LogManager.getLogger("student");
	private StudentImpl impl = new StudentImpl();
    StudentBean u=new StudentBean();
    BookInfoBean b=new BookInfoBean();

	public StudentServiceImpl() {
		super();
	}

	
	public StudentServiceImpl(BookInfoBean b) {
		super();
		this.b = b;
	}


	public StudentServiceImpl(StudentBean u) {
		super();
		this.u = u;
	}


	public StudentBean loginStudent(int id, String password) {
		
		return  impl.loginStudent( id,  password);
	} 
	
	
	public BookInfoBean searchAllBook(int bookname) {

		
		
		return null;
	}


	public List<BookInfoBean> searchBook(String bookName) {
		List<BookInfoBean> res1=impl.searchBook(bookName);
		return res1;
	}


	public void borrowBook(int studentId) {
		log.info("------All Books---------");
		List<BookInfoBean> beans=impl.allBooks();
		if(!beans.isEmpty()) {
			log.info("------Select Book---------");
			
			for (BookInfoBean bookInfoBean : beans) {
				
				log.info(bookInfoBean.getBookId()+")"+bookInfoBean.getBookname());
				
			}
			StudentBean bean=new StudentBean();
			int bookId=1;
			bean.setBook_id(bookId);
			bean.setStudent_id(studentId);
			Date date=new Date();
			int month=date.getMonth()+1;
			int reData=month+1;
			bean.setBorrow_date(Integer.toString(date.getDate()+month+2020));
			bean.setReturn_date(Integer.toString(date.getDate()+reData+2020));
			log.info(Integer.toString(date.getDate())+"/"+month+"/"+date.getYear());
		}else {
			log.info("------No book found---------");
		}
		
	}


	public void returnBook() {
		// TODO Auto-generated method stub
		
	}


	public BookInfoBean searchBook(int bookid) {
		// TODO Auto-generated method stub
		return null;
	}
		
		
	



}
