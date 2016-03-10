package Exercise_901;
import java.util.Random;
import java.util.Scanner;

public class RandomNumberTest
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      Random randomNumber = new Random();
      
      System.out.println("Guess a number between 1 and 10: ");
      int guess = keyboard.nextInt();
      int number = randomNumber.nextInt(11);
      
      keyboard.close();
      
      if (guess == number && number != 0)
         System.out.println("Correct!");
      else if (guess != number && guess < 11 && guess!=0)
         System.out.println("Wrong number. The number was " + number);
      else 
         System.out.println("Error! Enter a number between 1 and 10.");
    }
}
