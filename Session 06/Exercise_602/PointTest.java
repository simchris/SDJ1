package Exercise_702;

public class PointTest
{
   public static void main(String[] args)
   {
      Point point1 = new Point(4, 4);
      Point point2 = new Point(10, 5);
      
      point1.setX(1);
      point2.setY(5);
      point1.moveTo(2, 4);
      point2.move(-10, -1);
      
      System.out.println(point1.toString());
      System.out.println(point2);
      
      double dis = Math.sqrt(Math.pow(point2.getX()-point1.getX(), 2) + 
                             Math.pow(point2.getY()-point1.getY(), 2));
       
      System.out.println("The distance between the two points is: " + 
                           dis);
   }
}
