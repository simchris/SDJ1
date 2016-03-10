package E1402;

public class Circle
{
   private double radius;

   public double getArea()
   {
      return Math.PI * radius * radius;
   }

   public double getRadius()
   {
      return radius;
   }

   public Circle()
   {
      radius = 0;
   }

   public Circle(double r)
   {
      radius = r;
   }

   public String toString()
   {
      return "Radius: " + radius + "\nArea: " + getArea();
   }

   public boolean equals(Circle obj)
   {
      if (radius == obj.radius)
         return true;
      else
         return false;
   }

   public boolean greaterThan(Circle obj)
   {
      if (getArea() > obj.getArea())
         return true;
      else
         return false;
   }
}
