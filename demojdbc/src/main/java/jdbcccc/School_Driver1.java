package jdbcccc;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class School_Driver1 {
    public static void main(String dh[]) {

        Connection con = null;
        Statement smt = null;

        String url="jdbc:postgresql://localhost:5432/school";
        String username="postgres";
        String password="123";

        try {
            con = DriverManager.getConnection(url, username, password);

            smt = con.createStatement();

            String sql="INSERT INTO student VALUES (109,'kumar',23)";

            int rows = smt.executeUpdate(sql);

            System.out.println(rows + " row inserted");

        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            try {
                if(smt!=null) smt.close();
                if(con!=null) con.close();
            } catch(Exception e) {
            }
        }
    }
}