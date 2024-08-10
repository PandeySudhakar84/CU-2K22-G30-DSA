package Lec19;

public class Students {
    String name="Rahul";
    int age=23;
    public Students(String name,int age){
        this("Mohit",23,1);
       this.name=name;
       this.age=age;
        System.out.println(this.name);
    }
    Students(String name,int age,int stu_id){
        System.out.println("my name is "+name+" and age "+age+"stu id "+stu_id);
    }
    public void Intro_yourSelf(){
        System.out.println("my name is "+name+" and age "+age);
    }
}