package jdbcccc;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RetrievingData {
	private static String url="jdbc:postgresql://localhost:5432/school";
	private static  String user="postgres";
	private static  String pwd="123";
	public static void main(String[] args) throws SQLException{
		Connection con=null;
		Statement smt=null;
		ResultSet rs=null;
		try {
			con=DriverManager.getConnection(url,user,pwd);
			smt=con.createStatement();
			rs=smt.executeQuery("select name from employee");
			while(rs.next()) {
				//System.out.print(rs.getInt("SLNO")+" ");
				System.out.print(rs.getString("name")+" ");
				//System.out.print(rs.getInt("salary")+" ");
				//System.out.print(rs.getString("id")+" ");
				System.out.println();
			}
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			if(rs!=null) rs.close();
			if(smt!=null) smt.close();
			if(con!=null) con.close();
		}
	}
}
