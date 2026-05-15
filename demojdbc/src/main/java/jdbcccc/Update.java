package jdbcccc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Update {
	public static void main(String[] args) throws SQLException
	{
		String url="jdbc:postgresql://localhost:5432/school?user=postgres&password=123";
		Connection con=null;
		Statement smt=null;
		PreparedStatement ps=null;
		try {
			con=DriverManager.getConnection(url);
			smt=con.createStatement();
			String query1="update employee set name='samay kumar' where id='SBA1007'";
			smt.execute(query1);
			System.out.println(" 1 row updated successfullly");
			String query2="update employee set name='samay' kumar where id='SBA1007'";
			ps=con.prepareStatement(query2);
			System.out.println("1 row updated successfully");
			
			
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}finally {
				if(smt!=null) smt.close();
				if(ps!=null)ps.close();
				if(con!=null)con.close();
			}		
	}
}
