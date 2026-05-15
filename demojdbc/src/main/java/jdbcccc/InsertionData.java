package jdbcccc;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertionData {
	static private  Connection con=null;
	static private Statement smt=null;
	static private PreparedStatement pre=null;
	public static void main(String[] args) throws FileNotFoundException, SQLException {
		//String url="jdbc:postgresql://localhost:5432/school/user=postgres&password=123";
		String url1="jdbc:postgresql://localhost:5432/school/user=postgres&password=123";
	   try {	
		con=DriverManager.getConnection(url1);
		 smt=con.createStatement();
		String query="insert into employee values(1025,'karan',130000,'SBA1101')";
		smt.execute(query);
		System.out.println("Executed successfully");
		String query1="insert into employee values(?,?,?,?)";
	    pre=con.prepareStatement(query1);
		pre.setInt(1,1026);
		pre.setString(2,"kiran");
		pre.setInt(3,13000);
		pre.setString(4,"SBA1102");
		System.out.println("second statement executed successfully");
	   }catch(Exception e) {
		   System.out.println(e.getMessage());
	   }
	   finally {
           if(pre!=null) pre.close();
           if(smt!=null) smt.close();
           if(con!=null) con.close(); 
	   }
		
		
	}

}

