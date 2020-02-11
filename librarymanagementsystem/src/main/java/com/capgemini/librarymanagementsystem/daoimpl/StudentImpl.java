package com.capgemini.librarymanagementsystem.daoimpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.capgemini.librarymanagementsystem.dao.StudentDao;
import com.capgemini.librarymanagementsystem.dto.BookInfoBean;
import com.capgemini.librarymanagementsystem.dto.StudentBean;
import com.capgemini.librarymanagementsystem.dto.User;

public class StudentImpl implements StudentDao {

	public StudentBean loginStudent(int id, String password) {
		StudentBean student=null;
		Connection conn =null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {

			Class.forName("com.mysql.jdbc.Driver").newInstance(); // more beneficial

			String dburl = "jdbc:mysql://localhost:3306/librarymanagementsystem_db";

			conn = DriverManager.getConnection(dburl, "root", "root");

			String query = "select * from user where Id='" + id + "'and Password='" + password;
			pstmt = conn.prepareStatement(query);
			pstmt.setInt(1, student.getId());

		} catch(Exception e){
			e.printStackTrace();
		} finally {
			try {
				if(conn!= null) {
					conn.close();
				}
				if(pstmt!= null) {
					pstmt.close();

				} if(rs!=null) {
					rs.close();
				}

			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
		return student;

	}

	public List<BookInfoBean> searchBook(String bookName) {

		StudentBean student=null;
		Connection conn =null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List<BookInfoBean> info=new ArrayList<BookInfoBean>();;
		try {

			Class.forName("com.mysql.jdbc.Driver").newInstance(); // more beneficial

			String dburl = "jdbc:mysql://localhost:3306/librarymanagementsystem_db";

			conn = DriverManager.getConnection(dburl, "root", "root");

			String query = "select * from book_info where Bookname = ?" ;
			pstmt = (PreparedStatement) conn.prepareStatement(query);
			pstmt.setString(1,bookName );
			rs = pstmt.executeQuery();
			while(rs.next()) {

				BookInfoBean bean=new BookInfoBean();
				bean.setBookname(rs.getString("Bookname"));
				bean.setAuthorName(rs.getString("Authorname"));
				bean.setPrice(rs.getDouble("Price"));
				bean.setQuantity(rs.getInt("Quantity"));
				info.add(bean);

			}

		} catch(Exception e){
			e.printStackTrace();
		} finally {
			try {
				if(conn!= null) {
					conn.close();
				}
				if(pstmt!= null) {
					pstmt.close();

				} if(rs!=null) {
					rs.close();
				}

			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
		return info;

	}

	public List<BookInfoBean> allBooks() {
		
		Connection conn =null;
		Statement pstmt = null;
		ResultSet rs = null;
		List<BookInfoBean> info=new ArrayList<BookInfoBean>();;
		try {

			Class.forName("com.mysql.jdbc.Driver").newInstance(); // more beneficial

			String dburl = "jdbc:mysql://localhost:3306/librarymanagementsystem_db";

			conn = DriverManager.getConnection(dburl, "root", "root");

			String query = "select * from book_info " ;
			pstmt = conn.createStatement();
			rs = pstmt.executeQuery(query);
			while(rs.next()) {

				BookInfoBean bean=new BookInfoBean();
				bean.setBookname(rs.getString("Bookname"));
				bean.setAuthorName(rs.getString("Authorname"));
				bean.setPrice(rs.getDouble("Price"));
				bean.setQuantity(rs.getInt("Quantity"));
				info.add(bean);

			}

		} catch(Exception e){
			e.printStackTrace();
		} finally {
			try {
				if(conn!= null) {
					conn.close();
				}
				if(pstmt!= null) {
					pstmt.close();

				} if(rs!=null) {
					rs.close();
				}

			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
		return info;
	}

	public boolean borrowBook(StudentBean bean) {
		
		Connection conn =null;
		PreparedStatement pstmt = null;
		
		List<BookInfoBean> info=new ArrayList<BookInfoBean>();;
		try {

			Class.forName("com.mysql.jdbc.Driver").newInstance(); // more beneficial

			String dburl = "jdbc:mysql://localhost:3306/librarymanagementsystem_db";

			conn = DriverManager.getConnection(dburl, "root", "root");

			String query = "insert int values(?,?,?)" ;
			pstmt = (PreparedStatement) conn.prepareStatement(query);
			pstmt.setInt(1,bean.getBook_id() );
			int rs = pstmt.executeUpdate();
			if(rs>0) {
				return true;
			}

		} catch(Exception e){
			e.printStackTrace();
		} finally {
			try {
				if(conn!= null) {
					conn.close();
				}
				if(pstmt!= null) {
					pstmt.close();

				} 

			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
	

		return false;
	}

}	











