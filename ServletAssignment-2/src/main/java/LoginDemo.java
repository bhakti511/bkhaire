import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginDemo extends HttpServlet
{
	String username = "abc";
	String password = "123";
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		String User = req.getParameter("Username");
		String Pass = req.getParameter("Password");
		
		PrintWriter out = res.getWriter();
		
		if((User.equals(username)) && (Pass.equals(password)))
		{
			out.println("Login Successful...");
		}
		else
		{
			out.println("Invalid credentials.");
		}
	}
}
