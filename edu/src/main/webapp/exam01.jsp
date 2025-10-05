<%@ page import="com.edu.beans.BookBean" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix ="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:set var = "name" value="Amy" />
<c:out value ="${name}" /><br>

<c:remove var="name"/>
<c:out value="${name}" /><br>

<%
	BookBean book = new BookBean("The Secret", "Byrne, Rhonda", "atria Books");
	request.setAttribute("bookone", book);

%>

<c:set var = "title" value="${bookOne.title}" />