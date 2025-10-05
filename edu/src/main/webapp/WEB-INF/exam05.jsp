<%@ page import="com.edu.beans.BookBean" %>
<%@ page import="java.util.ArrayList" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix ="c" uri="http://java.sun.com/jsp/jstl/core" %>

<% 
	ArrayList<BookBean> booklist = new ArrayList<BookBean>();
	booklist.add(new BookBean("The secret", "Byrne,Rhonda", "Atria Books"));
	booklist.add(new BookBean("The lecture", "randy pausch", "jdfae"));
	
	String[] bookCode = {"소설","역사","인문","정치","미술","종교","여행"};

%>


