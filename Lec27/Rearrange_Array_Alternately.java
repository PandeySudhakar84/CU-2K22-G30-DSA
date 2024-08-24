package Lec27;

public class Rearrange_Array_Alternately {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int max_ele=arr[arr.length-1]+1;
        int min_inx=0;
        int max_inx=arr.length-1;
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                arr[i]=arr[i]+(arr[max_inx]%max_ele )*max_ele;
                max_inx--;
            }
            else {
                arr[i]=arr[i]+(arr[min_inx]%max_ele )* max_ele;
                min_inx++;
            }
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=arr[i]/max_ele;
            System.out.print(arr[i]+" ");
        }
    }
}
