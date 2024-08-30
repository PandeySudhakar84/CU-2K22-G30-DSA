package Lec30;

public class Add_Binary {
    public static void main(String[] args) {
        String a="11";
        String b="1";
        System.out.println(addBinary(a,b));
    }
        public static String addBinary(String a, String b) {
            int i=a.length()-1;
            int j=b.length()-1;
            int carry=0;
            String ans="";
            while(i>=0 || j>=0 || carry==1){
                if(i>=0){
                    // a='11'
                    carry=carry+a.charAt(i)-'0';
                    i--;
                }
                if(j>=0){
                    carry=carry+b.charAt(j)-'0';
                    j--;
                }
                ans=ans+carry%2;
                carry=carry/2;
            }
            StringBuffer sc=new StringBuffer(ans);
            return sc.reverse().toString();
            // String rev="";
            // for(int k=ans.length()-1;k>=0;k--){
            //     rev=rev+ans.charAt(k);
            // }
            // return rev;
    }
}
