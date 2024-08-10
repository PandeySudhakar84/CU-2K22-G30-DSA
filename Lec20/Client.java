package Lec20;

public class Client {
    public static void main(String[] args) {
        Abstraction_Demo sc=new Abstraction_Demo() {
            @Override
            public void Payment() {
                System.out.println("we can pay");
            }

            @Override
            public void ViewBallence() {
                System.out.println("now we can check you Ballence");
            }
        };
        sc.ViewBallence();
        sc.Payment();
//        Abstraction sc=new Abstraction();
//        sc.Payment();
//        sc.ViewBallence();
    }
}
