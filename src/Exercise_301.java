import java.util.Scanner;

public class Exercise_301
{
   public static void main(String[] args)
   {
      double average;
      
      Scanner keyboard = new Scanner(System.in);
      
      System.out.println("Enter the three test scores: ");
      double score1 = keyboard.nextDouble();
      double score2 = keyboard.nextDouble();
      double score3 = keyboard.nextDouble();

      average = (score1 + score2 + score3) / 3;
      
      System.out.println("The test scores are:\n" + score1 + "\n"
                           + score2 + "\n" + score3);
      System.out.println("The average of the scores is: " +average);
      
   }

}
