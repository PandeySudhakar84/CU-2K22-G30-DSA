package Lec10;

public class Optimize_Approach {
    public static void main(String[] args) {
        int arr[]={4,2,0,3,2,5};
        Trap(arr);
    }
    public static void Trap(int arr[]){
        int n=arr.length;
        int i=0;
        int j=n-1;
        int leftmax=0;
        int rightmax=0;
        int ans=0;
        while(i<=j){
            if(arr[i]<=arr[j]){
                if(arr[i]>leftmax) {
                    leftmax = arr[i];
                }
                else {
                    ans=ans+leftmax-arr[i];
                }
                i++;
            }
            else {
                if(arr[j]>=rightmax){
                    rightmax=arr[j];
                }
                else {
                    ans=ans+rightmax-arr[j];
                }
                j--;
            }
        }
        System.out.println(ans);
    }
}
