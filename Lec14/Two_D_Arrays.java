package Lec14;

import java.util.Scanner;

public class Two_D_Arrays {
    public static void main(String[] args) {
//        int arr[][]=new int[3][4];
//        int row=arr.length;
//        int col=arr[0].length;
//        arr[0][0]=1;
//        arr[0][1]=2;
//        for(int i=0;i<arr.length;i++){
//            for(int j=0;j<arr[0].length;j++){
//                System.out.print(arr[i][j]+" ");
//            }
//            System.out.println();
//        }
        int arr[][]=new int[3][];
        arr[0]=new int[4];
        arr[1]=new int[3];
        arr[2]=new int[2];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
