package Exercise_402;

public class E1402_NextDaysTest
{
public static void main(String[] args)
{
   MyDate date1 = new MyDate(24, 9, 2014);
   MyDate date2 = date1.copy();
   
   System.out.println(date1);
   System.out.println(date2);
   
   if (date1.equals(date2))
      System.out.println("Date 1 = Date 2");
   else
      System.out.println("Date 1 is not equal to Date 2.");
  
   
   System.out.println();
   System.out.println("Increase Date 1.");
   date1.nextDays(5000);
   
   
   System.out.println();
   System.out.println(date1);
   System.out.println(date2);
   
   if (date1.equals(date2))
      System.out.println("Date 1 = Date 2");
   else
      System.out.println("Date 1 is not equal to Date 2.");
}
}
