public class ArrayList2
{
 public static void main(String ad[])
{
  Arraylist_Implementation2 a=new Arraylist_Implementation2();
  a.add(15);
  a.add(25);  
  a.add(35);
  a.add(45);
  a.add(15);
  a.add(25);  
  a.add(35);
  a.add(45);
  a.add(15);
  a.add(25);  
  a.add(35);
  a.add(45);
    
System.out.println(a);
a.remove(0);
System.out.println(a);

a.add(2,1234);
System.out.println(a);
a.clear();
System.out.println(a);




}
}