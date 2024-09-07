package Lec34;
//higher the value higher the the priority
// jvm provide the priority of eatch thread and accodingly these priority jvm allocate the process
// prority are represent in the form of integer value and its range between 1 to 10
// jvm provide 3 priprity number 1 5 and 10;
// 1 MIN_PRIORITY
// 5 NORM_PRIORITY
// 10 MAX_PRIORITY
// METHOD -SET PRIORITY AND GET PRIORITY
// PRIORITY DEPENDS ON THE PLATEFORM
// AND WINDOWS DOES NOT SUPPORT THE PRIORITY
public class Priority_Thread_Method {
    public static void main(String[] args) {
        Thread.currentThread().setPriority(Thread.NORM_PRIORITY);
        System.out.println("Parent Thread:-"+Thread.currentThread().getPriority());
        Test4 t3=new Test4();
        t3.start();
    }
}
class Test4 extends Thread{
    @Override
    public void run(){
        Thread.currentThread().setPriority(10);
        Test5 t4=new Test5();
        t4.setPriority(MAX_PRIORITY);
        t4.start();
        System.out.println("child thread:-"+Thread.currentThread().getPriority());
    }
}
class Test5 extends Thread{
    @Override
    public void run(){
        System.out.println("child2:-"+Thread.currentThread().getPriority());
    }
}
