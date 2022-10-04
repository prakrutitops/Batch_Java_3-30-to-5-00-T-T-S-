<%@page import="com.model.Model"%>
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

<%
	
		String id=request.getParameter("id");
		int id2=Integer.parseInt(id);
		Model m = UserDao.getemployeebyid(id2);

%>

	<form action="edituser2.jsp" method ="post" >

		<table align="center" width="100%">
		<tr>
			<input type="hidden" name="id" value="<%=m.getId()%>">  
		</tr>
		
		<tr>
			<input type="text" name="fname" value="<%=m.getFname()%>">  
		</tr>
		
		<tr>
			<input type="text"  name="lname" value="<%=m.getLname()%>">  
		</tr>
		
		<tr>
			<input type="text" name="email" value="<%=m.getEmail()%>">  
		</tr>
		
		<input type="submit" value="Go">

	</table>
	</form>

</body>
</html>