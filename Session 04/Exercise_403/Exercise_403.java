package Exercise_403;
import java.util.Scanner;

public class Exercise_403
{
   public static void main(String[] args)
   {
      String name;
      double number;
      Scanner keyboard = new Scanner(System.in);
      
      Payroll employee1 = new Payroll();
      Payroll employee2 = new Payroll("Nick Galis", 100, 23);
      Payroll employee3 = new Payroll("john Doe", 12, 16);

      
      System.out.println("Enter employee's name: ");
      name = keyboard.nextLine();
      employee1.setName(name);
      System.out.println("Enter hourly pay rate: ");
      number = keyboard.nextDouble();
      employee1.setHourPayRate(number);
      System.out.println("Enter hours worked: ");
      number = keyboard.nextDouble();
      employee1.setHoursWorked(number);
      
      keyboard.close();
      
      System.out.println("\tName: " + employee1.getName() 
                           + "\n\tHourly Pay Rate: " + employee1.getHourPayRate() 
                           + "\n\tHours Worked: " + employee1.getHoursWorked() 
                           + "\n\tGross Pay: $" + employee1.getGrossPay());
      System.out.println();
      System.out.println(employee2);
      System.out.println();
      System.out.println("\tName: " + employee3.getName() 
            + "\n\tHourly Pay Rate: " + employee3.getHourPayRate() 
            + "\n\tHours Worked: " + employee3.getHoursWorked() 
            + "\n\tGross Pay: $" + employee3.getGrossPay());
   }

}
