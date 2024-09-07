package Lec34;
// Deamon thread run in the Background of another thread
// it provides service to the thread e.g Garbase collector
// its life depends on another thread
// deamon thread inherit the property of parents thread
public class Demoan_Thread_Method {
    public static void main(String[] args) {
        Test3 t3=new Test3();
        t3.setDaemon(true);
        t3.start();
        System.out.println("main thread");
    }
}
class Test3 extends Thread{
    @Override
    public void run() {
        if (Thread.currentThread().isDaemon()) {
            System.out.println("This Daemon thread");
        } else {
            System.out.println("child thread");
        }
    }
}