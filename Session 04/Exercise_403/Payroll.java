package Exercise_403;

public class Payroll
{
   private String name;
   private double hourPayRate, hoursWorked;
   
   public Payroll()
   {
      name = "Your Name";
      hourPayRate = 0;
      hoursWorked = 0;
   }
   
   public Payroll(String n, double p, double w)
   {
      name = n;
      hourPayRate = p;
      hoursWorked = w;
   }
   
   public String toString()
   {
      return "Name: " + name +
             "\nHourly Pay Rate: " + hourPayRate + 
             "\nHours Worked: " + hoursWorked +
             "\nGross Pay: " + getGrossPay();
   }
   
   public void setName(String n)
   {
      name = n;
   }
   
   public void setHourPayRate(double p)
   {
      hourPayRate = p;
   }
   
   public void setHoursWorked(double w)
   {
      hoursWorked = w;
   }
   
   public String getName()
   {
      return name;
   }
   
   public double getHourPayRate()
   {
      return hourPayRate;
   }
   
   public double getHoursWorked()
   {
      return hoursWorked;
   }
   
   public double getGrossPay()
   {
      return hoursWorked * hourPayRate;
   }
}
