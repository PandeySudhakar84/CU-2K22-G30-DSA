package Lec45;
public class Greatest_Common_Divisor_of_trings {
    class Solution {
        public String gcdOfStrings(String str1, String str2) {
            String s1=str1+str2; // leetcode
            String s2=str2+str1; // codeleet
            if(s1.equals(s2)){
                int index=gcd(str1.length(),str2.length());
                return str1.substring(0,index);
            }
            return "";
        }
        public int gcd(int a,int b){
            return b==0?a:gcd(b,a%b);
        }
    }
}
