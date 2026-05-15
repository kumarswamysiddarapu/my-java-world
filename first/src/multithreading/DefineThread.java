package multithreading;

public class DefineThread {

    public static void main(String[] args) {
      MyThread2 t1 = new MyThread2();
      t1.start();
      MyRunnable r = new MyRunnable();
      Thread t3 = new Thread(r);
      t3.start();
      //r.start();
        r.run();

    }
}
class MyThread2 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread "+" "+i);
        }
    }
}
class  MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Runnable "+" "+i);
        }
    }
}