import java.util.Scanner;

public class Exercise_201
{
   public static void main(String[] args)
   {
     //Create the Scanner object
     Scanner keyboard = new Scanner(System.in);
     
     //Get the user's city name
     System.out.println ("What is the name of your city?");
     String city = keyboard.nextLine();
     
     int strSize = city.length();
     String upper = city.toUpperCase();
     String lower = city.toLowerCase();
     char letter = city.charAt(0);
     
     System.out.println(strSize);
     System.out.println(upper);
     System.out.println(lower);
     System.out.println(letter);
   }

}
