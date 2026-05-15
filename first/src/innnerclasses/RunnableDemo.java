package innnerclasses;

public class RunnableDemo {
    public static void main(String[] args) {
        Runnable r1 = new Runnable() {
            public void run() {
                for(int i=1;i<=5;i++){
                    System.out.println(Thread.currentThread().getName()+":"+i);
                }
            }
        };
        Thread t1 = new Thread(r1);
        t1.start();
        for(int i=1;i<=5;i++){
            System.out.println(Thread.currentThread().getName()+":"+i);
        }
    }
}
