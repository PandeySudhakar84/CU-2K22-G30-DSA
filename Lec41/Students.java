package Lec41;

public class Students implements Comparable<Students>{
    String Name;
    int RollNo;
    int Marks;
    Students(String Name,int RollNo,int Marks){
        this.Name=Name;
        this.Marks=Marks;
        this.RollNo=RollNo;
    }
    @Override
    public String toString(){
       return this.Name+","+this.RollNo+","+","+this.Marks;
    }

    @Override
    public int compareTo(Students o) {
        if(this.Marks>o.Marks){
            return 1;
        }
        else {
            return -1;
        }
    }
}
