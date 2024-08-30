package Lec29;
public class Longest_Uncommon_Subsequence {
    public static void main(String[] args) {
       String a = "aba";
       String b = "cdc";
        System.out.println(findLUSlength(a,b));
    }
        public static int findLUSlength(String a, String b) {
            if(a.equals(b)){
                return -1;
            }
            if(a.length()>b.length()){
                return a.length();
            }
            else{
                return b.length();
            }
        }
    }
