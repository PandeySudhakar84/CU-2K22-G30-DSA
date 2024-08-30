package Lec28;
public class String_Immutable {
    public static void main(String[] args) {
        String s1="ch";
        String s2="ch";
        String s3="ch";
        String s4="Delhi";
        System.out.println(s1);
        System.out.println(s4);
        System.out.println(s1);
        String sc=new String();
        System.out.println(s1.compareTo(s2));
    }
}
