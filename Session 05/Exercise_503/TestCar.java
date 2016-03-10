package Exercise_503;

public class TestCar
{
   public static void main(String[] args)
   {
      Car testCar = new Car(1997, "Toyota");
      
      for (int i=1; i<6; i++)
      {
         testCar.accelerate();
      }
      
      System.out.println("The car's current speed is: " + testCar.getSpeed());
      
      for(int i=1; i<6; i++)
      {
         testCar.brake();
      }
      
      System.out.println("The car's current speed is: " + testCar.getSpeed());
   }

}
