package schoolinfo;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/register")
public class Register extends HttpServlet {

    private static final long serialVersionUID = 1L;

    private static final String URL = "jdbc:postgresql://localhost:5432/postgres";
    private static final String USER = "postgres";
    private static final String PASSWORD = "123";

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String firstName = request.getParameter("firstName");
        String middleName = request.getParameter("middleName");
        String lastName = request.getParameter("lastName");
        String dob = request.getParameter("dob");
        String nationality = request.getParameter("nationality");
        String fatherName = request.getParameter("fatherName");
        String motherName = request.getParameter("motherName");
        String gender = request.getParameter("gender");
        String phone = request.getParameter("phone");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        String course = request.getParameter("course");

        try {
            Class.forName("org.postgresql.Driver");

            Connection con = DriverManager.getConnection(URL, USER, PASSWORD);

            String sql = "INSERT INTO student(first_name, middle_name, last_name, dob, nationality, father_name, mother_name, gender, phone, email, address, course) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, firstName);
            ps.setString(2, middleName);
            ps.setString(3, lastName);
            ps.setDate(4, java.sql.Date.valueOf(dob));
            ps.setString(5, nationality);
            ps.setString(6, fatherName);
            ps.setString(7, motherName);
            ps.setString(8, gender);
            ps.setString(9, phone);
            ps.setString(10, email);
            ps.setString(11, address);
            ps.setString(12, course);

            int i = ps.executeUpdate();
            response.getWriter().println("executed  successfulll");

            if (i > 0) {
            	response.getWriter().println("Registration successfulll");
                response.sendRedirect("registration.jsp");
                
            } else {
            	
                response.getWriter().println("Registration Failed");
            }

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}