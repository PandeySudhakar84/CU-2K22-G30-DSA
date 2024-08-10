package Lec20;

public class Ecommerce_Demo implements Ecommerce {

    @Override
    public void Add() {
        System.out.println("we can Add");
    }

    @Override
    public void Remove() {
        System.out.println("we can Remove");
    }
    Ecommerce_Demo(){
        System.out.println("i m inside Ecommerce Demo");
    }
}
