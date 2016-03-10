package Exercise_1006;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberTest
{
   public static void main(String[] args)
   {
      int guess;
      Random rand = new Random();

      Scanner scan = new Scanner(System.in);

      int answer = rand.nextInt(1000);
      int attempts = 1;

      do
      {
         System.out.println("Enter your guess: ");
         guess = scan.nextInt();
         if (guess < answer)
         {
            System.out.println("Wrond guess. Too low. Try again. ");
            attempts += 1;
         }
         else if (guess > answer)
         {
            System.out.println("Wrond guess. Too high. Try again: ");
            attempts += 1;
         }
      }
      while (guess != answer);

      scan.close();

      System.out.println("Correct!" + "\nYou found the number with " + attempts
            + " attempts!");
   }
}
