package Lec5;

public class Pascals_Trangle {
    public static void main(String[] args) {
        int n=5;
        for(int row=0;row<n;row++){
            int val=1;
           for(int star=0;star<=row;star++){
               System.out.print(val+" ");
               val=val*(row-star)/(star+1);
           }
            System.out.println();
        }
    }
}
