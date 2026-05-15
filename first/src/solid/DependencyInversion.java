package solid;

public class DependencyInversion {
    public static void main(String[] args) {
        Computer c=new Computer(new Keyboard());
        c.gettingTypeIs();
        c=new Computer(new Wireless());
        c.gettingTypeIs();
        c=new Computer(new Browser());
        c.gettingTypeIs();
    }
}
interface Device{
    void type();
}
class Keyboard implements Device{
    @Override
    public void type() {
        System.out.println("getting data from Keyboard");
    }
}
class Wireless implements Device{
    @Override
    public void type() {
        System.out.println(" getting data from wireless keyboard");
    }
}
class Browser implements Device{
    @Override
    public void type() {
        System.out.println(" getting data from browser");
    }
}
class Computer{
    Device device;
    Computer(Device device){
        this.device=device;
    }
    public void gettingTypeIs(){
        device.type();
        System.out.println("------------------------");
    }
}
