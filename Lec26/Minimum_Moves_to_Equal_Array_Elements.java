package Lec26;

public class Minimum_Moves_to_Equal_Array_Elements {
    public static void main(String[] args) {
        int nums[]={1,2,3};
        System.out.println(minMoves(nums));
    }
    public static int minMoves(int[] nums) {
        int ans=0;
        int min=Integer.MAX_VALUE;
        for(int i:nums){
            if(min>i){
                min=i;
            }
        }
        for(int i:nums){
            ans=ans+(i-min);
        }
        return ans;
    }
}
