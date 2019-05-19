package com.xworkz.ipl.servlet;

import java.io.IOException;
//hi
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ResponseServlet extends HttpServlet{
	public ResponseServlet() {
		System.out.println("created ResponseServlet\t "+this.getClass().getSimpleName());
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
      System.out.println("Invoked doPost mmethod");
		
	}

}
