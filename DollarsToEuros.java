import java.util.*;
public class DollarsToEuros {
  /** Main method */
  public static void main(String[] args) {
      
      
      // Declare variables
      double dollars;
      double euros;
      double eurosPerDollar;
    
      // ask users how many dollars they want to convert
      System.out.println("How many dollars do you want to convert?");
      
      // read the dollar amount from the user
      Scanner keyboard = new Scanner (System.in);
      dollars = keyboard.nextDouble();
      
      // ask user for the exchange rate
      System.out.println("What is the euros-per-dollar exchange rate?");
      
          eurosPerDollar = keyboard.nextDouble();
      
      // compute the number of euros
      euros = dollars * eurosPerDollar;
      
      // display the dollar and euro values
      System.out.println(dollars + " dollars is converted to " + euros + " euros");
      
  }
}