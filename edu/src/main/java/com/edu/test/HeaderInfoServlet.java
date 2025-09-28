package com.edu.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/headerInfo")
public class HeaderInfoServlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException{
		res.setContentType("text/html;charset=EUC-KR");
		PrintWriter out = res.getWriter();
		out.print("<html");
		out.print("<body>");
		Enumeration<String> em = req.getHeaderNames();
		while (em.hasMoreElements()) {
			String s = em.nextElement();
			out.println(s+":"+req.getHeader(s)+"<br/>");
		}
		out.print("</body></html>");
	
	}

}
