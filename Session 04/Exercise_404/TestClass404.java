package Exercise_404;

public class TestClass404
{
   public static void main(String[] args)
   {
      Employee e1 = new Employee();
      Employee e2 = new Employee();
      Employee e3 = new Employee();
      
      e1.setName("Susan Meyers");
      e1.setIdNumber(47899);
      e1.setDepartment("Accounting");
      e1.setPosition("Vice President");
      
      e2.setName("SMark Jones");
      e2.setIdNumber(39119);
      e2.setDepartment("IT");
      e2.setPosition("Programmer");
      
      e3.setName("Joy Rogers");
      e3.setIdNumber(81774);
      e3.setDepartment("Manufacturing");
      e3.setPosition("Engineer");
      
      System.out.println("Name" + "\t\t\tID Number" + "\tDepartment" + "\t\tPosition");
      System.out.println("-------------------------------------------------------------------------------");
      System.out.println(e1.getName() + "\t\t" + e1.getId() + "\t\t" + e1.getDep() + "\t\t" + e1.getPosition());
      System.out.println(e2.getName() + "\t\t" + e2.getId() + "\t\t" + e2.getDep() + "\t\t\t" + e2.getPosition());
      System.out.println(e3.getName() + "\t\t" + e3.getId() + "\t\t" + e3.getDep() + "\t\t" + e3.getPosition());
   }

}
