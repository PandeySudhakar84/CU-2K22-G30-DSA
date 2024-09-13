package Lec39;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set_Demo {
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(30);
        set.forEach(e->{
            System.out.println(e);
        });
        System.out.println(set);
        System.out.println(set.contains(40));
        System.out.println(set.isEmpty());
        for(int e:set){
            System.out.println(e);
        }
        System.out.println("------------------------------");
        LinkedHashSet<String > set1=new LinkedHashSet<>();
        set1.add("Rahul");
        set1.add("Tushar");
        set1.add("shivam");
        set1.add("Prince");
        set1.add(null);
        System.out.println(set1);
        System.out.println("--------------");
        TreeSet<Integer> set2=new TreeSet<>();
        set2.add(100);
        set2.add(50);
        set2.add(15);
        set2.add(23);
        set2.add(1);
        System.out.println(set2);

    }
}
