package Lec40;

import java.util.ArrayList;
import java.util.Collections;

public class Emp_Client {
    public static void main(String[] args) {
        ArrayList<Employ> emp=new ArrayList<>();
        emp.add(new Employ("Rahul",1,50000));
        emp.add(new Employ("Lakshay",2,60000));
        emp.add(new Employ("Pritam",3,65000));
        emp.add(new Employ("Aryan",4,600000));
        ArrayList<Employ> emp1=new ArrayList<>(emp);
        Collections.sort(emp1,new EmpNane());
        System.out.println(emp1);
        ArrayList<Employ> emp2=new ArrayList<>(emp);
       Collections.sort(emp,new EmpSalary());
        System.out.println(emp2);
        //System.out.println(emp);
    }
}
