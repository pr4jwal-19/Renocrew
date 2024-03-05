package com.prajwal.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class SecondProgram extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Service method of Generic Servlet called....");
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.println("Welcome to Servlet - from service method() ");
		out.println("Today "+new Date().toString());
	}
	
}
