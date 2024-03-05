package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/home")
public class HomeServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// this will be null when sendRedirect() is used
		// because the object is destroyed when passing the resource
		// new object is created -> req object is not the same
		// sendRedirect() is used at client side
		String mail = req.getParameter("email");
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		out.println("<h2> Welcome to Home Page,  </h2>"+mail);
	}
	
	
}
