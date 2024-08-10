package Lec17;

public class Student_Client {
    public static void main(String[] args) {
        System.out.println("main");
        Student s1=new Student("Mohan",25);
        s1.Into_yourself();
        s1.Into_yourself();
        Student s2=new Student("Ram",30);

        s2.Into_yourself();
        main();
        s1.Location();
        s2.Location();

    }
    public static void main(){
        System.out.println("i m inside main");
    }
    static {
        System.out.println("i m inside static");
    }
}