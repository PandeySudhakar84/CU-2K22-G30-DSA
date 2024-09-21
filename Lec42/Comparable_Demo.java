package Lec42;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class Comparable_Demo {
    public static void main(String[] args) {
        //List<Integer> ll=new ArrayList<>();
        ArrayList<Integer> ll=new ArrayList<>();
        Comparator<Integer> com=new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1%10>o2%10){
                    return 1;
                }
                else {
                    return -1;
                }

            }
        };
        ll.add(53);
        ll.add(71);
        ll.add(22);
        ll.add(95);
        Collections.sort(ll,com);
        System.out.println(ll);
    }
}
