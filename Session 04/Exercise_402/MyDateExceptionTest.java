package Exercise_402;

public class MyDateExceptionTest
{
   public static void main(String[] args)
   {
      MyDate d1 = new MyDate(23, 10, 1990);

      try
      {
         d1.setDay(-3);
      }
      catch (IllegalDateException e)
      {
         e.printStackTrace();
      }

      System.out.println(d1);
   }
}
