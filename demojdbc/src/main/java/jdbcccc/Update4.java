package jdbcccc;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Update4 {
	static String url="jdbc:postgresql://localhost:5432/school?user=postgres&password=123";
	static Connection con=null;
	static Statement smt=null;
	public static void main(String[] args) throws SQLException{
		try {
			con=DriverManager.getConnection(url);
			smt=con.createStatement();
			String sql="Update student set name='pranay' where id=107";
			smt.executeUpdate(sql);
			System.out.println("one row is updated");
		    con.close();
		    smt.close();
		    
		    }catch(Exception e){

		}
	}
}
