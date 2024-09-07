package Lec34.PreventThreadMethod;

public class Use_Of_MultiThreading {
    public static void main(String[] args) throws Exception{
        Test t2=new Test();
        t2.start();
        Test t3=new Test();
        t3.start();
        for(int i=1;i<=5;i++){
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName()+" "+i);
        }
    }
}
class Test extends Thread{
    @Override
    public void run(){
        try {
            for(int i=1;i<=5;i++){
                Thread.sleep(1000);
                System.out.println(Thread.currentThread().getName()+" "+i);
            }
        }
//        catch (ArithmeticException e){
//            System.out.println(e);
//        }
//        catch (InterruptedException e){
//            System.out.println(e);
//        }
//        catch (ArrayIndexOutOfBoundsException e){
//            System.out.println(e);
//        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
