package Lec29;

import java.util.StringTokenizer;
public class Tokanizer_Demo {
    public static void main(String[] args) {
//        StringTokenizer sc=new StringTokenizer("hello");
//        System.out.println(sc.nextToken());
//        StringTokenizer sc=new StringTokenizer("my,name is sudhakar"," ");
//       while(sc.hasMoreTokens()){
//           System.out.println(sc.nextToken());
  //     }
        String s="my,name,is,sudhakar";
        StringTokenizer sc=new StringTokenizer(s,",",true);
        while (sc.hasMoreTokens()){
            System.out.println(sc.nextToken());
        }
    }
}
