package Lec11;

public class Product_of_Array_Except_Self {
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        Product(arr);
    }
    public static void Product(int arr[]){
        int n=arr.length;
        int left[]=new int[n];
        int right[]=new int[n];
        left[0]=1;
        for(int i=1;i< arr.length;i++){
            left[i]=left[i-1] * arr[i-1];
        }
        right[n-1]=1;
        for(int i=n-2;i>=0;i--){
            right[i]=right[i+1] * arr[i+1];
        }
        int ans[]=new int[n];
        for(int i=0;i<ans.length;i++){
            ans[i]=left[i] * right[i];
        }
        for(int i=0;i<left.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
