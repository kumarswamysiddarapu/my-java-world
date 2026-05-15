package jdbcccc;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class UpdateExample1 {
	public static void main(String[] ar) throws SQLException
	{
		String url="jdbc:postgresql://localhost:5432/school";
		String user="postgres";
		String pwd="123";
		
		Connection con=null;
		Statement smt=null;
		try {
		con=DriverManager.getConnection(url,user,pwd);
		smt= con.createStatement();
		String sql="UPDATE student SET name='karan' where id=104";
		smt.executeUpdate(sql);
		System.out.println("one row is updated");
		}catch(Exception e) {
			
		}
		finally {
			if(con!=null) con.close();
			if(smt!=null) smt.close();
		}
		
	}

}
