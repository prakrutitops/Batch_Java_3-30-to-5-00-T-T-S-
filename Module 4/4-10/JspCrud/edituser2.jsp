<%@page import="com.dao.UserDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    
    <jsp:useBean id="m" class="com.model.Model"></jsp:useBean>
    
    <jsp:setProperty property="*" name="m"/>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
		
		int status =UserDao.updatedata(m);
	
		if(status>0)
		{
			response.sendRedirect("view.jsp");
		}
		else
		{
			out.print("Error");	
		}
	
	%>

</body>
</html>