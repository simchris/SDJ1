package E1305;

public class Area
{
   private static double pi = Math.PI;
   private static double radius, width, length, height;
   
   public static double area(double r){
      radius = r;
      return pi * (Math.pow(radius, 2));
   }
   
   public static double area(double w, double l){
      width = w;
      length = l;
      return width * length;
   }
   
   public static double area(double r, int h){
      radius = r;
      height = h;
      return pi * (Math.pow(radius, 2)) * height;      
   }
}
