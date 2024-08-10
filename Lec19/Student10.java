package Lec19;

public class Student10 {
    private String name="rahul";
   private int age;
    public void Intro_yourself(){
        System.out.println("my name is "+name+" and age "+age);
    }

    public int getAge() {
        return age;
    }

//    public void setAge(int age) throws Exception {
//        if(age<0){
//            throw new Exception("bhai age -ve nhi hota h");
//        }
//        this.age = age;
//    }
public void setAge(int age){
      try {
          if(age<0){
              throw new Exception("bhai age -ve nhi hota h");
          }
          this.age = age;
      }
      catch (Exception e){
          System.out.println(e);
          e.printStackTrace();
      }
      finally {
          {
              System.out.println("i m inside finnly");
          }
      }
    }
}
