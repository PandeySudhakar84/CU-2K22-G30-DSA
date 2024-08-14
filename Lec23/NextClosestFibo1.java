package Lec23;

public class NextClosestFibo1 {
    public static long nextFib(int n){
        double phi=(1+Math.sqrt(5))/2.0;
        return Math.round(n*phi);
    }
    public static void main(String[] args) {
        int n=34;
        System.out.println(nextFib(n));
    }
}
