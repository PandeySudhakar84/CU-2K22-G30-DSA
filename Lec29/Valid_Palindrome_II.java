package Lec29;
public class Valid_Palindrome_II {
    public static void main(String[] args) {
        String s="aba";
        boolean ans=validPalindrome(s);
        System.out.println(ans);
    }
        public static boolean validPalindrome(String s) {
            int i=0;
            int j=s.length()-1;
            while(i<j){
                if(s.charAt(i)!=s.charAt(j)){
                    return compare(s,i+1,j) || compare(s,i,j-1);
                }
                i++;
                j--;
            }
            return true;
        }
        public static boolean compare(String s,int l,int r){
            while(l<r){
                if(s.charAt(l)!=s.charAt(r)){
                    return false;
                }
                l++;
                r--;
            }
            return true;
        }
}
