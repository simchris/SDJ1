package Exercise_1103;
import java.util.Scanner;

public class P310_PC1Test
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      
      int number;
      int total = 0;
      
      do{
      System.out.println("Enter a nonzero integer: ");
      number = scan.nextInt();
      } while (number<=0);
      
      scan.close();
      
      for (int i=1; i<=number; i++)
      {
         total += i;
      }
      
      System.out.println("The sum of all integers between 1 and " + number + " is: " + total);
   }
}
