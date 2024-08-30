package Lec28;
public class String_contructor {
    public static void main(String[] args) {
        String str=new String();
        System.out.println(str); // create empty String
        String str1=new String("hello");
        System.out.println(str1);// //string literal
        char arr[]={'a','b','c','d'};
        String str2=new String(arr); // char array
        System.out.println(str2);
        byte arr1[]={65,66,67,68}; // byte array
        String str3=new String(arr1);
        System.out.println(str3);
    }
}
