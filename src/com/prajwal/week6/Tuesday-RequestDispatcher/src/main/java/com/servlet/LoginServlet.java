package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String fetchEmail = req.getParameter("email"); 
		String fetchPass = req.getParameter("password");
		
		RequestDispatcher rd;
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		if(fetchEmail.equals("test_123@gmail.com") && fetchPass.equals("test123")) {
			/* // home page redirect 
			 * 	  rd = req.getRequestDispatcher("/home");
			 *    rd.forward(req,resp);
			 */
			// will always call doGet() and not doPost()
			resp.sendRedirect("home");
		} else {
			// redirect back to login
			rd = req.getRequestDispatcher("/index.html");
			rd.include(req, resp);
			out.println("<h2>Invalid email or password</h2>");
		}
	}
	
}
