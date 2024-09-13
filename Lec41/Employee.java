package Lec41;

public class Employee {
    String EmpName;
    int EmpId;
    int EmpSalary;
    Employee(String EmpName, int EmpId, int EmpSalary){
        this.EmpName=EmpName;
        this.EmpId=EmpId;
        this.EmpSalary=EmpSalary;
    }

    @Override
    public String toString() {
        return
                "EmpName='" + EmpName + '\'' +
                ", EmpId=" + EmpId +
                ", EmpSalary=" + EmpSalary +
                '}';
    }


}
