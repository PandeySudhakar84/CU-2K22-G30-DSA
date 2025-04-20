package Lec29;

public class DNF {
    public static void main(String[] args) {
       int nums[] ={2,0,2,1,1,0};
       Dnf(nums);
    }
    public static void Dnf(int arr[]){
        int left=0;
        int right=arr.length-1;
        int i=0;
        while(i<=right){
          if(arr[i]==0){
              int temp=arr[i];
              arr[i]=arr[left];
              arr[left]=temp;
              i++;
              left++;
          }
          else if (arr[i]==1) {
              i++;
          }
          else {
              int temp=arr[i];
              arr[i]=arr[right];
              arr[right]=temp;
              right--;
          }
        }
        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }
    }
} 
