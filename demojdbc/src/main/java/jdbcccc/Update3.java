package jdbcccc;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Update3 {
	public static void main(String []ar) throws SQLException
	{
		String url="jdbc:postgresql://localhost:5432/school?user=postgres&password=123";
		Connection con=null;
		Statement smt=null;
		try {
			con=DriverManager.getConnection(url);
			smt=con.createStatement();
			String sql="update student set name='prayag' where id=106";
			smt.executeUpdate(sql);
			System.out.println("one row is updated");
			con.close();
			smt.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
