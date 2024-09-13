package Lec41;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Comparable_Demo {
    public static void main(String[] args) {
        ArrayList<Integer> ll=new ArrayList<>();
        Comparator<Integer> com=new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                if(o1%10>o2%10){
                    return 1;
                }
                else {
                    return -1;
                }
          //  @Override
//            public int compare(Integer o1, Integer o2) {
//                if(o1%10>o2%10){
//                    return 1;
//                }
//                else {
//                    return -1;
//                }
            }
        };
        ll.add(65);
        ll.add(20);
        ll.add(56);
        ll.add(18);
        Collections.sort(ll,com);
        System.out.println(ll);
    }
}
