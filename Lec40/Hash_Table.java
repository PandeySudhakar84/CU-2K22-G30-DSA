package Lec40;

import java.util.Hashtable;

public class Hash_Table {
    public static void main(String[] args) {
        Hashtable<String,Integer> table=new Hashtable<>();
        table.put("Rahul",10);
        table.put("Mohan",20);
        table.put("Sohan",100);
        table.put("Rohan",200);
        table.put("Shiv",104);
        table.put("Prakash",205);
       // table.put(null,12);   //Exception in thread "main" java.lang.NullPointerException: Cannot invoke "Object.hashCode()" because "key" is null
        System.out.println(table.get("Prakash"));
        table.forEach((K,V)->{
            System.out.println(K+"= "+V);
        });
        System.out.println(table);
    }
}
