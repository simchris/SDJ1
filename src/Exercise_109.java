import java.util.Scanner;

public class Exercise_109
{
   public static void main(String[] args)
   {
      String student1, student2;
      int age1, age2;

      Scanner scan = new Scanner(System.in);

      System.out.print("Enter student name: ");
      student1 = scan.nextLine();

      System.out.print("Enter student age: ");
      age1 = scan.nextInt();

      scan.nextLine(); // Consume the line

      System.out.print("Enter student2 name: ");
      student2 = scan.nextLine();

      System.out.print("Enter student2 age: ");
      age2 = scan.nextInt();

      System.out.println("\n\n" + student1 + "\t\t" + age1 + "\n" + student2
            + "\t\t" + age2);

   }
}
