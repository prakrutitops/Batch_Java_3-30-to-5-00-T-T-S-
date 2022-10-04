<%@page import="com.model.Model"%>
<%@page import="java.util.List"%>
<%@page import="com.dao.UserDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<table border="1" width="50%">
	<tr><th>Id</th><th>Fname</th><th>Lname</th><th>Email</th><th>Edit</th><th>Delete</th></tr>
	<%
		
		List<Model>list =UserDao.viewdata();
		for(Model m :list)
		{
			
		
		
	%>
	
		<tr><td><%= m.getId() %></td><td><%= m.getFname() %></td><td><%= m.getLname() %></td><td><%= m.getEmail() %></td><td><a href="edituser.jsp?id=<%=m.getId()%>">Edit</a></td><td><a href="deleteuser.jsp?id=<%=m.getId()%>">Delete</a></td></tr>

	
	<%
		}
	%>
</table>
	
</body>
</html>