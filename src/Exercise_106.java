
public class Exercise_106
{
   public static void main (String[] args)
   {
      double circumference, area, radius = 22.5;
      circumference = 2 * Math.PI * radius;
      area = Math.PI * Math.pow(radius,2);
      System.out.println("The circumference of a circle with a radius of 22.5 is "
                           + circumference
                           + " \nand the area is " + area + ".");
   }

}
