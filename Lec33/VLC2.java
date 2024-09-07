package Lec33;
// performing single task from single thread
// performing single task from multipal thread
// performing multipal task from single thread not possible
// performing multipal task from multipal thread
public class VLC2 {
    public static void main(String[] args) {
        Video1 t1=new Video1();
        t1.start();
        if(t1.isAlive()){
            System.out.println("threat created");
        }
        else {
            System.out.println("not created");
        }
        Music1 t2=new Music1();
        t2.start();
        if(t2.isAlive()){
            System.out.println("thread created");
        }
        else {
            System.out.println("not created");
        }
        progressBar1 t3=new progressBar1();
        t3.start();
        if(t3.isAlive()){
            System.out.println("thread created");
        }
        else {
            System.out.println("not created");
        }
    }
}
class Video1 extends Thread{
    @Override
    public void run(){
        System.out.println("we can play Video");
    }
}
class Music1 extends Thread{
    @Override
    public void run(){
        System.out.println("we can play music");
    }
}
class progressBar1 extends Thread{
    @Override
    public void run(){
        System.out.println("we can check progress");
    }
}