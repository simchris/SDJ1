package Exercise_402;
import java.util.Scanner;

public class LeapYearTest
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      
      MyDate d1 = new MyDate();
      
      System.out.println("Enter a start year: ");
      int minYear = scan.nextInt();
      
      System.out.println();
      
      System.out.println("Enter an end year: ");
      int maxYear = scan.nextInt();
      
      scan.close();
      
      int totalLeapYears = 0;
      
      for (int count=minYear; count<=maxYear; count++)
      {
         d1.setYear(count);
         if (d1.isLeapYear())
         {
            totalLeapYears += 1;
         }            
      }

      System.out.println("\nThe total leap years are: " + totalLeapYears);
   }
}
