import java.util.Scanner;

public class OrderThreeCities {
  public static void main(String[] args) {
    
    Scanner keyboard = new Scanner(System.in);
      
   //1. prompts the user to enter the three cities and reads the input
  
      System.out.print("Please enter the first city: ");
      
       String s1 = keyboard.nextLine();
      
       System.out.print("Please enter the second city: ");
      
       String s2 = keyboard.nextLine();
      
       System.out.print("Please enter the third city: ");
      
       String s3 = keyboard.nextLine();
      
   //2. Statements that compare the three strings to determine the alphabetical order 
   
      if (s1.compareToIgnoreCase(s2) < 0 && s2.compareToIgnoreCase(s3) < 0)
          System.out.println("The three cities in alphabetical order are " + s1 + ", " + s2 + ", and " + s3); 
      else if (s2.compareToIgnoreCase(s1) < 0 && s1.compareToIgnoreCase(s3) < 0)
          System.out.println("The three cities in alphabetical order are " + s2 + ", " + s1 + ", and " + s3); 
      else if (s1.compareToIgnoreCase(s3) < 0 && s3.compareToIgnoreCase(s2) < 0)
          System.out.println("The three cities in alphabetical order are " + s1 + ", " + s3 + ", and " + s2); 
      else if (s2.compareToIgnoreCase(s3) < 0 && s3.compareToIgnoreCase(s1) < 0)
          System.out.println("The three cities in alphabetical order are " + s2 + ", " + s3 + ", and " + s1); 
      else if (s3.compareToIgnoreCase(s1) < 0 && s1.compareToIgnoreCase(s2) < 0)
          System.out.println("The three cities in alphabetical order are " + s3 + ", " + s1 + ", and " + s2); 
      else if (s3.compareToIgnoreCase(s2) < 0 && s2.compareToIgnoreCase(s1) < 0)
          System.out.println("The three cities in alphabetical order are " + s3 + ", " + s2 + ", and " + s1); 
          
      
      
  
      //*123 *132 *213 *231 *312 321
      
  }//end of main
  
}//end of class