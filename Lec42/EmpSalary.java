package Lec42;

import java.util.Comparator;

public class EmpSalary implements Comparator<EMP> {
    @Override
    public int compare(EMP o1, EMP o2) {
       if(o1.EmpSalary>o2.EmpSalary){
           return 1;
       }
       else {
           return -1;
       }
    };
}
