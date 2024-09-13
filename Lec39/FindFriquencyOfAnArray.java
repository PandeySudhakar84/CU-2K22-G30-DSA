package Lec39;

import java.util.HashMap;
import java.util.Set;

public class FindFriquencyOfAnArray {
    public static void main(String[] args) {
        int arr[]={10,20,30,40,10,20,30,50};
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int ele:arr){
            if(map.containsKey(ele)){
                int count=map.get(ele);
                map.put(ele,count+1);
            }
            else {
                map.put(ele,1);
            }
        }
        Set<Integer>set=map.keySet();
        for(int el:set){
            System.out.println(el+"="+map.get(el));
        }
    }
}
