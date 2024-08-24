package Lec26;

import java.util.Arrays;

public class Minimum_Moves_to_Equal_Array_Elements_II {
    public static void main(String[] args) {
        int nums[]={1,10,2,9};
        System.out.println(minMoves2(nums));
    }
    public static int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int start=0;
        int end=nums.length-1;
        int count=0;
        while(start<end){
            count=count+(nums[end]-nums[start]);
            start++;
            end--;
        }
        return count;
    }
}
