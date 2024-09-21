package Lec42;

public class Student implements Comparable<Student>{
    String Name;
    int RollNo;
    int Marks;

    @Override
    public String toString() {
        return "Student{" +
                "Name='" + Name + '\'' +
                ", RollNo=" + RollNo +
                ", Marks=" + Marks +
                '}';
    }

    Student(String name, int RollNo, int Marks){
        this.Name=name;
        this.RollNo=RollNo;
        this.Marks=Marks;
    }

    @Override
    public int compareTo(Student that) {
        if(this.Marks>that.Marks){
            return 1;
        }
        else {
            return -1;
        }
    }
}
