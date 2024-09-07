package Lec35;

import java.util.Scanner;

public class Valid_email_address {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String gmail=sc.next();
         try {
             validEmail(gmail);
             System.out.println("Valid");
         }
         catch (Exception e){
             System.out.println(e.getMessage());
         }
    }
    public static void validEmail(String gmail) throws Exception{
        if(!gmail.contains("@") || !gmail.contains(".") || !gmail.matches(".*@.*..*")){
            throw new Exception("Invalid");
        }
    }
}
