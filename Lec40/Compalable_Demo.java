package Lec40;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Compalable_Demo {
    public static void main(String[] args) {
        ArrayList<Integer> ll=new ArrayList<>();
        Comparator<Integer> com=new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1 %10>o2%10){
                    return 1;
                }
                else {
                    return -1;
                }
            }
        };
        ll.add(105);
        ll.add(20);
        ll.add(32);
        ll.add(46);
        Collections.sort(ll,com);
        System.out.println(ll);
    }
}
