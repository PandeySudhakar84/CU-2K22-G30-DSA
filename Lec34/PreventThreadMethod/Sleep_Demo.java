package Lec34.PreventThreadMethod;

public class Sleep_Demo {
    public static void main(String[] args) {
        Sleep t=new Sleep();
        t.start();
    }
}
class Sleep extends Thread{
    @Override
    public void run(){
       try {
           for(int i=1;i<=5;i++){
               Thread.sleep(1000);
               System.out.println(i);
           }
       }
       catch (Exception e){
           System.out.println(e);
       }
    }
}
