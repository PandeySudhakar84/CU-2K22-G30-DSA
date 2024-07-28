package Lec10;

public class Traping_Rain_water {
    public static void main(String[] args) {
       int height[] ={0,1,0,2,1,0,1,3,2,1,2,1};
       Trap(height);
    }
    public static void Trap(int arr[]){
        int n= arr.length;
        int left[]=new int[n];
        int right[]=new int[n];
        int ans=0;
        left[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            left[i]=Math.max(arr[i],left[i-1]);
        }
        right[n-1]=arr[n-1];
        for(int i=n-2;i>=0;i--){
            right[i]=Math.max(right[i+1],arr[i]);
        }
        for(int i=0;i<left.length;i++){
            ans=ans+(Math.min(left[i],right[i])-arr[i]);
        }
        System.out.println(ans);
    }
}
