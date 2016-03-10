package Exercise_706;
import java.util.Scanner;

public class DeterminantTest
{
   public static void main(String[] args)
   {
     Scanner keyboard = new Scanner(System.in);
     
     System.out.println("Enter value for a:");
     double numA = keyboard.nextDouble();
     System.out.println("Enter value for b:");
     double numB = keyboard.nextDouble();
     System.out.println("Enter value for c:");
     double numC = keyboard.nextDouble();
     
     double Det = Math.pow(numB, 2) - 4 * numA * numC;
     
     if (Det<0){
        System.out.println("There is no solution.");
     }
     else if (Det==0){
        double x = - (numB / (2 * numA));
        System.out.println("There is one solution: " + x);
     }
     else{
        double x1 = -numB + Math.sqrt(Det) / (2 * numA);
        double x2 = -numB - Math.sqrt(Det) / (2 * numA);
        
        System.out.println("There are two solutions: " + 
                             x1 + " and " + x2);
     }
   }
}
