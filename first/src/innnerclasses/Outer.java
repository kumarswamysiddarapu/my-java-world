package innnerclasses;

public class Outer {
    class Inner {
        public void engine() {
            System.out.println("Engine");
        }
    }
    public static void main(String[] args) {
       Outer o = new Outer();
       o.motar();
    }
    public void motar(){
        Inner i = new Inner();
        i.engine();
        System.out.println("Motor");
    }
}