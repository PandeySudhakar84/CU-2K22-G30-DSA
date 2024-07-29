package Lec11;

public class Kadan_Algorithem {
    public static void main(String[] args) {
       int arr[]={-2,1,-3,4,-1,2,1,-5,4};
       MaximumSum(arr);
    }
    public static void MaximumSum(int arr[]){
        int ans=Integer.MIN_VALUE;
        int sum=0;
        for(int i=0;i< arr.length;i++){
            sum=sum+arr[i];
            ans=Math.max(ans,sum);
            if(sum<0){
                sum=0;
            }
        }
        System.out.println(ans);
    }
}
