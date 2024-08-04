package Lec16;

public class KaprekarNumber {
    public static void main(String[] args) {
        //int n=297;
        for(int i=1;i<1000;i++){
            if(Kaprekar(i)){
                System.out.println(i);
            }
        }

    }
    public static Boolean Kaprekar(int n){
        if(n==1){
            //System.out.println("T");
            return true;
        }
        int sq=n*n;
        int temp=n;
        int count=0;
        while(temp>0){
            count++;
            temp=temp/10;
        }
        int div=(int)(Math.pow(10,count));
        int f=sq/div;
        int s=sq%div;
        int sum=f+s;
        if(sum==n){
//            System.out.println("T");
            return true;
        }
        return false;
    }
}
