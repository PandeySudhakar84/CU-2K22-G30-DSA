package Lec48;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
public class BufferReader {
    public static void main(String[] args) throws Exception{
//        BufferedReader sc=new BufferedReader(new InputStreamReader(System.in));
//        String name=sc.readLine();
//        int a=sc.read();
//        System.out.println(a);
//        System.out.println(name);
        int arr[]={50,20,30,40};

        Arrays.stream(arr).map(e->e*5);
        Arrays.stream(arr).filter(e->e%5==0);
        System.out.println( Arrays.stream(arr).min());
    }
}
