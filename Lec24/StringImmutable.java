package Lec24;
public class StringImmutable {
    public static void main(String[] args) {
//        String s1 = "ch";
//        String s2 = s1;  // s2 and s1 both point to the same "ch"
//        s1 = "Delhi";  // s1 now points to a new string "Delhi"
//        System.out.println("s1: " + s1);  // Output: "Delhi"
//        System.out.println("s2: " + s2);  // Output: "ch"
        String s1="ch";
        String s2="ch";
        String s3="ch";
        String s4="ch";
        s3="Delhi";
        System.out.println(s3);
        System.out.println(s1);
    }
}
