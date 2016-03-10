package Exercise_703;
import java.util.Scanner;

public class DanishGrades
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      
      System.out.println("Please enter the grade:");
      int grade = keyboard.nextInt();
      
      if (grade==12){
         System.out.println("The international grade is A.");
      }
      else if (grade==10){
         System.out.println("The international grade is B.");
      }
      else if (grade==7){
         System.out.println("The international grade is C.");
      }
      else if (grade==4){
         System.out.println("The international grade is D.");
      }
      else if (grade==2){
         System.out.println("The international grade is E.");
      }
      else if (grade==0){
         System.out.println("The international grade is Fx.");
      }
      else if (grade==-3){
         System.out.println("The international grade is F.");
      }
      else{
         System.out.println("Error in typed value.");
         System.out.println("Please enter a grade in the Danish 7-scale.");
      }
   }
}
