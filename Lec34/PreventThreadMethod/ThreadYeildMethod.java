package Lec34.PreventThreadMethod;
// yeild() stop the the current executing thread and give a chance to athor thread for execution
// in java 5 it intenally work as sleep method
// thread provide the hints to other thread schedural then its depend on thread schdural to accept or ignore the hint
public class ThreadYeildMethod {
    public static void main(String[] args) {
        YeildDemo t1=new YeildDemo();
        t1.start();
        Thread.yield();
        for(int i=1;i<=5;i++){
            System.out.println(i+" "+Thread.currentThread().getName());
        }
    }
}
class YeildDemo extends Thread{
    @Override
    public void run(){
        for(int i=1;i<=5;i++){
            System.out.println(i+" "+Thread.currentThread().getName());
        }
    }
}
