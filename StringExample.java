import java.util.*;

public class StringExample {
  public static void main(String[] args)
  {
   
      Scanner keyboard = new Scanner(System.in);
      
    //1. Ask the user for their first name
        System.out.println("What is your name ");
      
    //2. Read input 
        String name = keyboard.nextLine();
      
        name.charAt(2);
     
    //3. Print out 3rd character in name
        System.out.println("The third letter in your name is: " + name.charAt(2));
      
  }//end of main
    
}//end of BMI class