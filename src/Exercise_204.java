import java.util.Scanner;
public class Exercise_204
{
   public static void main(String[] args)
   {
      //Create Scanner object
      Scanner keyboard = new Scanner(System.in);
      
      System.out.println("What is your name?");
      String name = keyboard.nextLine();
      
      System.out.println("What is your age?");
      int age = keyboard.nextInt();
      
      keyboard.nextLine();
      
      System.out.println("What is your address?");
      String address = keyboard.nextLine();
      
      System.out.println(name + "\n" + age + "\n" + address);
   }

}
