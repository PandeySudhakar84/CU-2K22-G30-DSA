package Lec47;
import java.io.File;
public class CreateFile {
    public static void main(String[] args) {
        File file=new File("C:\\Users\\123\\Desktop\\Test.txt");
        try {
            if(file.createNewFile()){
                System.out.println("yes");
            }
            else {
                System.out.println("not");
            }

        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
