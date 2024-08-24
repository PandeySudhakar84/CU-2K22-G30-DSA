package Lec25;
public class IsPalindrome {
    public static void main(String[] args) {
        String str="nitin";
        System.out.println(IsPalindrome(str));
    }
    public static boolean IsPalindrome(String str){
       int i=0;
       int j=str.length()-1;
       while(i<j){
           if(str.charAt(i)!=str.charAt(j)){
               return false;
           }
           i++;
           j--;
       }
       return true;
    }
}
