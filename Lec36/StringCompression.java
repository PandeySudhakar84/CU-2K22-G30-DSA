package Lec36;
import java.util.*;
public class StringCompression {
        public static void main(String args[]) {
            Scanner sc= new Scanner(System.in);
            String s=sc.next();
            String ans="";
            char prev=s.charAt(0);
            int count=1;
            for(int i=1;i<s.length();i++){
                char cur=s.charAt(i);
                if(cur==prev){
                    count++;
                }
                else{
                    ans=ans+prev+count;
                    prev=cur;
                    count=1;
                }
            }
            ans=ans+s.charAt(s.length()-1)+count;
            System.out.println(ans);
        }
    }
