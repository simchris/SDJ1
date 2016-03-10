import java.util.Scanner;

public class Exercise_302
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
   
      System.out.println("Enter your name: ");
      String name = keyboard.nextLine();
      System.out.println("Enter your age: ");
      String age = keyboard.nextLine();
      System.out.println("Enter a city's name: ");
      String city = keyboard.nextLine();
      System.out.println("Enter a college's name: ");
      String college = keyboard.nextLine();
      System.out.println("Enter a profession: ");
      String profession = keyboard.nextLine();
      System.out.println("Enter a type of animal: ");
      String animal = keyboard.nextLine();
      System.out.println("Enter a pet's name: ");
      String pet = keyboard.nextLine();
      
      System.out.println("There once was a person named " + name + " who lived in "
                         + city + ". At the age of " + age + ",\n" + name +
                         " went to college at " + college + ". " + name + 
                         " graduated and went to work as a \n" + profession + 
                         ". Then, " + name + " adopted a(n) " + animal + 
                         " named " + pet + ". They both lived\nhappily ever after!");
   }

}
