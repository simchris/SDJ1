package Exercise_503;

public class Car
{
   private int yearModel, speed;
   private String make;
   
   public Car(int ym, String m)
   {
      yearModel = ym;
      make = m;
      speed = 0;           
   }
   
   public int getYearModel()
   {
      return yearModel;
   }
   
   public int getSpeed()
   {
      return speed;
   }
   
   public String getMake()
   {
      return make;
   }
   
   public void accelerate()
   {
      speed += 5;
   }
   
   public void brake()
   {
      speed -= 5;
   }
}
