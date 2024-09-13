package Lec38;

import java.util.HashSet;
import java.util.LinkedHashSet;
public class Set_Demo {
    public static void main(String[] args) {
        //LinkedHashSet<Integer> set=new LinkedHashSet<>();
        HashSet<Integer> set=new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);
        set.add(40);
        System.out.println(set.isEmpty());
        System.out.println(set.contains(60));
        System.out.println(set.remove(30));
        System.out.println(set.size());
        set.remove(30);
        System.out.println(set);
        for(int s:set){
            System.out.println(s);
        }
    }
}
