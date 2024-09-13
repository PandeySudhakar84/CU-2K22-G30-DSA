package Lec39;
import java.util.*;
public class IterateVector {
    public static void main(String[] args) {
        Vector<Integer> sc=new Vector<>();
        sc.add(10);
        sc.add(20);
        sc.add(30);
        sc.add(40);
//       Iterator<Integer> s=sc.iterator();
//       while (s.hasNext()){
//           System.out.println(s.next());
//       }
//       ListIterator s5=sc.listIterator(sc.size());
//       while(s5.hasPrevious()){
//           System.out.println(s5.previous());
//       }
//        for(int e:sc){
//            System.out.println(e);
//        }

//        sc.forEach(e->{
//            System.out.println(e);
//        });
        Enumeration<Integer> s=sc.elements();
        while (s.hasMoreElements()){
            System.out.println(s.nextElement());
        }
    }
}
