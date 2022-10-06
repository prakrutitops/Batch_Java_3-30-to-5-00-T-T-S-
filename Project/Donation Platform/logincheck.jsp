<%@page import="com.dao.UserDao"%>
<%@page import="com.model.SignupModel"%>
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
	
		String email =request.getParameter("email");
		String password =request.getParameter("password");
		
		SignupModel m =new SignupModel();
		m.setEmail(email);
		m.setPassword(password);
		
		SignupModel m2 = UserDao.loginNow(m);
		
		if(m2!=null)
		{
			out.print("success");
		}
		else
		{
			out.print("fail");
		}
		
	%>


</body>
</html>