package Lec46;
public class Freq {
    public static void main(String[] args) {
        String s="hello";
        int arr[]=new int[256];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)]++;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=1){
                System.out.println((char) i+"="+arr[i]);
            }
        }
    }
}
