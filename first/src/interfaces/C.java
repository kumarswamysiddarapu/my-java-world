package interfaces;
interface A {
   default void m1()
    {
        System.out.println("kumar swamy br of veerabhadra");
    }
}
interface B  {
    default void m1()
    {
        System.out.println("kumar swamy son munuswamy");
    }
}
public class C implements A,B{
    public void m1(){
        System.out.println("class c");
    }
    public static void main(String[] args)
    {
        C c=new C();
        c.m1();

    }
}
