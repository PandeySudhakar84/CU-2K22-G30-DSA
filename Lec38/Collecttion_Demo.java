package Lec38;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Vector;
// The Collection in Java is a framework that provides an architecture to store and manipulate
// the group of objects.
// Java Collections can achieve all the operations that you perform on a data such as searching,
// sorting, insertion, manipulation, and deletion
// ACollection represents a single unit of objects, i.e., a group
// what is framework-> Itprovides readymade architecture.
// o Itrepresents a set of classes and interfaces.
// o It is optional
//The Collection framework represents a unified architecture for storing and manipulating a
// group of objects. It has:
// 1. Interfaces and its implementations, i.e., classes
// 2. Algorithm

public class Collecttion_Demo {
    public static void main(String[] args) {
      // Collection col=new ArrayList();
        ArrayList col=new ArrayList<>();
        col.add(10);
        col.add(20);
        col.add(30);
        col.add(40);
        col.add("sudhakar");
        col.add(10.34);
        col.add(true);
        col.add(2,"ram");
        col.set(2,"Mohan");
        System.out.println(col.size());
        //col.add(10,"sudhar");
        col.add(5,"shyam");
        System.out.println(col);
        System.out.println(col.contains("ram"));
        System.out.println(col.get(2));
        System.out.println(col);
        col.add(2,"ram");
        Vector sc=new Vector();
        sc.addAll(col);
        System.out.println(sc);
        System.out.println(sc.isEmpty());
    }
}
