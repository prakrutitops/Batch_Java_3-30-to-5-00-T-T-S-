import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet2 extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doPost(req, resp);
		
		
		resp.setContentType("text/html");
		PrintWriter out =resp.getWriter();
		
		String uname=req.getParameter("username");
		String pass=req.getParameter("pass");
		
		if(pass.equals("1234"))
		{
				out.print("<b> Welcome </b>"+uname);
		}
		else
		{
			out.print("Your Credentials are wrong");
		}
	}
}
