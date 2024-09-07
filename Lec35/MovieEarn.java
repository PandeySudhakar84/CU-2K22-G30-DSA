package Lec35;

public class MovieEarn {
    public static void main(String[] args) throws InterruptedException {
        TotalEarning t=new TotalEarning();
        t.start();
        synchronized (t){
            t.wait();
            System.out.println(t.totalEarning);
        }

    }
}
class TotalEarning extends Thread{
    int totalEarning=0;
    @Override
    public void run(){
        for(int i=1;i<=10;i++){
           totalEarning=totalEarning+500;
        }
        synchronized (this){
            this.notifyAll();
        }
    }
}
