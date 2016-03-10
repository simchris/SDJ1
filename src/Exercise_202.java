import java.util.Scanner;
public class Exercise_202
{
   public static void main(String[] args)
   {
      int x, y, z, sum, product;
      
      //Create the Scanner object
      Scanner keyboard = new Scanner(System.in);
      
      //Input and read 3 integers
      System.out.println("Give the first integer:");
      x = keyboard.nextInt();
      
      System.out.println("Give the second integer:");
      y = keyboard.nextInt();
      
      System.out.println("Give the third integer:");
      z = keyboard.nextInt();
      
      //Do the math operations
      sum = x + y + z;
      product = x* y * z;
      
      //Print the output
      System.out.println("The sum of the three numbers is: " + sum);
      System.out.println("The product of the three numbers is: " + product);
   }

}
