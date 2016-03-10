package Exercise_705;

import java.util.GregorianCalendar;

public class MyDate
{
   private int day, month, year;

   // Constructors
   public MyDate()
   {
      GregorianCalendar currentDate = new GregorianCalendar();
      this.day = currentDate.get(GregorianCalendar.DATE);
      this.month = currentDate.get(GregorianCalendar.MONTH) + 1;
      this.year = currentDate.get(GregorianCalendar.YEAR);
   }

   public MyDate(int d, int m, int y)
   {
      if (d <= 0 || m <= 0 || y < 0)
      {
         throw new IllegalDateException("Invalid date type!");
      }
      day = d;
      month = m;
      year = y;
   }

   // Copy Constructor
   public MyDate(MyDate object2)
   {
      day = object2.day;
      month = object2.month;
      year = object2.year;
   }

   public String toString()
   {
      return day + "/" + month + "/" + year;
   }

   public void setDay(int d)
   {
      if (d <= 0)
      {
         throw new IllegalDateException("Invalid date type!");
      }
      
      day = d;
   }

   public void setMonth(int m)
   {
      if (m <= 0)
      {
         throw new IllegalDateException("Invalid date type!");
      }
      
      month = m;
   }

   public void setYear(int y)
   {
      if (y < 0)
      {
         throw new IllegalDateException("Invalid date type!");
      }
      
      year = y;
   }

   public int getDay()
   {
      return day;
   }

   public int getMonth()
   {
      return month;
   }

   public int getYear()
   {
      return year;
   }

   /**
    * public String displayDate() { return day + "/" + month + "/" + year; }
    */

   public boolean isLeapYear()
   {
      if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
      {
         return true;
      }
      else
      {
         return false;
      }
   }

   public int daysInMonth()
   {
      if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8
            || month == 10 || month == 12)
      {
         return 31;
      }
      else if (month == 2)
      {
         if (isLeapYear())
         {
            return 29;
         }
         else
         {
            return 28;
         }
      }
      else
      {
         return 30;
      }
   }

   public String getAstroSign()
   {
      int febDays;
      if (isLeapYear())
      {
         febDays = 29;
      }
      else
      {
         febDays = 28;
      }

      if ((day >= 21 && month == 3) || (day >= 19 && month == 4))
      {
         return "Aries";
      }
      else if (day >= 20 && month == 4 || (day <= 19 && month == 5))
      {
         return "Taurus";
      }
      else if ((day >= 21 && month == 5) || (day <= 20 && month == 6))
      {
         return "Gemini";
      }
      else if ((day >= 21 && month == 6) || (day <= 22 && month == 7))
      {
         return "Cancer";
      }
      else if ((day >= 23 && month == 7) || (day <= 22 && month == 8))
      {
         return "Leo";
      }
      else if ((day >= 23 && month == 8) || (day <= 22 && month == 9))
      {
         return "Virgo";
      }
      else if ((day >= 23 && month == 9) || (day <= 22 && month == 10))
      {
         return "Libra";
      }
      else if ((day >= 23 && month == 10) || (day <= 21 && month == 11))
      {
         return "Scorpio";
      }
      else if ((day >= 22 && month == 11) || (day <= 21 && month == 12))
      {
         return "Sagittarius";
      }
      else if ((day >= 22 && month == 12) || (day <= 19 && month == 1))
      {
         return "Capricorn";
      }
      else if ((day >= 20 && month == 1) || (day <= 18 && month == 2))
      {
         return "Aquarius";
      }
      else if ((month == 2 && day >= 19 && day <= febDays)
            || (month == 3 && day >= 1 && day <= 20))
      {
         return "Pisces";
      }
      else
      {
         return "Error in getting astro sign";
      }
   }

   public String dayOfWeek()
   {
      int d = day;
      int m = month;
      int y = year;

      if (m == 1 || m == 2)
      {
         if (m == 1)
         {
            m = 13;
            y -= 1;
         }
         else
         {
            m = 14;
            y -= 1;
         }
      }

      int k = y % 100;
      int j = y / 100;

      int h = (d + (13 * (m + 1) / 5) + k + (k / 4) + (j / 4) + (5 * j)) % 7;

      if (h == 0)
      {
         return "Saturday";
      }
      else if (h == 1)
      {
         return "Sunday";
      }
      else if (h == 2)
      {
         return "Monday";
      }
      else if (h == 3)
      {
         return "Tuesday";
      }
      else if (h == 4)
      {
         return "Wednesday";
      }
      else if (h == 5)
      {
         return "Thursday";
      }
      else
      {
         return "Friday";
      }
   }

   public String getMonthName()
   {
      switch (month)
      {
         case 1:
            return "January";
         case 2:
            return "February";
         case 3:
            return "March";
         case 4:
            return "April";
         case 5:
            return "May";
         case 6:
            return "June";
         case 7:
            return "July";
         case 8:
            return "August";
         case 9:
            return "September";
         case 10:
            return "October";
         case 11:
            return "November";
         case 12:
            return "December";
         default:
            return "Invalid month value";
      }
   }

   public void nextDay()
   {
      this.day += 1;

      if (this.day > this.daysInMonth())
      {
         this.day = 1;
         this.month += 1;
      }

      if (this.month > 12)
      {
         this.month = 1;
         this.year += 1;
      }
   }

   public void nextDays(int days)
   {
      for (int i = 1; i <= days; i++)
      {
         nextDay();
      }
   }

   public boolean equals(MyDate obj)
   {
      if (!(obj instanceof MyDate))
         return false;

      MyDate date = (MyDate) obj;

      return day == date.day && month == date.month && year == date.year;
   }

   public MyDate copy()
   {
      return new MyDate(day, month, year);
   }

   public static MyDate today()
   {
      GregorianCalendar currentDate = new GregorianCalendar();
      int currentDay = currentDate.get(GregorianCalendar.DATE);
      int currentMonth = currentDate.get(GregorianCalendar.MONTH) + 1;
      int currentYear = currentDate.get(GregorianCalendar.YEAR);

      return new MyDate(currentDay, currentMonth, currentYear);
   }

   public boolean isBefore(MyDate object)
   {
      if (this.year < object.year)
         return true;
      else if (this.year == object.year && this.month < object.month)
         return true;
      else if (this.year == object.year && this.month == object.month
            && this.day < object.day)
         return true;
      else
         return false;
   }
}
