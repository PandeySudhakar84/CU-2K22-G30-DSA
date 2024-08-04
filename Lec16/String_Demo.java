package Lec16;

import java.util.Scanner;

public class String_Demo {
    public static void main(String[] args) {
        String s1="hello";
        String  s2="hello";
        String s3=new String("hello");
        String s4=new String("hello");
        System.out.println(s1==s2); //t
        System.out.println(s3==s4);//f
        System.out.println(s1==s4);
//        Scanner sc=new Scanner(System.in);
//       String s=sc.nextLine();
//        System.out.println(s);
        String str="hello word hh";
        System.out.println(str.substring(0,3));
        System.out.println(str.charAt(1));
        String s[]=str.split(" ");
        for(String n:s){
            System.out.println(n);
        }
    }
}
