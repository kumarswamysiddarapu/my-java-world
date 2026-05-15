public class ArrayList1
{
public static void main(String fa[])
{
 ArrayList_Implementation1 ai=new ArrayList_Implementation1();
 ai.add(10); 
 ai.add(20);
 ai.add(30); 
 ai.add(40);
 ai.add(50); 
 ai.add(60);
 ai.add(70); 
 ai.add(80);

 System.out.println("before removing the elements");
 System.out.println(ai); 
 System.out.println();

 System.out.println("7 index is "+ai.get(7));
 System.out.println("6 index is "+ai.get(6));


 System.out.println("size is "+ai.size());
 
System.out.println();
ai.add(2,40);
System.out.println("7 index is "+ai.get(7));
System.out.println("6 index is "+ai.get(6));
System.out.println("after adding elements");
System.out.print(ai);
System.out.println("size is "+ai.size());
 
}
}
