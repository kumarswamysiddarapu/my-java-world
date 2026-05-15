package multithreading;

public class Synchonization {
    public static void main(String[] args) {
        LeaveExample leaveExample = new LeaveExample();
        leaveExample.start();
    }
}
class LeaveExample extends Thread{

    LeaveExample l=new LeaveExample();
    @Override
    public synchronized void run() {
     l.m1();
     l.m2();
     l.m3();
    }
    public void m1(){
        System.out.println("LeaveExample run1");
    }
    public void m2(){
        System.out.println("LeaveExample run2");
    }
    public void m3(){
        System.out.println("LeaveExample run3");
    }
}
class ReJoinExample extends Thread{
    @Override
    public void run() {

    }
}
