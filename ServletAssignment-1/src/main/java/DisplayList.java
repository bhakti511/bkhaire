import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class DisplayList extends HttpServlet
{
	
	
	
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		ArrayList<String> list1 = new ArrayList<String>();
		
		list1.add("LG");
		list1.add("Sony");
		list1.add("One Plus");
		list1.add("Samsung");
		list1.add("Xiaomi");
		
		
		PrintWriter out = res.getWriter();
		
		Iterator<String> it = list1.iterator();
		
		while(it.hasNext())
			out.println(it.next());
	}
	
	
}
