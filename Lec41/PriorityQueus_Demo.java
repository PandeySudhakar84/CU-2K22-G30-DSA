package Lec41;

import java.util.Collections;
import java.util.PriorityQueue;
public class PriorityQueus_Demo {
    public static void main(String[] args) {
        //PriorityQueue<Integer> pq=new PriorityQueue<>();// min heap
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        pq.add(10);
        pq.add(1000);
        pq.add(100);
        pq.add(1);
        System.out.println(pq);
    }
}
