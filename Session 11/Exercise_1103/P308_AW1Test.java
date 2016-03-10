package Exercise_1103;

import java.util.Scanner;

public class P308_AW1Test
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);

      double number, product;

      do
      {
         System.out.println("Enter a number: ");
         number = scan.nextDouble();

         product = number * 10;
         System.out.println(number + " * 10 = " + product);
         System.out.println();
      }
      while (product < 100);

      scan.close();
      System.out.println("End of program.");
   }
}
