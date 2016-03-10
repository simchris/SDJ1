package Exercise_401;

public class DemoPerson
{
   public static void main(String[] args)
   {
      Person p1 = new Person();
      Person p2 = new Person();
      Person p3 = new Person("Jack Daniels", "10/9/1910");
      Person p4 = new Person();
      
      p1.setName("Simos");
      p2.setName("John");
      
      p1.setBirthday("05/01/1990");
      p2.setBirthday("03/02/1989");
      
      System.out.println("Name: " + p1.getName() + " & Birthday: " + p1.getBirthday());
      System.out.println("Name: " + p2.getName() + " & Birthday: " + p2.getBirthday());
      System.out.println(p3);
      System.out.println("Name: " + p4.getName() + " & Birthday: " + p4.getBirthday());

      
   }
}
