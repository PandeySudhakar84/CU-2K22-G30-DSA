package Lec6;

public class Binary_To_Decimal {
    public static void main(String[] args) {
        int num=10111;
        int mul=1;
        int sum=0;
        while (num>0){
            int rem=num%10;
            sum=sum+rem*mul;
            mul=mul*2;
            num=num/10;
        }
        System.out.println(sum);
    }
}
