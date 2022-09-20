import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet
{
	
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
		{
			// TODO Auto-generated method stub
			//super.doPost(req, resp);
			
			//System.out.println("success");
			
			
			resp.setContentType("text/html");
			PrintWriter out =resp.getWriter();
			
			
			String name=req.getParameter("Name");
			String pass=req.getParameter("Password");
			
			if(pass.equals("1234"))
			{
				out.print("Welcome "+name);
			}
			else
			{
				out.print("Your Credentials are wrong");
			}
		}
		
}
