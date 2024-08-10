package Lec21;

public class Abstract_client {
    public static void main(String[] args) {
////        Abstraction sc=new Abstraction();
////        sc.Payment();
////        sc.Payment();
//        Abstraction_Child sc=new Abstraction_Child();
//        sc.Payment();
//        sc.ShowDeta();
//    }
        Abstraction s = new Abstraction() {
            @Override
            public void Payment() {
                System.out.println("we can pay");
            }

            @Override
            public void ShowDeta() {
                System.out.println("we can show data");
            }
        };
        s.Payment();
        s.ShowDeta();
    }
}
