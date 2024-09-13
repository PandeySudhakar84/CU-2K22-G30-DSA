package Lec39;

import java.util.Stack;
public class Stack_Demo {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        System.out.println(stack.isEmpty());
        System.out.println(stack.contains(30));
        System.out.println(stack.pop());
        for(int e:stack){
            System.out.println(e);
        }
    }
}
