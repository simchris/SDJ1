package Exercise_1001;
import java.util.Scanner;

public class Numbers
{
   public static void main(String[] args)
   {
      int number, maxNumber;
      Scanner keyboard = new Scanner(System.in);
      
      System.out.println("Enter how high should I go:");
      maxNumber = keyboard.nextInt();
      System.out.println("Number     Number x 2     Number Squared");
      System.out.println("----------------------------------------");
      
      keyboard.close();
      
      for (number = 1; number <= maxNumber; number++)
      {
         System.out.println(number + "\t\t" + 
      number*2 + "\t\t" + number*number);
      }
   }
}
