package solid;

public class LiskovExample3 {
    public static void main(String[] args) {
       Motor m=new Scooty1();
     //  m.gearedMotor();
    }
}
interface Motor{
    void start();
}
interface NonGearMotor extends Motor{
    void gearedMotor();
}
class Scooty1 implements NonGearMotor{
    public void gearedMotor (){
        System.out.println("Scooty1 started");
    }

    @Override
    public void start() {

    }
}
class Bike2 implements Motor{
    public void start(){
        System.out.println("Bike2 started");
    }
}
