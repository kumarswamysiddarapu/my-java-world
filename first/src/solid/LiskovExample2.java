package solid;
//it is not correct but it should be like this only
//example for wrong representation of liskov principle
//we need to steps that enables the liskov principle perfectly


public class LiskovExample2 {
    public static void main(String[] args) {
      Vehicle v=new Bike();
    //   v.gearedEngine();
    }
}
interface Vehicle{

}
interface  NonGear extends Vehicle{
    void motor();
}
interface Gear extends Vehicle{
   public  void gearedEngine();
}
class Scooty implements NonGear{
    public void motor(){
        System.out.println("motor");
    }
}
class Bike implements Gear{
    public void gearedEngine(){
        System.out.println("geared engine");
    }
}