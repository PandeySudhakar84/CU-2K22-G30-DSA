package Lec19;

public class Students_client  {
    public static void main(String[] args) {
        Add(10,20);
        Add(10,20,30);
        Add(10,20,30,40,50,604,457,365);
        main();
//      Students sc= new Students();
//      sc.name="ram";
//      sc.age=25;
//        System.out.println(sc.age);
//        System.out.println(sc.name);
//        sc.Intro_yourSelf();
//        Students s2=new Students();
//        System.out.println(s2.name);
//        System.out.println(s2.age);
//        s2.name="skjh";
//        s2.age=23;
        Students s1=new Students("Ram",25);
        Students s2=new Students("Shyam",26);
        System.out.println(s1);
    }
    public static void Add(int a,int b){
        int c=a+b;
        System.out.println(c);
    }
    public static void Add(int a,int b,int c){
        int ans=a+b+c;
        System.out.println(ans);
    }
    public static void Add(int a,int ...arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
           sum=sum+arr[i];
        }
        System.out.println(sum);
    }
    // we can overload main method
    public static void main(){
        System.out.println("i am inside main");
    }
}
