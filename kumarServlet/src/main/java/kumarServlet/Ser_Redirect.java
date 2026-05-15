package kumarServlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Ser_Redirect extends HttpServlet{
	public void service(HttpServletRequest req,HttpServletResponse res) 
	                   throws ServletException,IOException{
		int i=Integer.parseInt(req.getParameter("num1"));
		int j=Integer.parseInt(req.getParameter("num2"));
		
		int k=i+j;
		
		res.sendRedirect("redirect?k="+k);
		
		
	}
}
