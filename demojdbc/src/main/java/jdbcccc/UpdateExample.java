package jdbcccc;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class UpdateExample {
	public static void main(String[] arg)throws SQLException
	{
		Connection con=null;
	   Statement smt=null;
		
		String url="jdbc:postgresql://localhost:5432/school";
		String user="postgres";
		String pwd="123";
		try {
			con=DriverManager.getConnection(url,user,pwd);
			smt=con.createStatement();
			String sql="UPDATE student SET name='samay' where id=103";
			smt.executeUpdate(sql);
			System.out.println("one Statement updated");
			
			
		}catch(Exception e)
		{
			
		}
		finally {
			if(con!=null) con.close();
			if(smt!=null) smt.close();
		}
	}

}
