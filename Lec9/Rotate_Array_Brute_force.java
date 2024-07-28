package Lec9;

public class Rotate_Array_Brute_force {
    public static void main(String[] args) {
        int nums[]= {1,2,3,4,5,6,7};
        int k = 3;
        Rotate(nums,k);
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
    public static void Rotate(int[] nums, int k) {
        int n=nums.length;
        k=k % n;
        for(int i=0;i<k;i++){
            int item=nums[n-1];
            for(int j=n-2;j>=0;j--){
                nums[j+1]=nums[j];
            }
            nums[0]=item;
        }
    }
}

// leet code solution
//class Solution {
//    public void rotate(int[] nums, int k) {
//        int n=nums.length;
//        k=k % n;
//        for(int i=0;i<k;i++){
//            int item=nums[n-1];
//            for(int j=n-2;j>=0;j--){
//                nums[j+1]=nums[j];
//            }
//            nums[0]=item;
//        }
//    }
//}
