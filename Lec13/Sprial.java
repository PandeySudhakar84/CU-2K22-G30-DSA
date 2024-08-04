package Lec13;

public class Sprial {
    public static void main(String[] args) {
        int arr[][]={
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        SprialPrint(arr);
    }
    public static void SprialPrint(int arr[][]){
        int mincol=0;
        int maxcol=arr[0].length-1;
        int minrow=0;
        int maxrow=arr.length-1;
        int total=arr.length*arr[0].length;
        int c=0;
        while (c<total){
            for(int i=mincol;i<=maxcol && c<total;i++){
                System.out.print(arr[minrow][i]+" ");
                c++;
            }
            minrow++;
            for(int i=minrow;i<=maxrow && c<total;i++){
                System.out.print(arr[i][maxcol]+" ");
                c++;
            }
            maxcol--;
            for(int i=maxcol;i>=mincol && c<total;i--){
                System.out.print(arr[maxrow][i]+" ");
                c++;
            }
            maxrow--;
            for(int i=maxrow;i>=minrow && c<=total;i--){
                System.out.print(arr[i][mincol]+" ");
                c++;
            }
            mincol++;
        }
    }
}
