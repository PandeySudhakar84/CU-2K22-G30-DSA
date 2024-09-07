package Lec36;
public class MoviesEarning {
    public static void main(String[] args) throws Exception{
        TotalEarn t=new TotalEarn();
        t.start();
        synchronized (t){
            t.wait();
        }
        System.out.println(t.totalEarn);
    }
}
class TotalEarn extends Thread{
    int totalEarn=0;
    @Override
    public void run(){
        for(int i=1;i<=10;i++){
            totalEarn=totalEarn+500;
        }
 synchronized (this){
            this.notify();
            //this.notifyAll();
 }
    }
}
