package Exercise_701;

public class TestJob
{
   public static void main(String[] args)
   {
      Person p1 = new Person("Simos Christodoulou", "05/01/1990");
      Person p2 = new Person("Kobe Bryant", "03/02/1978");
      
      Job j1 = new Job("Software Engineer", 4000.0, p1);
      Job j2 = new Job("Basketball Player", 250000);
      
      j1.setTitle("Java Developer");
      j1.setSalary(4500);
      j2.setEmployee(p2);
      
      j1.givePercentageRaise(25);
      j2.givePercentageRaise(10);
      
      j2.getEmployee();
      j2.getSalary();
      j2.getTitle();
      
      System.out.println(j1.toString());
      System.out.println();
      System.out.println(j2);
   }
}
