package Lec38;
import java.util.Stack;
public class Stack_Demo {
    public static void main(String[] args) {
        Stack <Integer> sc=new Stack<>();
        sc.add(10);
        sc.add(20);
        sc.add(10);
        sc.add(50);
        sc.push(30);
        sc.pop();
        System.out.println(sc.get(1));
        System.out.println(sc.peek());
        System.out.println(sc);
        for(int s:sc){
            System.out.println(s);
        }

    }
}
