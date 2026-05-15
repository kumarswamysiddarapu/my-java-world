package jdbcccc;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Update2 {
	public static void main(String[] args) throws SQLException
	{
		String url="jdbc:postgresql://localhost:5432/school";
		String pwd="123";
		String user="postgres";
		
		Connection con=null;
		Statement smt=null;
		try {
			con=DriverManager.getConnection(url,user,pwd);
			smt= con.createStatement();
			String sql="update student set name='murthy' where id=105";
			smt.executeUpdate(sql);
			System.out.println("one row updated");
			
		}catch(Exception e) {
			
		}
		finally {
			con.close();
			smt.close();
		}
		
}
}
