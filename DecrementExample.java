import java.util.Scanner;    // needed to use Scanner for input

public class DecrementExample {
   public static void main(String[] args) {
      
        int apple = 6;
        int ball = apple--;
       
        System.out.println(apple);
        System.out.println(ball);
       
        apple = 6;
        ball = --apple;
        
        System.out.println(apple);
        System.out.println(ball);      
       
   }
}