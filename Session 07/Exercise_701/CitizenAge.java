package Exercise_701;
import java.util.Scanner;

public class CitizenAge
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      
      System.out.println("Please enter an age: ");
      int number = keyboard.nextInt();
      
      if (number < 0){
         System.out.println("Error in age value.");
      }
      else if (number >= 0 && number <=12){
         System.out.println("Child");
      }
      else if (number >= 13 && number <= 19){
         System.out.println("Teenager");
      }
      else if (number >= 20 && number <= 65){
         System.out.println("Adult");
      }
      else{
         System.out.println("Senior citizen");
      }
   }
}
