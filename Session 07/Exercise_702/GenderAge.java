package Exercise_702;
import java.util.Scanner;

public class GenderAge
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      
      System.out.println("Please enter the gender: ");
      String gender = keyboard.nextLine();
      System.out.println("Please enter the age: ");
      int age = keyboard.nextInt();
      
      char letter = gender.charAt(0);
      
      if ((letter!='m' && letter!='f') || age<0){
         System.out.println("Error in typed values");
      }
      else if (letter=='m'){
         if(age<18){
            System.out.println("Boy");
         }
         else{
            System.out.println("Man");
         }
      }
      else{
         if(age<18){
            System.out.println("Girl");
         }
         else{
            System.out.println("Woman");
         }
      }
         
   }
}
