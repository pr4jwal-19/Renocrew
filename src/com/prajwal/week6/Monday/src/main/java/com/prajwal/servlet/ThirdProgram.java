package com.prajwal.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ThirdProgram extends HttpServlet{
	
	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
		System.out.println("doGet method called...");
	}
	protected void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
		System.out.println("doPost method called...");
	}
	
}
