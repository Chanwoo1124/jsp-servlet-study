package com.edu.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/queryTest")
public class QueryTestServlet extends HttpServlet {
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			resp.setContentType("text/html,charset=UTF-8");
			PrintWriter out = resp.getWriter();
			out.print("<htm>");
			out.print("<body>");
			out.print("get요청으로 왔습니");
			out.print("</body>");
			out.print("</html>");
			out.close();
		
		
	}
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html,charset=UTF-8");
		PrintWriter out = resp.getWriter();
		out.print("<htm>");
		out.print("<body>");
		out.print("post요청으로 왔습니다");
		out.print("</body>");
		out.print("</html>");
		out.close();
		
	}

}


