import java.util.Scanner;

public class StudentMajors {
  public static void main(String[] args) {
    
    
   //1. prompts the user to enter two characters and displays their major and the classification
  
      System.out.println("Please enter two characters that display your major and classification: ");
      
   //2. Read user input 
  
      Scanner keyboard = new Scanner(System.in);
      
      String input = keyboard.nextLine().toUpperCase();
      
      
  //3. Make variables for each character  
      char major = input.charAt(0);
      
      char classification = input.charAt(1);
      
   //4. use if else statements to specify major and classification
   
      if (major == 'I')
          System.out.println("Information Technology");
      else if (major == 'C')
          System.out.println("Computer Science");
      else if (major == 'M')
          System.out.println("Mathematics");
      else if (major == 'P')
          System.out.println("Physics");
      else if (major == 'B')
          System.out.println("Biology");
      else if (major == 'E')
          System.out.println("Engineering");
      else if (major == 'H')
          System.out.println("History");
      else if (major == 'J')
          System.out.println("Journalism");
      else if (major == 'A')
          System.out.println("Art and Design");
      else if (major == 'L')
          System.out.println("Literature");
      else if (major == 'S')
          System.out.println("Sports Medicine");
            else
                System.out.println("Invalid major code");
      
      if (classification == '1')
          System.out.println("Freshman");
      else if (classification == '2')
          System.out.println("Sophomore");
      else if (classification == '3')
          System.out.println("Junior");
      else if (classification == '4')
          System.out.println("Senior");
      else
          System.out.println("Invalid classification code");

       
      
      
  }//end of main
  
}//end of class