package Lec49;
public class MultipleSum {
    public static void main(String[] args) {
        int x=12;
        int n1=x/3;
        int n2=x/5;
        int n3=x/15;
        int SumOf3=n1*(n1+1)/2*3;
        int Sumof5=n2*(n2+1)/2*5;
        int Sumof15=n3*(n3+1)/2*15;
        int Result=SumOf3+Sumof5-Sumof15;
        System.out.println(Result);
    }
}
