package Lec41;

import java.util.Comparator;

public class SalaryBase implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        if(o1.EmpSalary>o2.EmpSalary){
            return 1;
        }
        else {
            return -1;
        }
    }
}
