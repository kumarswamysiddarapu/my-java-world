package jdbcccc;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Delete1 {
	public static void main(String ar[]) throws SQLException{
		String url="jdbc:postgresql://localhost:5432/school?user=postgres&password=123";
		Connection con=null;
		Statement smt=null;
		try {
			con=DriverManager.getConnection(url);
			smt=con.createStatement();
			String sql="delete from student where id=109";
			smt.executeUpdate(sql);
			System.out.println("one row is deleted");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			if(con!=null) con.close();
			if(smt!=null) smt.close();
			
		}
		}
	
}
