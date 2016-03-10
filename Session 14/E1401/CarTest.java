package E1401;

public class CarTest
{
   public static void main(String[] args)
   {
      Car car1 = new Car("Toyota", "Starlet", "silver", "NEB2316", 1997);
      Car car2 = car1.copy();

      car2.setColor("black");
      car2.setLicenceNumber("ABB2020");

      System.out.println(car1);
      System.out.println();
      System.out.println(car2);

      System.out.println();
      
      if (car1.equals(car2))
         System.out.println("The cars are identical.");
      else
         System.out.println("The cars are different.");
   }
}
