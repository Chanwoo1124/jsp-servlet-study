package com.edu.test;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FlowFilterOne implements Filter {
	public void init(FilterConfig config) {
		System.out.println("init() 호출....one");
		config.
	}

	
	public void doFilter(ServletRequest req, ServletResponse res,FilterChain chain) throws java.io.IOException,ServletException{
		System.out.println("doFilter()호출전,,.one");
		chain.doFilter(req, res);
		System.out.println("doFilter()호출...one");
	}
	public void destroy() {
		System.out.println("destory()호출...one");
	}
}
