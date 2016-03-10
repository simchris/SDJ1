package Exercise_1101;
import java.util.Scanner;

public class UsernamePasswordTest
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      String username, password, confirm;
            
      do {
         System.out.println("Enter your username: ");
         username = scan.nextLine();
         System.out.println("Enter your password: ");
         password = scan.nextLine();
         System.out.println("Re-enter your password for confirmation: ");
         confirm = scan.nextLine();
      
         if (!confirm.equals(password))
            System.out.println("Wrond password. Try again.");
      
      }while (!confirm.equals(password));
      
      scan.close();
      
      System.out.println("\n");
      System.out.println("Username: " + username);
      System.out.println("Password: " + password);
   }
}
