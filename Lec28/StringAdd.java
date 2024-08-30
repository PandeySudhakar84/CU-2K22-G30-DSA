package Lec28;

public class StringAdd {
    public static void main(String[] args) {
        String s1="hello";
        String s2="bye";
        System.out.println(s1+s2);
        System.out.println("hello"+"word");
        System.out.println("hello"+5+3+5+"by");
        System.out.println(s1+"bye");
        System.out.println("hello"+s2);
        System.out.println(1+2+4+5+"hiiii");
        System.out.println("hello"+(20+25)+"bye");
        String s3=s1+s2;
        String s4="hellobye";
        System.out.println(s3==s4);
    }
}
