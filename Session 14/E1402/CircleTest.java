package E1402;

public class CircleTest
{
public static void main(String[] args)
{
   Circle c1 = new Circle(8);
   Circle c2 = new Circle();
   
   System.out.println("c1 = c2: " + c1.equals(c2));
   System.out.println("c1 > c2: " + c1.greaterThan(c2));
}
}
