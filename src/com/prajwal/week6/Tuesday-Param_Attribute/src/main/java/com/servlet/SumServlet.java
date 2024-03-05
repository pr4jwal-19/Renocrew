package com.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/sum")
public class SumServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int fNum = Integer.parseInt(req.getParameter("num1"));
		int sNum = Integer.parseInt(req.getParameter("num2"));
		
		int sum = fNum+sNum;
		
		req.setAttribute("addition", sum);
		
		RequestDispatcher rd = req.getRequestDispatcher("/display");
		rd.forward(req, resp);
	}
	
}
