package Lec18;

public class Client {
    public static void main(String[] args) {
        MUltiplication sc=new MUltiplication();
        sc.Add();
        sc.Sub();
        sc.Mul();
//        Client sc=new Client();
//       sc.Add();
//       sc.Add(10,20);
//       sc.Add(10,20,30,40,650,43,452);
//    }
//    public void Add(){
//        int a=10;
//        int b=20;
//    }
//    public void Add(int a,int b){
//        int c=a+b;
//        System.out.println(c);
//    }
//    public void Add(int a,int ...ar){
//        int sum=0;
//        for(int i=0;i<ar.length;i++){
//            sum=sum+ar[i];
//        }
//        System.out.println(sum);
    }
}
class Addition{
    public void Add(){
        int a=10;
        int b=20;
        int c=a+b;
        System.out.println(a+b);
    }
}
class Substraction extends Addition{
    public void Sub(){
        int a=30;
        int b=40;
        System.out.println(b-a);
    }
}
class MUltiplication extends Substraction{
    public static void Mul(){
        int a=10;
        int b=20;
        int c=a*b;
        System.out.println(c);
    }
}
