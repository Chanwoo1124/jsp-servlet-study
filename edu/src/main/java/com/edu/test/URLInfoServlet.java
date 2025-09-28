package com.edu.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/urlInfo")
public class URLInfoServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException{
		res.setContentType("text/html;charset=UTF-8");
		PrintWriter out = res.getWriter();
		out.print("<html>");
		out.print("<body>");
		out.print(req.getRequestURI()+"<br/>");
		out.print(req.getRequestURL()+"<br/>");
		out.print(req.getContextPath()+"<br/>");
		out.print(req.getProtocol()+"<br/>");
		out.print(req.getServletPath()+"<br/>");
		out.print("</body></html>");
		out.close();
	}

}
