package Lec40;

import java.util.ArrayList;
import java.util.Collections;

public class Students_Client {
    public static void main(String[] args) {
        ArrayList<Students> ll=new ArrayList<>();
        ll.add(new Students("Rahul",60,19));
        ll.add(new Students("Shiv",50,110));
        ll.add(new Students("Sudhakar",40,121));
        ll.add(new Students("Rahul",60,190));
        Collections.sort(ll);
        for(Students s:ll){
            System.out.println(s);
        }
       // System.out.println(ll);

    }
}
