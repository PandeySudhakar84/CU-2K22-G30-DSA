package Lec41;

import java.util.ArrayList;
import java.util.Collections;

public class Emp_Client {
    public static void main(String[] args) {
        ArrayList<Employee> Emp=new ArrayList<>();
        Emp.add(new Employee("Tushar",1,50000));
        Emp.add(new Employee("Shivam",2,70000));
        Emp.add(new Employee("Prakash",4,60000));
        Emp.add(new Employee("Kunal",5,40000));
        ArrayList<Employee> emp=new ArrayList<>(Emp);
        Collections.sort(emp,new NameBase());
        ArrayList<Employee> emp2=new ArrayList<>(Emp);
        Collections.sort(emp2,new SalaryBase());
        System.out.println(emp2);
        System.out.println("----------------------");
        for(Employee s:emp2){
            System.out.println(s);
        }
       // System.out.println(emp);
    }
}
