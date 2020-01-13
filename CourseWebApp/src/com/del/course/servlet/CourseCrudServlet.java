package com.del.course.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;

import com.del.course.dao.CourseDAO;
import com.del.course.entity.Courses;
@WebServlet("/CourseCrudServlet")
public class CourseCrudServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String submit = request.getParameter("sub");
		String message = "";
		Courses c = new Courses();
		CourseDAO edao = new CourseDAO();
		c.setCourse_id(Integer.parseInt(request.getParameter("course_id")));
		RequestDispatcher rd = request.getRequestDispatcher("CourseCrud.jsp");
		if (submit.equals("Add") || submit.equals("Modify")) {
			c.setCourse_name(request.getParameter("course_name"));
			c.setCourse_fee(Double.parseDouble(request.getParameter("course_fee")));
			c.setCourse_duration(Integer.parseInt(request.getParameter("course_duration")));
			if (submit.equals("Add")) {
				if(edao.insertCourse(c))
					message = message + "Inserted Record";
				else
					message = message + "Insertion Failed";
			} else {
				if(edao.modifyCourse(c))
					message = message + " Modified Record";
				else
					message = message + " Modification Failed";
					
			}

		} else if (submit.equals("Remove")) {
			if (edao.removeCourse(c.getCourse_id()))
				message = message + " Record Deleted";
			else
				message = " Deletion Failed";

		} else if (submit.equals("Show")) {
			c = edao.getCourse(c.getCourse_id());
			request.setAttribute("cor", c);
		}
		out.println("<h1 style='color:red'><center>" + message + "</center></h1>");
		rd.include(request, response);
	}

}
