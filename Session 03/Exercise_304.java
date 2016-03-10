import java.util.Scanner;

public class Exercise_304
{
   public static void main(String[] args)
   {
      double purchase, sell, commission, commission2, total;
      Scanner keyboard = new Scanner(System.in);
      
      System.out.println("Enter the number of purchased stock: ");
      int stock = keyboard.nextInt();
      System.out.println("Enter the price per share of purchased stock: ");
      double buyprice = keyboard.nextDouble();
      System.out.println("Enter the number of sold stock: ");
      int stock2 = keyboard.nextInt();
      System.out.println("Enter the price per share of sold stock: ");
      double sellprice = keyboard.nextDouble();
      System.out.println("Enter the commission percentage for the stockbroker: ");
      double commissionRate = keyboard.nextDouble();
      
      commissionRate = commissionRate / 100;
      purchase = stock * buyprice;
      commission = purchase * commissionRate;
      sell = stock * sellprice;
      commission2 = sell * commissionRate;
      total = (sell - commission) - (purchase - commission2);
      
      System.out.println("Joe paid for the stock $" + purchase + ".");
      System.out.println("Joe paid a commission of $" + commission + 
            " to his broker when he bought the stock.");
      System.out.println("Joe sold the stock for $" + sell + ".");
      System.out.println("Joe paid a commission of $" + commission2 + 
            " to his broker when he sold the stock.");
      if (total>0) {
      System.out.println("Joe made a profit of $" + total + 
            " after he sold the stock and paid the broker.");
      } else {
         System.out.println("Joe made a loss of $" + total + 
               " after he sold the stock and paid the broker.");
      }
   }
}
