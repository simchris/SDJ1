package Exercise_704;
import java.util.Scanner;

public class SortNumbersC
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      
      System.out.println("Please enter a number:");
      double n1 = keyboard.nextDouble();
      System.out.println("Please enter a second number:");
      double n2 = keyboard.nextDouble();
      System.out.println("Please enter a third number:");
      double n3 = keyboard.nextDouble();
      
      if (n1<n2 && n2<n3){
         System.out.println(n1 + " < " + n2 + " < " + n3);
      }
      else if (n1<n3 && n3<n2){
         System.out.println(n1 + " < " + n3 + " < " + n2);
      }
      else if (n2<n1 && n1<n3){
         System.out.println(n2 + " < " + n1 + " < " + n3);
      }
      else if (n2<n3 && n3<n1){
         System.out.println(n2 + " < " + n3 + " < " + n1);
      }
      else if (n3<n1 && n1<n2){
         System.out.println(n3 + " < " + n1 + " < " + n2);
      }
      else if (n3<n2 && n2<n1){
         System.out.println(n3 + " < " + n2 + " < " + n1);
      }
      else {
         System.out.println("Error in typed values.");
         System.out.println("Please enter three different numbers.");
      }
   }
}
