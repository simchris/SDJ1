package Exercise_402;

public class Exercise_402

{
   public static void main(String[] args)
   {
      MyDate d1 = new MyDate();
      MyDate d2 = new MyDate();
      MyDate d3 = new MyDate(9, 9, 1992);
      MyDate d4 = new MyDate(14, 2, 2014);

      d1.setDay(15);
      d1.setMonth(9);
      d1.setYear(2014);
      d2.setDay(5);
      d2.setMonth(1);
      d2.setYear(1990);
      
      System.out.println("The first date is: " + d1 + "\tLeap Year: " + d1.isLeapYear() +
                           "\tDays of month: " + d1.daysInMonth() + 
                           "\tAstrological Sign: " + d1.getAstroSign() + "\tDay of Week: " + d1.dayOfWeek() + 
                           "\tMonth Name: " + d1.getMonthName());
      System.out.println();
      System.out.println("The second date is: " + d2 + "\tLeap Year: " + d2.isLeapYear() +
                           "\tDays of month: " + d2.daysInMonth() + 
                           "\tAstrological Sign: " + d2.getAstroSign() + "\tDay of Week: " + d2.dayOfWeek() + 
                           "\tMonth Name: " + d2.getMonthName());
      System.out.println();
      System.out.println("The third date is: " + d3 + "\tLeap Year: " + d3.isLeapYear() + "\t\tDays of month: " + d3.daysInMonth() + 
                         "\tAstrological Sign: " + d3.getAstroSign() + "\tDay of Week: " + d3.dayOfWeek() + 
                         "\tMonth Name: " + d3.getMonthName());
      System.out.println();
      System.out.println("The fourth date is: " + d4 + "\tLeap Year: " + d4.isLeapYear() +
                           "\tDays of month: " + d4.daysInMonth() + 
                           "\tAstrological Sign: " + d4.getAstroSign() + "\tDay of Week: " + d4.dayOfWeek() + 
                           "\tMonth Name: " + d4.getMonthName());
   }

}
