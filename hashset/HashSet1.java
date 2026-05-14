public class HashSet1
{
public static void main(String fd[])
{
  HashSet_Implementation1 hs=new HashSet_Implementation1();
  hs.add(10);
  hs.add(20);
  hs.add(30);
  hs.add(40);
  hs.add(10);
  hs.add(80);
  hs.add(90);
  hs.add(200);
  hs.add(300);
  hs.add(400);
  hs.add(100);
  hs.add(200);
  hs.add('a');
  hs.add("gsf");
  hs.add(500);
  hs.add(null);
  hs.add(400);
  hs.add(500);
  hs.add("null");
 
  

  System.out.println(hs);
}
}