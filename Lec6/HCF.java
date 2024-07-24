package Lec6;

public class HCF {
    public static void main(String[] args) {
//        int divisor=36;
//        int dividend=60;
//        while(dividend%divisor!=0){
//            int rem=dividend%divisor;
//            dividend=divisor;
//            divisor=rem;
//        }
//        System.out.println(divisor);
        int a=36;
        int b=60;
        int hcf=0;
        int min=(a<b?a:b);
        for(int i=1;i<=min;i++){
            if(a%i==0 && b%i==0){
                hcf=i;
            }
        }
        int lcm=(a*b)/hcf;
        System.out.println(lcm);
        System.out.println(hcf);
    }
}
