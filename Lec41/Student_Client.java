package Lec41;

import java.util.ArrayList;
import java.util.Collections;

public class Student_Client {
    public static void main(String[] args) {
        ArrayList<Students> ll=new ArrayList<>();
        ll.add(new Students("Rahul",1,60));
        ll.add(new Students("Sudhakar",2,50));
        ll.add(new Students("Shivam",3,70));
        ll.add(new Students("Mohan",4,40));
        Collections.sort(ll);
        System.out.println(ll);
    }
}
