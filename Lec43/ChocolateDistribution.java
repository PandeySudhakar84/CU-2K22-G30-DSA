package Lec43;
import java.util.ArrayList;
import java.util.Collections;
public class ChocolateDistribution {
    public static void main(String[] args) {
        ArrayList<Integer> ll=new ArrayList<>();
        int m=5;
        int n=8;
        ll.add(3);
        ll.add(4);
        ll.add(1);
        ll.add(9);
        ll.add(56);
        ll.add(7);
        ll.add(9);
        ll.add(12);
        Collections.sort(ll);
        int mindiff=Integer.MAX_VALUE;
        int low=0;
        int high=m-1;
        while (high<n){
            int  diff=ll.get(high)-ll.get(low);
            mindiff=Math.min(mindiff,diff);
            low++;
            high++;
        }
        System.out.println(mindiff);
    }
}
