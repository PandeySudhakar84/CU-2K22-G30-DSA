package Lec44;
public class MultiThreading_Demo {
    public static void main(String[] args) throws Exception{
     Video t1=new Video();
     t1.start();
        System.out.println(t1.isAlive());
       //t1.start();
        ProgressBar t3=new ProgressBar();
        t3.start();
    }
}
class Video extends Thread{
    @Override
    public void run(){
        try {
            Music t2=new Music();
            t2.start();
            t2.join();
            System.out.println("we can play video");
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
class Music extends Thread{
    @Override
    public void run(){
        System.out.println("we can play music");
    }
}
class ProgressBar extends Thread{
    @Override
    public void run(){
        System.out.println("Progressbar");
    }
}
