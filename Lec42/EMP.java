package Lec42;
public class EMP {
    String EmpName;

    @Override
    public String toString() {
        return "EMP{" +
                "EmpName='" + EmpName + '\'' +
                ", EmpId=" + EmpId +
                ", EmpSalary=" + EmpSalary +
                '}';
    }

    int EmpId;
    int EmpSalary;
    EMP(String  EmpName,int EmpId,int EmpSalary){
        this.EmpName=EmpName;
        this.EmpId=EmpId;
        this.EmpSalary=EmpSalary;
    }
}
