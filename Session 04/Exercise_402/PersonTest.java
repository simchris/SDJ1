package Exercise_402;

public class PersonTest
{
   public static void main(String[] args)
   {
      MyDate date1 = new MyDate(5, 1, 1992);
      Address adr = new Address("kolokotroni", "12", "54630", "Thessaloniki",
            "Greece");
      Person p1 = new Person("John", adr, date1);

      MyDate date2 = new MyDate(25, 1, 1992);
      date2.setDay(5);

      Person p2 = new Person("Mike", adr, date2);

      // p2.setName("John");

      System.out.println(p1);
      System.out.println();
      System.out.println(p2);

      System.out.println();

      if (p1.equals(p2))
         System.out.println("These two persons are the same. OMG!");
      else
         System.out.println("These are two different persons.");
   }
}
