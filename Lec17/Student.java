package Lec17;

public class Student extends Object{
      String name="Rahul";
     int age=25;
    public Student(String name,int age){
        this("shyam",24,2);
        this.name=name;
        this.age=age;
    }
    public Student(String name,int age,int id){
        System.out.println("my name is "+name+"age "+age+" id"+id);
    }
    public void Into_yourself(){
        System.out.println("my name is "+name+" and age "+age);
    }
    public void Location(){
        System.out.println("ch");
    }
    static {
        System.out.println("i m inside class");
    }
}
