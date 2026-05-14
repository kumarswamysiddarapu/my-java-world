public class HashSet_Implementation1
{
  private int count=0;
  Node[] a= new Node[8];
  int c=0;
  
public boolean add(Object ele)
{
 Node n1=new Node(ele);
 if(ele==null)
 {
  c++;
  int num=a.length-1;
  Node n=new Node("null");
  if(a[num]==null)
  {
    a[num]=n1;
    count++;
    return true;
  }
  return false;
 }
 Node n=new Node(ele);
 int index=Math.abs(ele.hashCode())%(a.length-1);
 if(a[index]==null&&ele!=null)
 {
   a[index]=n;
   count++;
   return true;
 }
 Node curr=a[index];
 Node temp=null;
 while(curr!=null)
 {
   if(curr.ele.equals(ele)) return false;
   temp=curr;
   curr=curr.next;
 }
 temp.next=n;
 count++;
 return true;
}
public String toString()
{
 int count=0;
 String s="[";
 for(int i=0;i<a.length-1;i++)
 {
  if(a[i]!=null){
   Node curr=a[i];
   s+=curr.ele+",";if(curr.next==null) continue;
   while(curr.next!=null)
   {
     curr=curr.next;
     s+=curr.ele+",";
   }
  }
 }
 Node curr=a[a.length-1];
  if(c>0){
  s+=curr.ele+"]";
 }
 else
  s+="]";
 return s;
}
}