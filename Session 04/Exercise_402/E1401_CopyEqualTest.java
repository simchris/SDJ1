package Exercise_402;

public class E1401_CopyEqualTest
{
public static void main(String[] args)
{
   MyDate date1 = new MyDate (25, 9, 2014);
   MyDate date2 = date1.copy();
   MyDate date3 = new MyDate(date1);
   
   System.out.println(date1);
   System.out.println(date2);
   System.out.println(date3);
   
   if (date1.equals(date2))
      System.out.println("Date 1 = Date 2");
   else
      System.out.println("Date 1 is not equal to Date 2");
   
   if (date1.equals(date3))
      System.out.println("Date 1 = Date 3");
   else
      System.out.println("Date 1 is not equal to Date 3");
   
   if (date2.equals(date3))
      System.out.println("Date 2 = Date 3");
   else
      System.out.println("Date 2 is not equal to Date 3");
}
}
