package kumarServlet;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletCalling extends HttpServlet{
	public void service(HttpServletRequest req,HttpServletResponse res)
			throws ServletException,IOException {
		int k=(int)req.getAttribute("k");
		k=k*k;
		PrintWriter out=res.getWriter();
		out.println("Result is "+k);
	}

}
