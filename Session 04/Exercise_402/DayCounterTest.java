package Exercise_402;

public class DayCounterTest
{
   public static void main(String[] args)
   {
      MyDate birthday = new MyDate(5, 1, 1990);
      MyDate today = new MyDate(MyDate.today());

      int minDay = birthday.getDay();
      int minMonth = birthday.getMonth();
      int minYear = birthday.getYear();

      int maxDay = today.getDay();
      int maxMonth = today.getMonth();
      int maxYear = today.getYear();

      int sum = 0;
      while (true)
      {
         if (minDay == maxDay && minMonth == maxMonth && minYear == maxYear)
         {
            break;
         }
         birthday.nextDay();
         minDay = birthday.getDay();
         minMonth = birthday.getMonth();
         minYear = birthday.getYear();

         sum += 1;

      }
      System.out.println("The total days since your birthday are: " + sum);
   }
}
