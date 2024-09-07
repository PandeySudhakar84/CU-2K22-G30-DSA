package Lec33;
public class VLC {
    public static void main(String[] args) {
        video sc=new video();
        Thread t1=new Thread(sc);
        t1.start();
        music s2=new music();
        Thread t2=new Thread(s2);
        t2.start();
        ProgressBar s3=new ProgressBar();
        Thread t3=new Thread(s3);
        t3.start();
    }
}
class video implements Runnable{

    @Override
    public void run() {
        System.out.println("we can play video");
    }
}
class music implements Runnable{

    @Override
    public void run() {
        System.out.println("we can play music");
    }
}
class ProgressBar implements Runnable{

    @Override
    public void run() {
        System.out.println("progressBar");
    }
}
