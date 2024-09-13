package Lec40;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueue_Demo {
    public static void main(String[] args) {
//        PriorityQueue<Integer> pq=new PriorityQueue<>();
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        pq.add(100);
        pq.add(10);
        pq.add(150);
        pq.add(1);
        pq.add(15);
        System.out.println(pq);
    }
}
