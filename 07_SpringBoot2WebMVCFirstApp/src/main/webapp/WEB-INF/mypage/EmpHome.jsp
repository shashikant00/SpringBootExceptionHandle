<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<body>
	<h1>
		Welcome to SpringBoot MVC!!!!
		<%=new java.util.Date()%>
		<%
		response.addHeader("Refresh", "5;https://www.google.com");
		%>
		please wait 5 Second ,do not press back button or refresh
	</h1>
</body>
</html>