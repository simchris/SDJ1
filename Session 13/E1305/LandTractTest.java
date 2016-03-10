package E1305;

import java.util.Scanner;

public class LandTractTest
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);

      System.out.println("Enter the length of the first track:");
      double l1 = scan.nextDouble();
      System.out.println("Enter the width of the first track:");
      double w1 = scan.nextDouble();
      LandTract track1 = new LandTract(l1, w1);
      
      System.out.println();
      
      System.out.println("Enter the length of the second track:");
      double l2 = scan.nextDouble();
      System.out.println("Enter the width of the second track:");
      double w2 = scan.nextDouble();
      LandTract track2 = new LandTract(l2, w2);

      scan.close();

      System.out.println();
      System.out.println("Track 1: \n" + track1);
      System.out.println("Track 2: \n" + track2);
      System.out.println();

      if (track1.equals(track2))
         System.out.println("The tracks are equal.");
      else
         System.out.println("The tracks are not equal.");
   }
}
