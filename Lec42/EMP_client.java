package Lec42;

import java.util.ArrayList;
import java.util.Collections;

public class EMP_client {
    public static void main(String[] args) {
        ArrayList<EMP> ll=new ArrayList<>();
        ll.add(new EMP("Shivam",20,50000));
        ll.add(new EMP("Lakshay",34,60000));
        ll.add(new EMP("Pritam",25,70000));
        ll.add(new EMP("Aryan",38,80000));
        ArrayList<EMP> emp2=new ArrayList<>(ll);
        Collections.sort(emp2,new EmpSalary());
       // System.out.println(emp2);
        for(EMP s:emp2){
            System.out.println(s);
        }
    }
}
