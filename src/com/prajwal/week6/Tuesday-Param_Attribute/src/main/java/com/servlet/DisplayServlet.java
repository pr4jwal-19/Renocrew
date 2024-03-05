package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/display")
public class DisplayServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int fNum = Integer.parseInt(req.getParameter("num1"));
		int sNum = Integer.parseInt(req.getParameter("num2"));
		
		int summation = (int)req.getAttribute("addition");
		
		int product = fNum*sNum;
		
		resp.setContentType("text/html");
		
		PrintWriter out = resp.getWriter();
		out.println("<h2>Sum = "+summation+" <br>"); 
		out.println("<h2>Product = "+product+" <br>"); 
	}
	
	
}
