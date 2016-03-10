package Exercise_704;
import java.util.Scanner;

public class SortNumbersA
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      
      System.out.println("PLease enter a number:");
      double n1 = keyboard.nextDouble();
      System.out.println("PLease enter a second number:");
      double n2 = keyboard.nextDouble();
      
      if (n1==n2){
         System.out.println("Error in typed values.\nPlease enter two different numbers.");
      }
      else if (n1<n2){
         System.out.println("The smallest number is " + n1);
      }
      else {
         System.out.println("The smallest number is " + n2);
      }
   }
}
