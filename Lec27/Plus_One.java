package Lec27;
public class Plus_One {
    public static void main(String[] args) {
        int arr[]={1,2,3};
        int a[]=plusOne(arr);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
        public static int[] plusOne(int[] digits) {
            int n=digits.length;
            int ans[]=new int[n+1];
            for(int i=n-1;i>=0;i--){
                if(digits[i]!=9){
                    digits[i]=digits[i]+1;
                    return digits;
                }
                else{
                    digits[i]=0;
                }
            }
            ans[0]=1;
            return ans;
        }
    }