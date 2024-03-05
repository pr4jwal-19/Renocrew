package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/display1")
public class Display1Servlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String fName = req.getParameter("name");
		resp.setContentType("text/html");
		
		Cookie c = new Cookie("cName",fName);
		resp.addCookie(c);
		
		
		PrintWriter out = resp.getWriter();
		out.println("Your Name -> "+fName+" launched into space in Servlet 1 <br>");
		out.println("<a href='display2'>Display2</a>");
	}
	
	
}
