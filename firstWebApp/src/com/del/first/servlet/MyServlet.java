package com.del.first.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/ms")
public class MyServlet extends javax.servlet.GenericServlet {

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text.html");
		PrintWriter out = response.getWriter();
		out.print("<html><body><center>");
		out.print("<h1 style='color:black'>Time is</h1>");
		out.println("<h1 style='color:red' id='clock'>");
		out.println("</h1></center>");
		out.println("<script>document.getElementById('clock').innerHTML='hi';var date; setInterval(function(){ date = new Date(); document.getElementById('clock').innerHTML=date.getHours()+':'+date.getMinutes()+':'+date.getSeconds();}); </script></body></html>");
	}
	

}
