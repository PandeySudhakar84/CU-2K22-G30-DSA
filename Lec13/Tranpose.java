package Lec13;

public class Tranpose {
    public static void main(String[] args) {
        int arr[][]={
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        Trans(arr);
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
                int item=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=item;
            }
        }
    }
}
