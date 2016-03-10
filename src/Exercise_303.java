
public class Exercise_303
{
   public static void main(String[] args)
   {
      int numberShares = 1000;
      double buyprice = 32.87, commission, commission2,
             sellprice = 33.92, purchase, sell, total;
      
      purchase = numberShares * buyprice;
      commission = purchase * 0.02;
      sell = numberShares * sellprice;
      commission2 = sell * 0.02;
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
