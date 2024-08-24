package Lec25;
public class ReverseString {
    public static void main(String[] args) {
        String s="hello";
        Reverse(s);
    }
    public static void Reverse(String s){
        char ch[]=s.toCharArray();
        int i=0;
        int j=ch.length-1;
        while(i<j){
            char temp=ch[i];
            ch[i]=ch[j];
            ch[j]=temp;
            i++;
            j--;
        }
        String str=new String(ch);
        System.out.println(str);
    }
}
