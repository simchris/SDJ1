package Exercise_404;

public class Employee
{
   private String name, department, position;
   private int idNumber;
   
   //mutator methods
   public void setName(String n)
   {
      name = n;
   }
   public void setIdNumber(int id)
   {
      idNumber = id;
   }
   public void setDepartment(String dep)
   {
      department = dep;
   }
   public void setPosition(String pos)
   {
      position = pos;
   }
   
   //accessor methods
   public String getName()
   {
      return name;
   }
   public int getId()
   {
      return idNumber;
   }
   public String getDep()
   {
      return department;
   }
   public String getPosition()
   {
      return position;
   }
}
