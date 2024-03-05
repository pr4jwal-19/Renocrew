package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username = req.getParameter("uName");
		String email = req.getParameter("uMail");
		String password = req.getParameter("uPass");
		String course = req.getParameter("course");
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<h1>Username: "+username+"</h1>");
		out.println("<h1>Email: "+email+"</h1>");
		out.println("<h1>Password: "+password+"</h1>");
		out.println("<h1>Course: "+course+"</h1>");
	}
	
	

}
