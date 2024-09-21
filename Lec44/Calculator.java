package Lec44;
public class Calculator {
    public static void main(String[] args) throws InterruptedException {
        Addition t1=new Addition();
        t1.start();
        t1.join();
    }
}
class Addition extends Thread{
    @Override
    public void run(){
        Substraction t2=new Substraction();
        try {
            t2.start();
            t2.join();
            int a=10;
            int b=20;
            System.out.println(a+b);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
class Substraction extends Thread{
    @Override
    public void run(){
        Multiplication t3=new Multiplication();
        try {
            t3.start();
            t3.join();
            int a=20;
            int b=10;
            System.out.println(a-b);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
class Multiplication extends Thread{
    @Override
    public void run(){
        int a=10;
        int b=20;
        System.out.println(a*b);
    }
}
