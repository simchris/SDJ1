package Exercise_402;

public class E1403_TodayDateTest
{
   public static void main(String[] args)
   {
      MyDate date1 = new MyDate();
      MyDate date2 = new MyDate(5, 1, 1990);

      System.out.println(MyDate.today());
      System.out.println(date1);
      System.out.println(date2);
   }
}
