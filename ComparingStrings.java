import java.util.Scanner;

public class ComparingStrings {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
   //1. Ask the user for the first string
  
      System.out.print("Please enter first string: ");
   
      
   //2. Read the first string
  
          
      Scanner keyboard = new Scanner(System.in);
      String s1 = input.nextLine();
   
      
   //3. Ask the user for the second string
   
      System.out.print("Please enter second string: ");
     
   
      
   //4. Read the second string
   
      String s2 = input.nextLine();
      
   //5. Does the first string start with a B? If so we say yes if not say no!
   
     
      System.out.println("Does the first string start with a B?");
      if(s1.startsWith("B"))
          System.out.println("yes");
      else
          System.out.println("no");
      
   //6. Determine whether the first and second are equivalent & Print to console
   
      if(s1.equalsIgnoreCase(s2))
          System.out.println("yes");
      else
          System.out.println("no");
      
      
   //7. Print out first name from 3rd index (4th letter) to the end of your first name
   
      System.out.println(s1.substring(3));
      
      
      
   //8. Find index of where the letter "a" is in your first name
  
      System.out.println("Here is the index of the letter a in my first name " + s1.indexOf('a'));
   
      
      
  }//end of main
  
}//end of class