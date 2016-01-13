import java.util.*;

class Account {
    
    //Declare private variables
    private int accountNum;
    private double balance;

    //Default Constructor method used to creat new accounts.
    //If default constructor used, the account's starting balance is $5000.00.
    public Account() {
        balance = 5000;  
    }//end of default constructor

    //Custom Constructor method used to creat new accounts.
    //If the custom constructor is used, the account number and balance must be specified!!
    public Account(int newAccountNum, double newBalance) {
        accountNum = newAccountNum;
        balance = newBalance;
    }//end of custom constructor
    
    /*******************COMPLETE THE FOLLOWING:*********************
      Instructions:
      1.)  Complete the following 'Helper' methods.
      2.)  Add comments to describe each method!!
    /**************************************************************/

        public void setAccountNum(int newAccountNum) {
      
        }//end of setAccountNum
    

        public void setBalance(double newBalance) {
    
        }//end of setBalance
    
    
        public void withdraw(double amount) {
      
        }//end of withdraw
    

        public void deposit(double amount) {
     
        }//end of deposit   
    
       
        public int getAccountNum() {
      
        }//end of getAccountNum
    

        public double getBalance() {
      
        }//end of getBalance
    
    
        /**************************************************************/

    
        //The displayMenu() 'helper' method asks the user for the menu choice and returns it to the main() method.
        public static char displayMenu(){      
                System.out.println("\n\n\nAccount Holder #1, what type of transaction would you like to make? "); 
                System.out.print("\n     [Enter D for deposit, W for withdrawal, X to exit the menu]  ");
             
                Scanner input = new Scanner(System.in);             
                String choice = input.nextLine();
             
                char menuChoice = choice.charAt(0);
                menuChoice = Character.toUpperCase(menuChoice); 
             
                return menuChoice;
        }//end of displayMenu  

}//END OF Account class