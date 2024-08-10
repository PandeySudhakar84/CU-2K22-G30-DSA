package Lec21;

public class Abstraction_Child extends Abstraction {
    @Override
    public void Payment() {
        System.out.println("we can pay");
    }

    @Override
    public void ShowDeta() {
        System.out.println("we can show your Data");
    }
    Abstraction_Child(){
        super.ViewBallence();
        System.out.println("i am inside child");
    }
}
