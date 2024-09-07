package Lec34;
public class Thread_Naming_Method {
    public static void main(String[] args) {
        Test t1=new Test();
        Thread.currentThread().setName("sudhakar");
        System.out.println(Thread.currentThread().getName());
        t1.start();
        Test1 t2=new Test1();
        t2.start();
    }
}
class Test extends Thread{
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }
}
class Test1 extends Thread{
    @Override
    public void run(){
        Thread.currentThread().setName("Test1 Thread");
        System.out.println(Thread.currentThread().getName());
    }
}
