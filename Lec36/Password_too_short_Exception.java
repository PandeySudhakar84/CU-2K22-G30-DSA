package Lec36;

import java.util.Scanner;

public class Password_too_short_Exception {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String name=sc.nextLine();
        String password=sc.nextLine();
        try {
            validPassword(password);
            System.out.println("Correct");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    public static void validPassword(String password) throws Exception{
        if(password.length()<6){
            throw new Exception("Too short!");
        }
//        if(!password.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$")){
        if(!password.matches(".*\\d.*")){
            throw new Exception("No digit!");
        }
    }
}
