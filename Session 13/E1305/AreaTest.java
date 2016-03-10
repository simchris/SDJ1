package E1305;

public class AreaTest
{
   public static void main(String[] args)
   {
      double circleArea = Area.area(2);
      double rectangleArea = Area.area(2, 3.0);
      double cylinderArea = Area.area(2.1, 3);
      
      System.out.println("Circle area: " + circleArea);
      System.out.println("Rectangle area: " + rectangleArea);
      System.out.println("Cylinder area: " + cylinderArea);
   }
}
