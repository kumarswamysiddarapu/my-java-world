package has_a_relation.composition;

public class Car {
    private Engine engine;
    Car() {
       engine = new Engine();
    }
    public static void main(String[] args){
        Car car = new Car();
        car.drive();
    }
    public void drive(){
        engine.start();
        System.out.println("Car is moving");
    }
}
class Engine {
    public void start() {
        System.out.println("Engine is started");
    }
}
