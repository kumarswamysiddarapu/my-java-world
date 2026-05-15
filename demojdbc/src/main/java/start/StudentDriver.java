package start;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentDriver {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
	 StudentService std=new StudentService();
	 System.out.println("1 for insert");
	 System.out.println("2 for delete");
	 System.out.println("3 for update");
	 System.out.println("4 fro retrieve");
	 System.out.println("5 for closing");
	 
	 while(true) {
		 
		 System.out.println("Enter one option");
		 int option=sc.nextInt();
		 switch(option) {
		 case 1:
		 {
			 
			int insert=std.insertData();
			if(insert>0) System.out.println("inserted successfully");
			else System.out.println("not inserted successfully");
			break;
			 
		 }
		 case 2:
		 {
			int delete=std.deleteData();
			if(delete>0)System.out.println("deleted successfully");
			else System.out.println("not inserted successfully");
			break;
		 }
		 case 3:
		 {
			int update=std.updatedata();
			if(update>0)System.out.println("deleted successfully");
			else System.out.println("not inserted successfully");
			break;
		 }
		 case 4:
		 {
			 System.out.println("list of table records");
			List<Student> list=std.retrieveData();
			int i=0;
			while(i<list.size()) {
				System.out.println(list.get(i++));
			}
			break;
		 }
		 case 5:
		 {
			std.closeConnection();
			break;
		 }
		 default:
		    System.out.println("enter a valid option to proced after compilation");
		    break;
		 }
	 }
	}
}
class StudentService{
	private static Scanner sc=new Scanner(System.in);
	private static Connection con=null;
	private static String url="jdbc:postgresql://localhost:5432/school?user=postgres&password=123";
	static {
	try {
		con=DriverManager.getConnection(url);
	} catch (SQLException e) {
		e.printStackTrace();
	}
	}
	public int insertData() {
		int result=0;
		System.out.println("enter id number "+" ");
		int id=sc.nextInt();
		System.out.println("enter name "+" ");
		String name=sc.next();
		System.out.println("enter age "+" ");
		int age=sc.nextInt();
		try {
		String str="insert into student(id,name,age) values(?,?,?)";
		PreparedStatement smt=con.prepareStatement(str);
		smt.setInt(1, id);
		smt.setString(2,name);
		smt.setInt(3, age);
	    result=smt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}
        return result;	
	}
	public int deleteData() {
		int result =0;
		System.out.println("enter id ");
		int id=sc.nextInt();
		try {
			String str="delete from student where id=?";
			PreparedStatement smt=con.prepareStatement(str);
			smt.setInt(1, id);
			result =smt.executeUpdate();
		}catch(SQLException e) {
			
		}
		return result;
	}
	public int updatedata() {
		int result =0;
		System.out.println("enter age to change");
		int age=sc.nextInt();
		System.out.println("enter name to change");
		String name=sc.next();
		System.out.println("enter id where to change");
		int id=sc.nextInt();
		try {
			String str="update student set age=?,name=? where id=?";
			PreparedStatement smt=con.prepareStatement(str);
			smt.setInt(1,age);
			smt.setString(2, name);
			smt.setInt(3,id);
			result=smt.executeUpdate();
		}catch(SQLException e) {
			
		}
		return result;
	}
	public List<Student> retrieveData(){
		List<Student> list=new ArrayList<Student>();
		String str="select * from student";
		try {
		PreparedStatement smt=con.prepareStatement(str);
		ResultSet set=smt.executeQuery();
		while(set.next()) {
			 int id = set.getInt("id");
	            String name = set.getString("name");
	            int age = set.getInt("age");

	            Student s = new Student(id, name, age);
	            list.add(s);
		}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	public void closeConnection() {
		try {
        if(con!=null) { con.close();
        System.out.println("Connection Closed successfully");
        }else {
        	System.out.println("Connection only not established");
        }
        System.exit(0);
        
	}catch(SQLException e) {
		e.printStackTrace();
		}
	}
	
}
class Student{
	int id;
	String name;
	int age;
	public Student(int id,String name,int age){
		this.id=id;
		this.name=name;
		this.age=age;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
		
	}
	
}
