import java.util.Scanner;

public class Program1
{
  public static void main(String[] args)
  {
   
        
    //Declare Scanner object to Accept Keyboard Input

      Scanner keyboard = new Scanner(System.in);
      
      
      
      System.out.println("Please enter the month you were born in");
      
      int month = keyboard.nextInt();
      
      String month1 = "October";
      
      switch (month) {
      case 1: month1 =  "January"; 
          break;
      case 2: month1 = "February"; 
          break;
      case 3: month1 = "March";
          break;
      case 4: month1 = "April"; 
          break;
      case 5: month1 = "May"; 
          break;
      case 6: month1 = "June"; 
          break;
      case 7: month1 = "July"; 
          break;
      case 8: month1 = "August";
          break;
      case 9: month1 = "September"; 
          break;
      case 10: month1 = "October"; 
          break;
      case 11: month1 = "November";
          break;
      case 12: month1 = "December"; 
          break;
    }
      
      System.out.println("Please enter the day you were born");
      
       int day = keyboard.nextInt();
      
      System.out.println("Please enter the year you were born");
      
       int year = keyboard.nextInt();
      
      System.out.println("Thank you!");
      
       System.out.println("You have the following birthday: " + month1 + " " + day + ", " + year);
 

 System.out.println("**************************************************");
     
      
  }//end of main
    
}//end of BMI class