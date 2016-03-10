package Exercise_402;

public class E1404_IsBeforeTest
{
   public static void main(String[] args)
   {
      MyDate date = new MyDate(23, 9, 2014);
      
      System.out.println(date);
      System.out.println(MyDate.today());

      if (date.isBefore(MyDate.today()))
         System.out.println("Date entered is before today's date.");
      else
         System.out.println("Date entered is not before today's date.");
   }
}
