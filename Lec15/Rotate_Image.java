package Lec15;

import java.util.Scanner;

public class Rotate_Image {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[][]=new int[n][n];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        Rotate(arr);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void Rotate(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr[0].length;j++){
                int item=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=item;
            }
        }
        Swap(arr);
    }
    public static void Swap(int arr[][]){
        for(int i=0;i<arr.length/2;i++){
            for(int j=0;j<arr[0].length;j++){
                int item=arr[i][j];
                arr[i][j]=arr[arr.length-1-i][j];
                arr[arr.length-1-i][j]=item;
            }
        }
    }
}
