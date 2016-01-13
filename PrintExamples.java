import java.util.Scanner;    // needed to use Scanner for input

public class PrintExamples {
   public static void main(String[] args) {
    //The Math.PI property represents the ratio of the circumference of a circle to its diameter, approximately 3.14159:
     
      System.out.println("*****Example using print******");
      System.out.print("PI using print is: " + Math.PI);
      System.out.print("PI is: " + Math.PI + "\n");
      System.out.print("PI is: " + Math.PI);
      System.out.print("\n\n\n");
       
      System.out.println("*****Example using println******"); 
      System.out.println("PI using println is: "+ Math.PI);
      System.out.println("PI using println is: "+ Math.PI);
      System.out.println();
      System.out.println();
       
      System.out.println("*****Example printf******");
      System.out.printf("PI is %.2f using printf with 2 digits after decimal:", Math.PI);       
      System.out.printf("\nPI is %.5f using printf with 5 digits after decimal: ", Math.PI);
      System.out.printf("\nPI is %7.3f using printf with 7 digits total and 3 digits after decimal (right-justified)", Math.PI);
      System.out.printf("\nPI is %10.4f using printf with 10 digits total and 4 digits after decimal (right-justified)", Math.PI);
      System.out.printf("\n");

   }
}