package Lec31;

import java.util.ArrayList;

public class ArrayList_Demo {
    public static void main(String[] args) {
        ArrayList <Integer> sc=new ArrayList<>();
        sc.add(10);
        sc.add(20);
        sc.add(10);
        sc.add(20);
        System.out.println(sc.size());
        System.out.println(sc.getFirst());
        System.out.println(sc.get(2));
        System.out.println(sc.contains(100));
        System.out.println(sc.remove(2));
        System.out.println(sc);
        System.out.println(sc.size());
        System.out.println(sc.isEmpty());

        for(int ele:sc){
            System.out.println(ele);
        }
    }
}
