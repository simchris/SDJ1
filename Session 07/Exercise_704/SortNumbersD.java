package Exercise_704;

import java.util.Scanner;

public class SortNumbersD
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      
      System.out.println("Please enter a number:");
      double n1 = keyboard.nextDouble();
      System.out.println("Please enter a second number:");
      double n2 = keyboard.nextDouble();
      System.out.println("Please enter a third number:");
      double n3 = keyboard.nextDouble();
      System.out.println("Please enter a fourth number:");
      double n4 = keyboard.nextDouble();
      
      
      
      //first block n1 smaller
      if (n1<n2 && n1<n3 && n1<n4){
         if (n2<n3 && n2<n4){
            if(n3<n4){
               System.out.println(n1+" < "+n2+" < "+n3+" < "+n4);
            }
            else{
               System.out.println(n1+" < "+n2+" < "+n4+" < "+n3);
                }
         }
         else if (n3<n2 && n3<n4){
            if (n2<n4){
               System.out.println(n1+" < "+n3+" < "+n2+" < "+n4);
               }
            else{
               System.out.println(n1+" < "+n3+" < "+n4+" < "+n2);
               }
         }
         else if (n4<n2 && n4<n3){
            if (n2<n3){
               System.out.println(n1+" < "+n4+" < "+n2+" < "+n3);
            }
            else{
               System.out.println(n1+" < "+n4+" < "+n3+" < "+n2);
            }
         }
      }
      //second block n2 smaller
      else if (n2<n1 && n2<n3 && n2<n4){
         if (n1<n3 && n1<n4)
         {
            if (n3<n4){
               System.out.println(n2+" < "+n1+" < "+n3+" < "+n4);
            }
            else{
               System.out.println(n2+" < "+n1+" < "+n4+" < "+n3);
            }
         }
         else if (n3<n1 && n3<n4){
            if (n1<n4){
               System.out.println(n2+" < "+n3+" < "+n1+" < "+n4);
            }
            else{
               System.out.println(n2+" < "+n3+" < "+n4+" < "+n1);
            }
         }
         else if (n4<n1 && n4<n3){
            if (n1<n3){
               System.out.println(n2+" < "+n4+" < "+n1+" < "+n3);
            }
            else{
               System.out.println(n2+" < "+n4+" < "+n3+" < "+n1);
            }
         }
       }
       //third block n3 smaller
      else if (n3<n1 && n3<n2 && n3<n4){
         if(n1<n2 && n1<n4){
            if(n2<n4){
               System.out.println(n3+" < "+n1+" < "+n2+" < "+n4);
            }
            else{
               System.out.println(n3+" < "+n1+" < "+n4+" < "+n2);
            }
         }
        else if(n2<n1 && n2<n4){
           if(n1<n4){
              System.out.println(n3+" < "+n2+" < "+n1+" < "+n4);
           }
           else{
              System.out.println(n3+" < "+n2+" < "+n4+" < "+n1);
           }
         }
        else if(n4<n1 && n4<n2){
           if(n1<n2){
              System.out.println(n3+" < "+n4+" < "+n1+" < "+n2);
           }
           else{
              System.out.println(n3+" < "+n4+" < "+n2+" < "+n1);
           }
        }
      }
      //fourth block n4 smaller
      else if(n4<n1 && n4<n2 && n4<n3){
         if(n1<n2 && n1<n3){
            if(n2<n3){
               System.out.println(n4+" < "+n1+" < "+n2+" < "+n3);
            }
            else{
               System.out.println(n4+" < "+n1+" < "+n3+" < "+n2);
            }
         }
         else if(n2<n1 && n2<n3){
            if(n1<n3){
               System.out.println(n4+" < "+n2+" < "+n1+" < "+n3);
            }
            else{
               System.out.println(n4+" < "+n2+" < "+n3+" < "+n1);
            }
         }
         else if(n3<n1 && n3<n2){
            if(n1<n2){
               System.out.println(n4+" < "+n3+" < "+n1+" < "+n2);
            }
            else{
               System.out.println(n4+" < "+n3+" < "+n2+" < "+n1);
            }
         }
      }
      else{
         System.out.println("Error in typed values.\nPlease enter" +
                              " four different numbers.");
      }
   }
}
