package Lec47;

import java.io.FileReader;

public class ReadData {
    public static void main(String[] args) {
        try {
            FileReader r=new FileReader("C:\\Users\\123\\Desktop\\Test.txt");
            int i;
            while((i=r.read())!=-1){
                System.out.print((char) i);
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
