package Lec35;

// synchncronization is the proess by which be control the accessability of multipal thread to a particular share resource
// probleam in which occure without synchronization
// data inconsistance
//thread interfarence
// advantage of synchronization
// no data inconsistance
// no thread interference
public class  BookTheaterSeat {
    int total_seat=10;
     void bookSeat(int seat){
       System.out.println(Thread.currentThread().getName());
       System.out.println(Thread.currentThread().getName());
       System.out.println(Thread.currentThread().getName());
       System.out.println(Thread.currentThread().getName());
          synchronized (this){
              if(total_seat>=seat){
                  System.out.println(seat+" seat book successfully");
                  total_seat=total_seat-seat;
                  System.out.println("left seat : "+total_seat);
              }
              else {
                  System.out.println("sorry you can not book seat");
              }
          }
       System.out.println(Thread.currentThread().getName());
       System.out.println(Thread.currentThread().getName());
       System.out.println(Thread.currentThread().getName());
       System.out.println(Thread.currentThread().getName());

    }
}
class BookMovieApp extends Thread{
  static BookTheaterSeat b;
    int seat;
    @Override
    public void run(){
       b.bookSeat(seat);
    }

    public static void main(String[] args) {
        b=new BookTheaterSeat();
        BookMovieApp sudhakar=new BookMovieApp();
        sudhakar.seat=6;
        sudhakar.start();
        BookMovieApp pritam=new BookMovieApp();
        pritam.seat=7;
        pritam.start();
    }
}
