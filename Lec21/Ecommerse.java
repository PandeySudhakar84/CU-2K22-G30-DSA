package Lec21;
// M
public interface Ecommerse {
    public void Add();
    public void Remove();
    int a=20;
    // java 8
    static void Pay(){
        System.out.println("you can pay");
    }
    // java 9
    default void sell(){

    }
}
