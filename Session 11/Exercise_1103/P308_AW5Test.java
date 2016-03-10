package Exercise_1103;

public class P308_AW5Test
{
   public static void main(String[] args)
   {
      int numerator, denominator, quotient;
      double total = 0;
      
      for( numerator = 1, denominator = 30; numerator<=30 && denominator>=1; numerator++, denominator--)
      {
         quotient = numerator / denominator;
         total += quotient;
      }
      
      System.out.println("The total is: " + total);
   }
}
