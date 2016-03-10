package Exercise_1103;

import java.util.Scanner;

public class P308_AW4
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);

      int count;
      double total = 0;

      for (count = 0; count < 10; count++)
      {
         System.out.println("Enter a number: ");
         double number = scan.nextDouble();

         total += number;
      }

      scan.close();
      System.out.println("The total is: " + total);
   }
}
