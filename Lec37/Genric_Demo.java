package Lec37;
public class Genric_Demo {
    public static void main(String[] args) {
        String str[]={"Sudhakar","Prince","Shivam","Mohit"};
        Display(str);
        Integer arr[]={10,20,30,40,50};
        Display(arr);
    }
//    public static void Display(String  str[]){
//        for(int i=0;i<str.length;i++){
//            System.out.println(str[i]);
//        }
//    }
//    public static void Display(Integer str[]){
//        for(int i=0;i<str.length;i++){
//            System.out.println(str[i]);
//        }
//    }
    public static <T>void Display(T arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}