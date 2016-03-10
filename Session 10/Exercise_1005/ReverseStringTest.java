package Exercise_1005;
import java.util.Scanner;

public class ReverseStringTest
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      
      System.out.println("Please write a word or a phrase and I'll reverse it:");
      String word = scan.nextLine();
     
      scan.close();
      int length = word.length();
      
      String reverse = "";
      
      for (int i=length-1; i>=0; i--)
      {
         reverse = reverse + word.charAt(i);
      }
      
      System.out.println("" + reverse);
   }
}
