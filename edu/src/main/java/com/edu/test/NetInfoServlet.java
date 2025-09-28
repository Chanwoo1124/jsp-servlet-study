package com.edu.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/netInfo")
public class NetInfoServlet extends HttpServlet{
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException,IOException{
		res.setContentType("text/html;charset=UTF-8");
		PrintWriter out = res.getWriter();
		out.print("<html>");
		out.print("<body>");
		out.print(req.getScheme()+"<br/>");
		out.print(req.getServerName()+"<br/>");
		out.print(req.getLocalAddr()+"<br/>");
		out.print(req.getServerPort()+"<br/>");
		out.print(req.getRemoteAddr()+"<br/>");
		out.print(req.getRemoteHost()+"<br/>");
		out.print(req.getRemotePort()+"<br/>");
		out.print("</body></hmtl>");
		out.close();
		
	}

}
