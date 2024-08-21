package Lec24;
public class Reverse_Words_in_a_String {
    public static void main(String[] args) {
        String  s = "the sky is blue";
        Reverse(s);
    }
    public static void Reverse(String s){
        s.trim();
        String str[]=s.split("\s+");
        String ans="";
        for(int i=str.length-1;i>=0;i--){
            ans=ans+str[i]+" ";
        }
        System.out.println(ans.trim());
    }
}
