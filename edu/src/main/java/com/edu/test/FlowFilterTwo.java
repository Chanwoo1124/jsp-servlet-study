package com.edu.test;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FlowFilterTwo implements Filter {
	public void init(FilterConfig config) {
		System.out.println("init() 호출....two");
	}

	
	public void doFilter(ServletRequest req, ServletResponse res,FilterChain chain) throws java.io.IOException,ServletException{
		System.out.println("doFilter()호출전,,.two");
		chain.doFilter(req, res);
		System.out.println("doFilter()호출...two");
	}
	public void destroy() {
		System.out.println("destory()호출...two");
	}
}
