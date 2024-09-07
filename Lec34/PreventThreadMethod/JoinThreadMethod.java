package Lec34.PreventThreadMethod;
// if a thread want to join for another thread to compleate the task then we should use join
public class JoinThreadMethod {
    public static void main(String[] args) throws InterruptedException {
        JoinDemo t1=new JoinDemo();
        t1.start();
        t1.join();
        for(int i=1;i<=5;i++){
            System.out.println(i+" "+Thread.currentThread().getName());
        }
    }
}
class JoinDemo extends Thread{
    @Override
    public void run(){
       try{
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
