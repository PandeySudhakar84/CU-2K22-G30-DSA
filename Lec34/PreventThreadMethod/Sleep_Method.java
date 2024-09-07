package Lec34.PreventThreadMethod;

public class Sleep_Method{
//    public static void main(String[] args) throws InterruptedException {
//        for(int i=1;i<=5;i++){
//            Thread.sleep(5000);
//            System.out.println(i);
//        }
//    }
public static void main(String[] args) {
    for(int i=1;i<=5;i++){
        try {
            Thread.sleep(1000);
            System.out.println(i);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
}
