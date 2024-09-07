package Lec32;

public class Testt implements Runnable{
    @Override
    public void run() {
        System.out.println("thread created");
    }

    public static void main(String[] args) {
        Testt sc=new Testt();
        Thread s=new Thread(sc);
        s.start();
        if(s.isAlive()){
            System.out.println("thread created successfully");
        }
        else{
            System.out.println("not created");
        }
    }
}
