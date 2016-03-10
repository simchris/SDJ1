package Exercise_903;
import java.text.DecimalFormat;

public class ClockTest
{
   public static void main(String[] args)
   {
      Clock clock1 = new Clock(21, 130, 10);
      Clock clock2 = new Clock(3665);
      Clock clock3 = new Clock(12, 10, 6);
      
      clock3.set(21, 59, 57);
      
      //DecimalFormat formatter = new DecimalFormat("##:##:##"); ERROR!!!! instead use a temporary String temp=""; and if hours, min or sec are < 10, temp+="0";
      //else temp+=hour, min or sec
      
      System.out.println(clock1 + "\t\tIn Seconds: " + clock1.convertToSeconds());
      System.out.println();
      System.out.println(clock2 + "\t\tIn Seconds: " + clock2.convertToSeconds());
      System.out.println();
      System.out.println(clock3 + "\t\tIn Seconds: " + clock3.convertToSeconds());
      System.out.println("Minute: " + clock3.getMinute() + "\t\tSecond: " + clock3.getSecond());
      
      clock3.tic();
      clock3.tic();
      clock3.tic();
      clock3.tic();

      System.out.println();
      System.out.println("After 4 seconds:");
      System.out.println(clock3 + "\t\tIn Seconds: " + clock3.convertToSeconds());
      System.out.println();  
      System.out.println();
      
      //Create a format object to format the difference of seconds between times.
      DecimalFormat formatter = new DecimalFormat("###,###,###");
      
      if (clock3.isBefore(clock2))
         System.out.println("The third time is  " + formatter.format(clock3.timeInSecondsTo(clock2)) + " seconds or " + clock3.timeTo(clock2) + " before the second one.");
      else
         System.out.println("The third time is not before the second one.They have a difference of " + clock3.timeTo(clock2) + ".");
      
      if (clock3.isBefore(clock1))
         System.out.println("The third time is  " + formatter.format(clock3.timeInSecondsTo(clock1)) + " seconds or " + clock3.timeTo(clock1) +" before the first one.");
      else
         System.out.println("The third time is not before the first one.They have a difference of " + clock3.timeTo(clock1) + ".");
      
      if (clock2.isBefore(clock1))
         System.out.println("The second time is " + formatter.format(clock2.timeInSecondsTo(clock1)) + " seconds or " + clock2.timeTo(clock1) + " before the first one.");
      else
         System.out.println("The second time is not before the first one.They have a difference of " + clock2.timeTo(clock1) + ".");
      
      System.out.println();
      
      clock1.setTimeFormat(12);
      clock2.setTimeFormat(12);
      clock3.setTimeFormat(12);
      System.out.println("12-hour mode:");
      System.out.println("" + clock1 + "\t" + clock2 + "\t" + clock3);
      System.out.println();
      
      clock1.setTimeFormat(24);
      clock2.setTimeFormat(24);
      clock3.setTimeFormat(24);
      System.out.println("24-hour mode:");
      System.out.println("" + clock1 + "\t" + clock2 + "\t" + clock3);
      System.out.println();

      clock1.setTimeFormat(12);
      clock2.setTimeFormat(12);
      clock3.setTimeFormat(12);
      System.out.println("12-hour mode:");
      System.out.println("" + clock1 + "\t" + clock2 + "\t" + clock3);
      System.out.println();
      
      clock1.setTimeFormat(24);
      clock2.setTimeFormat(24);
      clock3.setTimeFormat(24);
      System.out.println("24-hour mode:");
      System.out.println("" + clock1 + "\t" + clock2 + "\t" + clock3);
      System.out.println();
   }
}
