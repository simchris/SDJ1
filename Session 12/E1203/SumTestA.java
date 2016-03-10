package E1203;

import java.util.Scanner;

public class SumTestA
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);

      int sum = 0, count = 0, number;

      do
      {
         System.out.println("Enter an integer number: ");
         number = scan.nextInt();
         sum += number;
         count++;
      }
      while (sum < 20 && count < 10);

      scan.close();

      if (sum < 20)
      {
         System.out.println("Count was: " + count);
         System.out.println("Sum is: " + sum);
      }
      else
         System.out.println("Sum is: " + sum);
   }
}
