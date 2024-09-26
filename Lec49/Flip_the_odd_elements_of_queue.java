package Lec49;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Flip_the_odd_elements_of_queue {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        q.offer(5);
        q.offer(7);
        q.offer(6);
        q.offer(2);
        q.offer(9);
        q.offer(18);
        q.offer(11);
        q.offer(15);
        flipHalfQues(q);
        System.out.println(q);
    }
    public static void flipHalfQues(Queue<Integer> q){
        int size=q.size();
        Stack<Integer> sc=new Stack<>();
        for(int i=0;i<size;i++){
            int element=q.poll();
                if(i%2==1){
                    sc.push(element);
                }
                else{
                    q.offer(element);
                }
            }
        for(int i=0;i<size;i++){
            if(i%2==1){
                q.offer(sc.pop());
            }
        }
    }
}
