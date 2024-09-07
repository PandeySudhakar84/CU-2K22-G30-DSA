package Lec35;

import java.util.Scanner;

public class Valid_index_of_array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int q=sc.nextInt();
        for(int i=0;i<q;i++){
            int index=sc.nextInt();
            try {
                System.out.println(arr[index]);
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("out of Bounds");
            }
        }
    }
}
