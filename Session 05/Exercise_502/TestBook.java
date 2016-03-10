package Exercise_502;
import java.util.Scanner;

public class TestBook
{
   public static void main(String[] args)
   {
      String inpName, inpTitle;
      double inpN1;
      int inpN2;
      
      Scanner keyboard = new Scanner(System.in);
      
      for(int i=0; i<2; i++){
      System.out.println("Enter the author: ");
      inpName = keyboard.nextLine();
      System.out.println("Enter the title: ");
      inpTitle = keyboard.nextLine();
      System.out.println("Enter the price: $");
      inpN1 = keyboard.nextDouble();
      System.out.println("Enter the number of pages: ");
      inpN2 = keyboard.nextInt();
      keyboard.nextLine();
      Book book1 = new Book(inpName, inpTitle, inpN1, inpN2);
      book1.lowPrice();
      
      System.out.println(book1);
      System.out.println();
      }
   }
}