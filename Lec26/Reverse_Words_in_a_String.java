package Lec26;
import java.util.Scanner;
public class Reverse_Words_in_a_String {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            String s=sc.nextLine();
      Reverse(s);
    }
    public static void Reverse(String s){
        s.trim();
        String ans="";
        String str[]=s.split(" +");
        for(int i=str.length-1;i>=0;i--){
            ans=ans+str[i]+" ";
        }
        System.out.println(ans.trim());
    }
}
