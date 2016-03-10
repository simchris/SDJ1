package Exercise_701;

public class Job
{
   private String title;
   private double salary;
   private Person employee;
   
   //constructors
   public Job (String ttl, double sal, Person emp){
      title = ttl;
      salary = sal;
      employee = emp;}
   
   public Job (String ttl, double sal){
      title = ttl;
      salary = sal;
      employee = null;}
   
   //mutator methods
   public void setTitle(String ttl){
      title = ttl;
   }
   
   public void setSalary(double sal){
      salary = sal;
   }
   
   public void setEmployee(Person emp){
      employee = emp;
   }
   
   //accessor methods
   public String getTitle(){
      return title;
   }
   
   public double getSalary(){
      return salary;
   }
   
   public Person getEmployee(){
      return employee;
   }

   //get percentage
   public void givePercentageRaise(double percentage){
      salary *= (1 + (percentage / 100));
   }

   //toString method
   public String toString(){
      return "Jobe title: " + title + 
            "\nSalary: $" + salary + 
            "\nEmployee: " + employee.getName();
   }
}

