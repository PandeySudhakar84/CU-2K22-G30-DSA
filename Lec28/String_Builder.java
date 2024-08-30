package Lec28;
public class String_Builder {
    public static void main(String[] args) {
        StringBuilder sc=new StringBuilder(50);
        System.out.println(sc);
        sc.append("bye");
        sc.replace(0,2,"was");
        System.out.println(sc);
        System.out.println(sc.capacity());
    }
}
