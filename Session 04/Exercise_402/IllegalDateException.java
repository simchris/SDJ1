package Exercise_402;

public class IllegalDateException extends RuntimeException
{
   public IllegalDateException(String msg)
   {
      System.out.println("Error: " + msg);
   }
}
