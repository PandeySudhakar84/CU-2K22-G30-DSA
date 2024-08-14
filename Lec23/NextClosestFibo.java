package Lec23;

public class NextClosestFibo {
    public static long nextFib(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Input must be a non-negative integer.");
        }
        
        // Base cases
        if (n == 0) return 1;
        if (n == 1) return 2;
        
        long a = 0;
        long b = 1;
        
        while (b <= n) {
            long temp = a;
            a = b;
            b = temp + b;
        }
        
        return b;
    }
    
    public static void main(String[] args) {
        int n = 34;
        System.out.println(nextFib(n));
    }
}
