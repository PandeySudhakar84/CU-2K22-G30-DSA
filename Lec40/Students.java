package Lec40;
public class Students implements Comparable<Students>{
    String Name;
    int marks;
    @Override
    public String toString() {
        return "Students{" +
                "Name='" + Name + '\'' +
                ", marks=" + marks +
                ", rollno=" + rollno +
                '}';
    }

    int rollno;
    Students(String Name,int marks,int rollno){
        this.Name=Name;
        this.marks=marks;
        this.rollno=rollno;
    }

    @Override
    public int compareTo(Students o) {
        if(this.rollno>o.rollno){
            return 1;
        }
        else {
            return -1;
        }
    }
}
