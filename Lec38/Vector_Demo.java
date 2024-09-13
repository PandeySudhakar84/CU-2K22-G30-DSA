package Lec38;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;
import java.util.function.Consumer;

public class Vector_Demo {
    public static void main(String[] args) {
        Vector sc=new Vector();
        sc.add(10);
        sc.add(20);
        sc.add(10);
        sc.add(20);
        sc.add(10);
        sc.add(20);
        sc.add(10);
        sc.add(20);
        Enumeration<Integer> sc1=sc.elements();
        while(sc1.hasMoreElements()){
            System.out.println(sc1.nextElement());
        }
        System.out.println(sc);
        ArrayList<Integer> ll=new ArrayList<>();
        ll.add(10);
        ll.add(20);
        ll.add(10);
        System.out.println(sc.isEmpty());
        System.out.println(sc.get(1));
        sc.remove(2);
        System.out.println(sc);
       // sc.remove(20);
//        for(int a:ll){
//            System.out.println(a);
//        }
//        Iterator <Integer> s=sc.iterator();
//        while (s.hasNext()){
//            Integer s1=s.next();
//            System.out.println(s1);
//        }
        ll.forEach(e->{
            System.out.println(e);
        });

    }
}
