package kumarServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginPage extends HttpServlet {
	
	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException {
    	String str=req.getParameter("user");
    	String str1=req.getParameter("password");
    	
    	res.setContentType("text/html");
    	PrintWriter out=res.getWriter();
    	
    	if(str.equals("kumar")&& str1.equals("123")) {
    		out.println("user validation done successfully\n");
    		out.println("valid user name and passwoerd ");
    		
    	}
    	else {
    		out.println("in valid user name and password \n");
    		out.println("Enter valid user name password to login");
    		
    	}
    }
}
