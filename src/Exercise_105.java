
public class Exercise_105
{
   public static void main (String[] args)
   {
      double x = 80, y = 140, z = 230, xtax, ytax, ztax, xtotal, ytotal, ztotal;
      xtax = x*0.25;
      ytax = y*0.25;
      ztax = z*0.25;
      xtotal = x + xtax;
      ytotal = y + ytax;
      ztotal = z + ztax;
      
      System.out.println ("The tax of the items is: " + xtax + ", " + ytax +", " + ztax);
      System.out.println ("The price of the items after tax is: " + xtotal + ", " + ytotal + ", " + ztotal);
      
          
   }
}
