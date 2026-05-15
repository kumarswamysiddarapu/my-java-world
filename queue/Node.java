public class Node
{
 Object ele;
 Node next;
public Node(Object e)
{
 this.ele=e;
 this.next=null;
} 
public Node(Object e,Node n)
{
 this.ele=e;
 this.next=n;
} 

}