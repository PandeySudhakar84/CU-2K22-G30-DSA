package Lec32;

public class VLC implements Runnable{
    @Override
    public void run() {
        System.out.println("Thread created");
    }
}
class Video implements Runnable{

    @Override
    public void run() {
        System.out.println("play video");
    }
}
class Music implements Runnable{

    @Override
    public void run() {
        System.out.println("play music");
    }
}
class Runnable_Client{
    public static void main(String[] args) {
        VLC s1=new VLC();
        Thread t1=new Thread(s1);
        t1.start();
        Video s=new Video();
        Thread t2=new Thread(s);
        t2.start();
    }
}

