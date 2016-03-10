package Exercise_504;
import java.util.Scanner;

public class DemoTestScores
{
   public static void main(String[] args)
   {  
      double n1, n2 , n3;
      Scanner keyboard = new Scanner(System.in);
      
      System.out.println("Enter the first test score: ");
      n1 = keyboard.nextDouble();
      System.out.println("Enter the second test score: ");
      n2 = keyboard.nextDouble();
      System.out.println("Enter the third test score: ");
      n3 = keyboard.nextDouble();
      
      //create TestScores object
      TestScores test = new TestScores(n1, n2, n3);
      
      System.out.println("The average of the three test scores is: " + test.getAverage());
   }
}
