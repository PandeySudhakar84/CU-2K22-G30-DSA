package Lec47;

import java.io.FileWriter;

public class WriteFile {
    public static void main(String[] args) {
        try {
            FileWriter file=new FileWriter("C:\\Users\\123\\Desktop\\Test.txt");
            file.write("hii this is sudhakar");
            file.close();
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
