package Lec40;
public class Employ {
    String EmpName;
    int EmpId;
    int EmpSaraly;
    Employ(String EmpName,int EmpId,int EmpSaraly){
        this.EmpId=EmpId;
        this.EmpName=EmpName;
        this.EmpSaraly=EmpSaraly;
    }
    public String toString(){
        return this.EmpName+","+this.EmpId+","+this.EmpSaraly;
    }
}
