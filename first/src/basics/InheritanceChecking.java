package basics;

public class InheritanceChecking {
    public static void main(String[] args) {
        new B1();
        System.out.println("------------");
        new B1(10);
        System.out.println("------------");
        new B1(10,20,30);
    }
}
class A1{
    A1(){
        System.out.println("A non parameterized constructor");
    }
    A1(int a){
        System.out.println("A parameter ");
    }
}
class B1 extends A1{
     B1(){
        System.out.println("B");
    }
     B1(int a){
        System.out.println("B parameterized constructor ");
    }
    B1(int a,int b,int c){
         this(a);
         System.out.println("B parameterized three   ");
    }
}
