package Lec47;

import java.io.File;

public class FileInfo {
    public static void main(String[] args) {
        File file=new File("C:\\Users\\123\\Desktop\\Test.txt");
        if(file.exists()){
            System.out.println(file.getAbsoluteFile());
            System.out.println(file.canRead());
            System.out.println(file.canRead());
            System.out.println(file.getName());
        }
        else {
            System.out.println("not");
        }
    }
}
