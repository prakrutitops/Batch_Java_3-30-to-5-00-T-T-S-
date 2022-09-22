import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SaveServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//super.doPost(req, resp);
	
		resp.setContentType("text/html");
		PrintWriter out =resp.getWriter();
		
		
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String pass = req.getParameter("pass");
		String repass = req.getParameter("re_pass");
		
		
		if(pass.equals(repass))
		{
			Model m =new Model();
			m.setName(name);
			m.setEmail(email);
			m.setPass(pass);
			
			int status = Dao.savedata(m);
	
			if(status>0)
			{
				resp.sendRedirect("ViewServlet");
			}
			else
			{
				out.print("fail");
			}
		}
		else
		{
			out.print("password and confirm password are not same");
		}
		
	}
}
