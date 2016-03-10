package Exercise_701;

public class Person
{
   private String name;
   private String birthday;
   
   public Person (String n, String b)
   {
      name = n;
      birthday = b;
   }
   
   public Person()
   {
      name = "Your Name";
      birthday = "DD/MM/YYYY";
   }
   
   public String toString()
   {
      return "Name: " + name + " & Birthday: " + birthday;
   }

   public void setName(String n)
   {
      name = n;
   }
   
   public void setBirthday(String b)
   {
      birthday = b;
   }
   
   public String getName()
   {
      return name;
   }
   
   public String getBirthday()
   {
      return birthday;
   }
}
