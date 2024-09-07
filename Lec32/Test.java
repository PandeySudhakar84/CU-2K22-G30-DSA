package Lec32;

public class Test {
    public static void main(String[] args) {
//        String s="hello word";
//         String s1=s.toUpperCase();
//         String s2=s.toLowerCase();
//        System.out.println(s1);
//        System.out.println(s2);
        int data=10;
        Thread.currentThread().setName("sudhakar");
        int ans=data/0;
        System.out.println(ans); // here change thread name Exception in thread "sudhakar" java.lang.ArithmeticException: / by zero
        
    }
}
