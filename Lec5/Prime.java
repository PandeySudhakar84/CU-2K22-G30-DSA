package Lec5;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
         //for(int i=2;i<n;i++){
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                count++;
                break;
            }
        }
        if(count>=1){
            System.out.println("Not prime");
        }
        else{
            System.out.println("prime");
        }
    }
}
