package Lec45;
import Coding_Test.ReverseGreet;
import java.util.Scanner;
public class ReverseGreat extends Thread{
    private int n;
    ReverseGreat(int n){
        this.n=n;
    }
    @Override
    public void run(){
        System.out.println("CodeQutient"+n);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Thread threads[]=new Thread[n];
        for(int i=0;i<n;i++){
            threads[i]=new ReverseGreet(i+1);
        }
        for(int i=n-1;i>=0;i--) {
            try {
                threads[i].start();
                threads[i].join();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
