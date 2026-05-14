public class HashSetImplementation2
{
  int count=0;
  Node a[]=new Node[6]; 
public boolean add(Object ele)
{
  int index=Math.abs(ele.hashCode()%a.length) ;
  Node n=new Node(ele);
  if(a[index]==null){ 
    a[index]=n;
    count++;
    return true;
   }
 Node curr=a[index];
 while(curr.next!=null)
 {
  if(curr.ele.equals(ele)){
   return false;
   }
  curr=curr.next;
 }
 curr.next=n;
 count++;
 return true;
}
public boolean remove(Object ele)
{
 int index=Math.abs(ele.hashCode()%a.length);
 Node curr=a[index];
 Node prev=null;
 while(curr!=null)
 {
  if(curr.ele.equals(ele))
  {
   if(prev==null){
       curr=curr.next;
       count--;
       return true;
      }
     prev.next=curr.next;
     count--;
     return true;
  }
  prev=curr;
  curr=curr.next;
 }
 return false;
}
public boolean contains(Object ele)
{
 int index=Math.abs(ele.hashCode()%a.length);
 Node curr=a[index];
 while(curr!=null)
 {
  if(curr.ele.equals(ele)) return true;
  curr=curr.next;
 }
 return false;
}
public int size()
{
 return count;
}
public String toString()
{
 if(size()==0) return "[]";
  int c=0;
  Node curr=null;
  String s="[";
  while(c<a.length)
  {
  // System.out.println(c);
   curr=a[c];
   while(curr!=null)
   {
    s+=curr.ele+",";
    curr=curr.next;
   }
  c++;
  }
 s+="]";
 return s;
}
}





