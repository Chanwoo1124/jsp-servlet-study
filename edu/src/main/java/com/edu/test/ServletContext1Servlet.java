package com.edu.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/context1")
public class ServletContext1Servlet extends HttpServlet {
	
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException , IOException{
		resp.setContentType("text/html;charset=UTF-8");
		ServletContext sc = this.getServletContext();
		PrintWriter out = resp.getWriter();
		out.print(sc);
		out.close();
		
	}

}
