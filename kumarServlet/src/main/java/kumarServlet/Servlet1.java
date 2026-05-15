package kumarServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet1 extends HttpServlet {
	public void service(HttpServletRequest req,HttpServletResponse res)
			throws IOException,ServletException{
		int a=Integer.parseInt(req.getParameter("num1"));
		int b=Integer.parseInt(req.getParameter("num2"));
		int k=a-b;
		PrintWriter out=res.getWriter();
		out.println(" Result subtraction after "+k);
	}
}
