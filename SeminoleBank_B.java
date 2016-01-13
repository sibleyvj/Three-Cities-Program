import java.util.*;

public class SeminoleBank_B {
  public static void main(String[] args) {
    
    //Declarations and Initializations of variables 
      double deposit = 0;
      double withdrawal = 0;
      double balance = 5000.00;
      double currentBalance = balance + deposit - withdrawal;
     
      
      
      
      //Display welcome messages and Request and Read users’ account number  
      System.out.println("**************************************************");
      System.out.println("Welcome to Seminole Bank!");
      System.out.println("************************************************** \n");
      
      System.out.print("Please enter your five digit account number: ");
      
      Scanner keyboard = new Scanner(System.in);
      int account = keyboard.nextInt();
   
      
      char menuChoice = 'x';
      
    
      
      //Process menu until user enters X (Use a WHILE loop with an “if…else if” or a “switch”) 
     do{
         System.out.print("Enter D for deposit, W for withdrawal, B for balance or X to exit the menu: ");
      
      Scanner keyboard2 = new Scanner(System.in);
      String selection = keyboard2.nextLine().toLowerCase();
         menuChoice = selection.charAt(0);
         
         
         
          if (menuChoice == 'd')
          {
             
              System.out.println("Enter the amount of the deposit");
              deposit = keyboard2.nextDouble();
             balance +=deposit;
          }
          else if (menuChoice == 'w')
          {
              
              System.out.println("Enter the amount of the withdrawal: ");
              withdrawal = keyboard2.nextDouble();
              balance -= withdrawal;
             
          }
          else if (menuChoice == 'b')
          {
              System.out.printf("Account Number: " + account + " " + "has a current balance of: $%.2f", balance);
           
          }
          else
              System.out.println("ERROR: Please enter a D, W, B, or X: ");
     
      }while (menuChoice != 'x');
      
     System.out.println("Thank you for being a loyal Seminole Bank customer!");
      
      
      
      

       
      
      
      
  }//end of main
  
}//end of class