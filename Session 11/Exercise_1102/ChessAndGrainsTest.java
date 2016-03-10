package Exercise_1102;
import java.text.DecimalFormat;
public class ChessAndGrainsTest
{
  public static void main(String[] args)
  {
   double totalGrains = 0;
   double grainsOnSquare = 0;
   
   for (int i=0; i<64; i++)
      {
         grainsOnSquare = Math.pow(2, i);
         totalGrains += grainsOnSquare;
      }
   DecimalFormat formatter = new DecimalFormat("#,###");
   
   System.out.println("There are " + formatter.format(grainsOnSquare) + " grains on the last square.");
   System.out.println("There are " + formatter.format(totalGrains) + " grains on the chessboard.");
  }
}
