package Lec27;

import java.util.Scanner;
public class Running_Sum_of_1d_Array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int arr1[]=new int[n];
        arr1[0]=arr[0];
        for(int i=1;i<n;i++){
            arr1[i]=arr1[i-1]+arr[i];
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr1[i]+" ");
        }
    }
}
