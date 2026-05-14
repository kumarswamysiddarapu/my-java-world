import java.util.Scanner;
import java.util.Collections;
import java.util.Vector;


public class Vector_Demo
{
 public static void main(String ad[])
 {
   Scanner sc=new Scanner(System.in);
   System.out.println("enter elements to vector");
   Vector<Character>v=new Vector<Character>();
   while(true)
   {
     char ch=sc.next().charAt(0);
     if(ch<'A'||ch>'z')
       break;
       v.add(ch);
   }
   System.out.println("size of vector is"+v.size());
   System.out.println("entered elements"+v);
   Collections.sort(v);
   System.out.println("sorted elements sre"+v);
 }
}





