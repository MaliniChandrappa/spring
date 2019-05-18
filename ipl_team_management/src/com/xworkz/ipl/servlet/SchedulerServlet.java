package com.xworkz.ipl.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SchedulerServlet extends HttpServlet {
	
	public SchedulerServlet() {

	System.out.println("created:\t"+this.getClass().getSimpleName());
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		System.out.println("invoked dopost servlet");
		String teamName=req.getParameter("teamName");
		String owner=req.getParameter("owner");
		String captain=req.getParameter("captain");
		String date=req.getParameter("date");
		String location=req.getParameter("location");
		
		System.out.println("teamName:"+teamName);
		System.out.println("owner:"+owner);
		System.out.println("captain:"+captain);
		System.out.println("date:"+date);
		System.out.println("location:"+location);
	
		resp.setContentType("text/html");
		PrintWriter out=resp.getWriter();
		
		out.println("<html><h1> Response page </h1></html>");
		
		
		
		
		

		
		
	}

}
