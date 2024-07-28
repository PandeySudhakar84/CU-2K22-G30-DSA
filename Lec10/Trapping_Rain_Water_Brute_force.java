package Lec10;

public class Trapping_Rain_Water_Brute_force {
    public static void main(String[] args) {
       int  height[] = {0,1,0,2,1,0,1,3,2,1,2,1};
       Trap(height);
    }
    public static void Trap(int arr[]){
        int ans=0;
        for(int i=0;i<arr.length;i++){
            int leftmax=0;
            int rightmax=0;
            int j=i;
            while(j>=0){
                if(arr[j]>leftmax){
                    leftmax=arr[j];
                }
                j--;
            }
            j=i;
            while(j<arr.length){
                if(arr[j]>rightmax){
                    rightmax=arr[j];
                }
                j++;
            }
            ans=ans+(Math.min(leftmax,rightmax)-arr[i]);
            //  ans=ans+min-arr[i];
        }
        System.out.println(ans);
    }
}
