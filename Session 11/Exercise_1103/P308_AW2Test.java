package Exercise_1103;

import java.util.Scanner;

public class P308_AW2Test
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      
      char letter;
      do{
         System.out.println("Enter a number:");
         double n1 = scan.nextDouble();
         System.out.println("Enter a second number:");
         double n2 = scan.nextDouble();  
         
         double sum = n1 + n2;
         
         System.out.println("The sum is: " + sum);
         System.out.println();
         
         scan.nextLine();
         
         System.out.println("Press any key to run the program again \nor " 
               + "'n' to quit.");
         String answer = scan.nextLine();
         letter = answer.charAt(0);
      } while (letter != 'n');
      
      scan.close();
      System.out.println("\nProgram ended.");
   }
}
