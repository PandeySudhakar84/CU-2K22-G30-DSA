package Lec32;
public class Thread_Demo extends Thread{
    @Override
    public void run(){
        System.out.println("thread created");
    }
}
class thread2 extends Thread{
    @Override
    public void run(){
        System.out.println("thread2");
    }
}
class client{
    public static void main(String[] args) {
        Thread_Demo sc=new Thread_Demo();
        thread2 s1=new thread2();
        s1.start();
        sc.start();
//        sc.start();  // Exception in thread "main" java.lang.IllegalThreadStateException
        if(sc.isAlive()){
            System.out.println("thread created sucessfully");
        }
        else {
            System.out.println("not created");
        }
    }
} 
