
import java.util.*;
public class ComputeArea1 {
  /** Main method */
  public static void main(String[] args) {
    double radius;
    double area;
    
    // Assign a radius
    //  radius = 40;
      
      Scanner input = new Scanner(System.in);
      
      //Ask user for radius
      System.out.println("Enter radius"); 
      
      
     double d = input.nextDouble();
      
      radius = d;   //sets radius equal to user input
      
   
    
    // Compute area
    area = d * d * 3.14159;
    
    // Display results
    System.out.println("The area for the circle of radius " +
      d + " is " + area);
  }
}