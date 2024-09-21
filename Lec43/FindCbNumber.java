package Lec43;
public class FindCbNumber {
    public static void main(String[] args) {
        String s="81615";
        int count=0;
        boolean visited[]=new boolean[s.length()];
        for(int len=1;len<=s.length();len++){
            for(int j=len;j<=s.length();j++){
                int i=j-len;
                //System.out.println(s.substring(i,j));
                if(IsCbNumber(Long.parseLong(s.substring(i,j))) && IsVisited(visited,i,j-1)){
                    count++;
                    for(int k=i;k<j;k++){
                        visited[k]=true;
                    }
                }
            }
        }
        System.out.println(count);
    }
    public static boolean IsVisited(boolean visited[],int i,int j){
        for(int k=i;k<=j;k++){
            if(visited[k] ==true){
                return false;
            }
        }
        return true;
    }
    public static boolean IsCbNumber(Long num){
        int arr[]= {2,3,5,7,11,13,17,19,23,29};
       if(num==0 || num==1){
           return false;
       }
       for(int i=0;i<arr.length;i++){
           if(arr[i]==num) {
               return true;
           }
       }
       for(int i=0;i<arr.length;i++){
           if(num % arr[i]==0){
               return false;
           }
       }
       return true;
    }
}
