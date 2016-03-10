package Exercise_1004;

public class FibonacciTest
{
   public static void main(String[] args)
   {
     int number=0, prevNumber = 1;
     
     for (int i=0; i<=20; i++)
     {
        int fib = number + prevNumber;
        prevNumber = number;
        number = fib;
       
        System.out.println("Fibonacci (" + i + ") : " + fib);
     }
   }
}
