package Lec25;

public class Find_First_Palindromic_String_in_the_Array {
    public static void main(String[] args) {
        String words[] ={"abc","car","ada","racecar","cool"};
        for(String str:words){
            if(Ispalindrome(str)){
                System.out.println(str);
                return;
            }
        }
        System.out.println("");
    }
    public static boolean Ispalindrome(String str){
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
