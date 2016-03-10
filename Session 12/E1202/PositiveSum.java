package E1202;

import java.util.Scanner;

public class PositiveSum
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);

      int positiveSum = 0;
      int negativeSum = 0;

      System.out.println("Enter a number:");
      int x = scan.nextInt();

      while (x != 0)
      {
         if (x > 0)
            positiveSum += x;
         else
            negativeSum += x;
         System.out.println("Enter a number:");
         x = scan.nextInt();
      }

      scan.close();
      System.out.println();
      System.out.println("Total positive sum: " + positiveSum);
      System.out.println("Total negative sum: " + negativeSum);
   }
}