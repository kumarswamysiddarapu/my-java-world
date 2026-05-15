package kumarServlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
//import javax.servlet.*;
//import javax.servlet.http.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class AddServlet extends HttpServlet {


	@Override
    public void service(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

//        String n1 = req.getParameter("num1");
//        String n2 = req.getParameter("num2");

        int i = Integer.parseInt( req.getParameter("num1"));
        int j = Integer.parseInt(req.getParameter("num2"));

        int k = i + j;
        
        req.setAttribute("k",k);
        
        RequestDispatcher rd=req.getRequestDispatcher("sq");
        rd.forward(req,res);
//        PrintWriter out=res.getWriter();
//        out.println("After Addition the result  "+k);
       // res.getWriter().println("Addition Result is: " + k);
    }
        
        
//        
//        public void doGet(HttpServletRequest req, HttpServletResponse res)
//                throws ServletException, IOException {
//
////            String n1 = req.getParameter("num1");
////            String n2 = req.getParameter("num2");
//
//            int i = Integer.parseInt( req.getParameter("num1"));
//            int j = Integer.parseInt(req.getParameter("num2"));
//
//            int k = i + j;
//            PrintWriter out=res.getWriter();
//            out.println("After Addition the result  "+k);
//           // res.getWriter().println("Addition Result is: " + k);
//            
//    }
//        public void doPost(HttpServletRequest req, HttpServletResponse res)
//                throws ServletException, IOException {
//
////            String n1 = req.getParameter("num1");
////            String n2 = req.getParameter("num2");
//
//            int i = Integer.parseInt( req.getParameter("num1"));
//            int j = Integer.parseInt(req.getParameter("num2"));
//
//            int k = i + j;
//            PrintWriter out=res.getWriter();
//            out.println("After Addition the result  "+k);
//           // res.getWriter().println("Addition Result is: " + k);
//            
//}
}





