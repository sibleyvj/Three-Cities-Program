import java.util.Scanner;

public class BMI_Extended
{
  public static void main(String[] args)
  {
    
       

      
      
    //Declare Scanner object to Accept Keyboard Input

      Scanner keyboard = new Scanner(System.in);
      
      
    /******************************************************************************
    /                    Display Header for BMI Application (code below)
    /*****************************************************************************/

 System.out.println("**************************************************");
      
      
      System.out.println("Welcome to the adult BMI calculator");
 

 System.out.println("**************************************************");
      
      /******************************************************************************
    /                        User Interaction (code below)
    /      Ask and Read the user name, height(feet), height(inches), and weight
    /******************************************************************************/

    //Reading in user input from keyboard
    
     System.out.println("Please enter your name then press enter: ");
   
        String name = keyboard.nextLine();
      
     System.out.println("Please enter your height (feet) then press enter: ");
      
      int feet = keyboard.nextInt();
      
      
      System.out.println("Please enter your height (inches) then press enter: ");
      
       int inches = keyboard.nextInt();
      
      System.out.println("Please enter your weight (round) then press enter: ");
      
      int weight = keyboard.nextInt();
    /*******************************************************************************
    /                          Convert and Calculate BMI
    /******************************************************************************/

    int height = (feet * 12) + inches;
     
     
      
      double bmi = ((weight/ Math.pow(height, 2)) * 703); 
      
    
      
          
          
    /********************************************************************************
    /                   Display the Calculation AND Thank you message
    /********************************************************************************/
      

       System.out.println("**************************************************");
      
      System.out.println("For the information you entered: ");
          System.out.println(" ");
      
      
      //if statements that set bmi ranges equal to an int to be used for switch statement
          int x = 0;
      if (18.5 >bmi)
          x = 1;
      else if(25.0 > bmi && 18.5 <= bmi)
          x=3;
      else if(29.9>= bmi && 25.0 <= bmi)
          x=5;
      else
          x=7;    
          
          
      //initializing strings
      
      String y = " ";
      String z = " ";
      
      
      //Switch statement that corresponds to each bmi range with a classification and statement
      
      switch (x) {
      case 1: y =  "Underweight"; 
      case 2: z = "For your height, a normal weight range would be from  125 to 169 pounds.\n\n Talk with your healthcare provider to determine possible causes of underweight and if you need to gain weight.\n\n "; 
          break;
      case 3: y = "Normal";
      case 4: z = "For your height, a normal weight range would be from 125 to 169 pounds.\n\n Maintaining a healthy weight may reduce the risk of chronic diseases associated with overweight and obesity.\n\n For information about the importance of a healthy diet and physical activity in maintaining a healthy weight, visit Preventing Weight Gain."; 
          break;
      case 5: y = "Overweight"; 
      case 6: z = "For your height, a normal weight range would be from 125 to 169 pounds.\n\nPeople who are overweight or obese are at higher risk for chronic conditions such as high blood  pressure, diabetes, and high cholesterol.\n\nAnyone who is overweight should try to avoid gaining additional weight. Additionally, if you are overweight with other risk factors (such as high LDL cholesterol, low HDL cholesterol, or high blood pressure), you should try to lose weight. Even a small weight loss (just 10% of your current weight) may help lower the risk of disease. Talk with your healthcare provider to determine appropriate ways to lose weight.\n\nFor information about the importance of a healthy diet and physical activity in reaching a healthy weight, visit Healthy Weight."; 
          break;
      case 7: y = "Obese"; 
      case 8: z = "For your height, a normal weight range would be from 125 to 169 pounds.\n\nPeople who are overweight or obese are at higher risk for chronic conditions such as high blood pressure, diabetes, and high cholesterol.\n\nAnyone who is overweight should try to avoid gaining additional weight. Additionally, if you are overweight with other risk factors (such as high LDL cholesterol, low HDL cholesterol, or high blood pressure), you should try to lose weight. Even a small weight loss (just 10% of your current weight) may help lower the risk of disease. Talk with your healthcare provider to determine appropriate ways to lose weight.\n\nFor information about the importance of a healthy diet and physical activity in reaching a healthy weight, visit Healthy Weight."; 
          break;

      }
      
      //Print user information 
      System.out.printf(name + ", your BMI is %.1f", bmi);
      System.out.printf(" indicating your weight is in the " + y + " category for adults of your height\n\n" );
      
      System.out.println(" ");
      
      System.out.println(z);
       System.out.println("**************************************************");
      
       System.out.println("Thanks for using the Adult BMI calculator! For more information about the importance of a healthy diet and physical activity in reaching healthy weight, visit: \n\n\n http://www.cdc.gov/healthyweight/index.html");
      
      
      
  }//end of main
    
}//end of BMI class