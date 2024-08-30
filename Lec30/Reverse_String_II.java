package Lec30;
public class Reverse_String_II {
    public static void main(String[] args) {
        String s="abcdefg";
        int k=2;
        System.out.println(reverseStr(s,k));
    }
        public static String reverseStr(String s, int k) {
            char ch[]=s.toCharArray();
            for(int i=0;i<s.length();i=i+2*k){
                int left=i;
                int right=Math.min(i+k-1,s.length()-1);
                while(left<=right){
                    char temp=ch[left];
                    ch[left]=ch[right];
                    ch[right]=temp;
                    left++;
                    right--;
                }
            }
            return new String(ch);
        }
    }