package Exercise_704;
import java.util.Scanner;

public class SortNumbersB
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      
      System.out.println("Please enter a number:");
      double n1 = keyboard.nextDouble();
      System.out.println("Please enter a second number:");
      double n2 = keyboard.nextDouble();
      
      if (n1==n2){
         System.out.println(n1 + " = " + n2);
      }
      else if (n1<n2){
         System.out.println(n1 + " < " + n2);
      }
      else {
         System.out.println(n2 + " < " + +n1);
      }
   }
}
