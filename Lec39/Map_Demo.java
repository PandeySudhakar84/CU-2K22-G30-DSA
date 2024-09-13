package Lec39;

import java.util.*;

public class Map_Demo {
    public static void main(String[] args) {
       // HashMap<String,Integer> map=new HashMap<>();
       // LinkedHashMap<String,Integer> map=new LinkedHashMap<>();
        TreeMap<String,Integer> map=new TreeMap<>();
        map.put("Rahul",1);
        map.put("Shivam",2);
        map.put("Tushar",3);
        map.put("P",4);
        System.out.println(map);
        System.out.println(map.get("Tushar"));
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println(map.containsKey("Shivam"));
        System.out.println(map);
        Set<String > set=map.keySet();
//        for(String str:set){
//            System.out.println(str+"="+map.get(str));
//        }
        map.forEach((K,V)->{
            System.out.println(K+"="+V);
        });
    }
}
