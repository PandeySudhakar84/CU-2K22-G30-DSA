package Lec40;

import java.util.Comparator;

public class EmpSalary implements Comparator<Employ> {
    @Override
    public int compare(Employ o1, Employ o2) {
        if(o1.EmpSaraly>o2.EmpSaraly){
            return 1;
        }
        else {
            return -1;
        }
    }
}
