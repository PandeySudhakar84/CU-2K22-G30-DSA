package Lec34.PreventThreadMethod;
public class JoinMethod {
    static Thread Mainthread;
    public static void main(String[] args) throws InterruptedException {
        Join_Demo t1=new Join_Demo();
         Mainthread=Thread.currentThread();
        t1.start();
        t1.join();
        for(int i=1;i<=5;i++){
            Thread.sleep(1000);
            System.out.println(i+" "+Thread.currentThread().getName());
        }
    }
}
class Join_Demo extends Thread{
    @Override
    public void run(){
        try {
           // JoinMethod.Mainthread.join();
            for(int i=1;i<=5;i++){
                Thread.sleep(1000);
                System.out.println(i+" "+Thread.currentThread().getName());
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
