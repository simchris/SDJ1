import java.util.Scanner;
public class Exercise_203
{
   public static void main(String[] args)
   {
      double xtax, ytax, ztax, xtotal, ytotal, ztotal;
      
      //Create the Scanner object
      Scanner keyboard = new Scanner(System.in);
      
      //Input sales tax and the items' prices
      System.out.println("Give the sales tax and the price of the three items");
      double salesTax = keyboard.nextDouble();
      double item1 = keyboard.nextDouble();
      double item2 = keyboard.nextDouble();
      double item3 = keyboard.nextDouble();
     
      
      xtax = item1 * salesTax;
      ytax = item2 * salesTax;
      ztax = item3 * salesTax;
      xtotal = item1 + xtax;
      ytotal = item2 + ytax;
      ztotal = item3 + ztax;
      
      System.out.println ("The tax of the items is: " + xtax + ", " + ytax +", " + ztax);
      System.out.println ("The price of the items after tax is: " + xtotal + ", " + ytotal + ", " + ztotal);
      
   }

}
