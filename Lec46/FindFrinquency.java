package Lec46;
import java.util.HashMap;
import java.util.Set;
public class FindFrinquency {
    public static void main(String[] args) {
        String s="hello";
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                int count=map.get(s.charAt(i));
                map.put(s.charAt(i),count+1);
            }
            else {
                map.put(s.charAt(i),1);
            }
        }
//        map.forEach((K,V)->{
//            System.out.println(K+"="+V);
//        });
         Set<Character> set=map.keySet();
        for(char s2:set){
            System.out.println(s2+" ="+map.get(s2));
        }
        System.out.println(map);
    }
}
