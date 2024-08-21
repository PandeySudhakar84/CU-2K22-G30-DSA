package Lec24;
public class String_Addition {
    public static void main(String[] args) {
        String s1="      hello   ";
        String s2="hello            word";
        String str[]=s2.split("\s+");
        for(String s:str){
            System.out.println(s);
        }
        System.out.println(s1);
        System.out.println(s1.trim());
//        String s2="hello";
//        String s3="hello"+"bye";
//        String s4="hellobye";
//        System.out.println(s1.equals(s2));
//        String s5=s1.concat(s2);
//        System.out.println(s3==s4);
//        System.out.println(s4==s5);
//        System.out.println("hello"+(2+4));
//        System.out.println(2+4+"hello");
//        System.out.println(s1.compareTo(s2));
//        System.out.println(s1.substring(0,4));
    }
}
