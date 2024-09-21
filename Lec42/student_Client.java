package Lec42;

import java.util.ArrayList;
import java.util.Collections;

public class student_Client {
    public static void main(String[] args) {
        ArrayList<Student> ll=new ArrayList<>();
        ll.add(new Student("Sudhakar",194112,70));
        ll.add(new Student("Anuj sir",194118,90));
        ll.add(new Student("Lakshay",194110,80));
        ll.add(new Student("Shivam",194152,60));

        Collections.sort(ll);
        System.out.println(ll);
    }
}
