package Lec40;

import java.util.Comparator;

public class EmpNane implements Comparator<Employ> {
    @Override
    public int compare(Employ o1, Employ o2) {
        return o1.EmpName.compareTo(o2.EmpName);
    }
}
