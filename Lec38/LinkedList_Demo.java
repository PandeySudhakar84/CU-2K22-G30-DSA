package Lec38;

import java.util.LinkedList;
public class LinkedList_Demo {
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(3,50);
        ll.set(2,40);
        ll.contains(10);
        System.out.println(ll.isEmpty());
        System.out.println(ll.contains(30));
        System.out.println(ll.size());
        System.out.println(ll);
        System.out.println(ll.contains(10));
    }
}
