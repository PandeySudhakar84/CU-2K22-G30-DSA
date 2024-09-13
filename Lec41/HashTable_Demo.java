package Lec41;

import java.util.Hashtable;
import java.util.TreeMap;
public class HashTable_Demo {
    public static void main(String[] args) {
        Hashtable<String,Integer> map=new Hashtable<>();
        map.put("Ram",10);
        map.put("Mohan",20);
        map.put("Sohan",30);
        map.put("Rohan",40);
        System.out.println(map);
       map.forEach((K,V)->{
           System.out.println(K+" "+V);
       });
    }
}
