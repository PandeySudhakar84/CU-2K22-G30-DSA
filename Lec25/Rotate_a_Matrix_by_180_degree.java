package Lec25;
import java.util.Scanner;
public class Rotate_a_Matrix_by_180_degree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int arr[][]=new int[m][n];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        Trans(arr);
        Rotated90(arr);
        Trans(arr);
        Rotated90(arr);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void Trans(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr[0].length;j++){
                int temp=arr[i][j];
                 arr[i][j]=arr[j][i];
                 arr[j][i]=temp;
            }
        }
    }
    public static void Rotated90(int arr[][]){
        for(int i=0;i<arr.length/2;i++){
            for(int j=0;j<arr[0].length;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[arr.length-1][j];
                arr[arr.length-1][j]=temp;
            }
        }
    }
}
