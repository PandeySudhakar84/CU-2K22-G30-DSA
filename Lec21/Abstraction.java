package Lec21;

public abstract class Abstraction {
    public abstract void Payment();
    public abstract void ShowDeta();
    public void ViewBallence(){
        System.out.println("we acam check your Ballence");
    }
    public Abstraction(){
        System.out.println(" i am inside Abstraction");
    }
}
