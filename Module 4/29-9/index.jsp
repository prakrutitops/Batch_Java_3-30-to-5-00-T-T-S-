<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

		<%
			
			String name = request.getParameter("Name");
			String pass = request.getParameter("Pass");
			
			if(pass.equals("1234"))
			{
				out.print("Welcome "+name);
			}
			else
			{
				out.print("Sorry Your Details are Wrong");
			}
		
		%>
		
		<br>
		<br>
		
		<%= Calendar.getInstance().getTime() %>
		
		
		<br>
		<br>
		
		<%!
			int cube(int n)
			{
				return n*n*n;
			}
		%>
		
		<br>
		<br>
		<%= cube(3) %>
		

</body>
</html>