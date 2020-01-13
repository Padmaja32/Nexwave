package com.del.course.dao;
import java.sql.*;

import com.del.course.entity.Courses;

public class CourseDAO {
	public boolean insertCourse(Courses c) {
		int count = 0;
		Connection con =  null;
		PreparedStatement pst = null;
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(url,"scott","tiger");
			pst = con.prepareStatement("insert into courses values(?,?,?,?)");
			pst.setInt(1, c.getCourse_id()); pst.setString(2, c.getCourse_name());
			pst.setInt(3, c.getCourse_duration()); pst.setDouble(4, c.getCourse_fee());
			count = pst.executeUpdate();
		}
		catch(Exception ex ) {
			ex.printStackTrace();
		}
		finally
		{
			try {
				if(pst != null) pst.close();
				if(con != null) con.close();
			}
			catch(Exception ex) {
				ex.printStackTrace();
			}
		}
		return count == 1;
		
	}
	
	public boolean modifyCourse(Courses c) {
		int count = 0;
		Connection con =  null;
		PreparedStatement pst = null;
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(url,"scott","tiger");
			pst = con.prepareStatement("update courses set course_name=?, course_duration=?, course_fee=? where course_id=?");
			pst.setString(1, c.getCourse_name()); pst.setInt(2, c.getCourse_duration()); 
			pst.setDouble(3, c.getCourse_fee()); pst.setInt(4, c.getCourse_id()); 
			count = pst.executeUpdate();
		}
		catch(Exception ex ) {
			ex.printStackTrace();
		}
		finally
		{
			try {
				if(pst != null) pst.close();
				if(con != null) con.close();
			}
			catch(Exception ex) {
				ex.printStackTrace();
			}
		}
		return count == 1;
		
	}
	
	public boolean removeCourse(int course_id) {
		int count = 0;
		Connection con =  null;
		PreparedStatement pst = null;
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(url,"scott","tiger");
			pst = con.prepareStatement("delete from courses where course_id=?");
			pst.setInt(1, course_id);
			count = pst.executeUpdate();
		}
		catch(Exception e ) {
			e.printStackTrace();
		}
		finally
		{
			try {
				if(pst != null) pst.close();
				if(con != null) con.close();
			}
			catch(Exception ex) {
				ex.printStackTrace();
			}
		}
		return count == 1;
		
	}
	
	public Courses getCourse(int course_id) {
		Courses c = null;
		Connection con =  null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con = DriverManager.getConnection(url,"scott","tiger");
			pst = con.prepareStatement("select * from courses where course_id= ?");
			pst.setInt(1, course_id);
			rs = pst.executeQuery();
			if(rs.next())
				c = new Courses(rs.getInt(1),rs.getString(2), rs.getInt(3),rs.getDouble(4));
		}
		catch(Exception e ) {
			e.printStackTrace();
		}
		finally
		{
			try {
				if(rs != null) rs.close();
				if(pst != null) pst.close();
				if(con != null) con.close();
			}
			catch(Exception ex) {
				ex.printStackTrace();
			}
		}
		return c;
	}
}
