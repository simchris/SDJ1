package Exercise_402;

public class MyDate2
{
   private int day;
   private int month;
   private int year;
   
   public MyDate2(int day, int month, int year)
   {
      this.day = day;
      this.month = month;
      this.year = year;
   }
   
   public MyDate2()
   {
      this.day = 01;
      this.month = 01;
      this.year = 1995;
   }
   
   public void setDay(int d)
   {
      day = d;
   }
   
   public void setMonth(int m)
   {
      month = m;
   }
   
   public void setYear(int y)
   {
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
    * Display the date in d/m/y format
    * @return Returns a string viewing the MyDate object in a d/m/y format
    */
   
   public String displayDate()
   {
      return getDay() + "/" + getMonth() + "/" + getYear();
   }
   
   
   public String toString()
   {
      return "Day: " + this.day + "\n"
            + "Month: " + this.month + "\n"
                  + "Year: " + this.year;
   }
   
   /**
    * Check if the MyDate-object's year is a leap year
    * @return Returns true if the year is a leap year. Everything else will return false.
    */
   public boolean isLeapYear()
   {
      if(this.year%4==0)
      {
         if(this.year%100==0)
         {
            if(this.year%400==0)
            {
               return true;
            }else{
               return false;
            }
         } else if(this.year%4==0 && this.year%100!=0)
         {
            return true;
         }else{
            return false;
         }
            
      }else{
         return false;
      }
   }
   
   /**
    * Method to view the amount of days in the month of the MyDate-object
    * @return Returns an integer with the amount of days that the month has
    */
   
   public int daysInMonth()
   {
      if(this.month == 1)
      {
         return 31;
      } else if(this.month == 2)
      {
         if(isLeapYear())
         {
            return 29;
         } else {
            return 28;
         }
      } else if(this.month == 3)
      {
         return 31;
      } else if(this.month == 4)
      {
         return 30;
      } else if(this.month == 5)
      {
         return 31;
      } else if(this.month == 6)
      {
         return 30;
      } else if(this.month == 7)
      {
         return 31;
      } else if(this.month == 8)
      {
         return 31;
      } else if(this.month == 9)
      {
         return 30;
      } else if(this.month == 10)
      {
         return 31;
      } else if(this.month == 11)
      {
         return 30;
      } else if(this.month == 12)
      {
         return 31;
      } else {
         return 1;
      }
      
   }
   
   /**
    * Get the Astro sign for the MyDate-object
    * @return A string containing the name of the Astro sign
    */
   
   public String getAstroSign()
   {
      int febDays;
      if(isLeapYear())
      {
         febDays = 29;
      } else {
         febDays = 28;
      }
      
      if((this.month == 3 && this.day >= 21 && this.day <= 31) || (this.month == 4 && this.day >= 1 && this.day <= 19))
      {
         return "Aries";
      } else if((this.month == 4 && this.day >= 20 && this.day <= 30) || (this.month == 5 && this.day >= 1 && this.day <= 20))
      {
         return "Taurus";
      } else if((this.month == 21 && this.day >= 21 && this.day <= 31) || (this.month == 6 && this.day >= 1 && this.day <= 20))
      {
         return "Gemini";
      } else if((this.month == 6 && this.day >= 21 && this.day <= 30) || (this.month == 7 && this.day >= 1 && this.day <= 22))
      {
         return "Cancer";
      } else if((this.month == 7 && this.day >= 23 && this.day <= 31) || (this.month == 8 && this.day >= 1 && this.day <= 22))
      {
         return "Leo";
      } else if((this.month == 8 && this.day >= 23 && this.day <= 31) || (this.month == 9 && this.day >= 1 && this.day <= 22))
      {
         return "Virgo";
      } else if((this.month == 9 && this.day >= 23 && this.day <= 30) || (this.month == 10 && this.day >= 1 && this.day <= 22))
      {
         return "Libra";
      } else if((this.month == 10 && this.day >= 23 && this.day <= 31) || (this.month == 11 && this.day >= 1 && this.day <= 21))
      {
         return "Scorpio";
      } else if((this.month == 11 && this.day >= 22 && this.day <= 30) || (this.month == 12 && this.day >= 1 && this.day <= 21))
      {
         return "Sagittarius";
      } else if((this.month == 12 && this.day >= 22 && this.day <= 31) || (this.month == 1 && this.day >= 1 && this.day <= 19))
      {
         return "Capricorn";
      } else if((this.month == 1 && this.day >= 20 && this.day <= 31) || (this.month == 2 && this.day >= 1 && this.day <= 18))
      {
         return "Aquarius";
      } else if((this.month == 2 && this.day >= 19 && this.day <= febDays) || (this.month == 3 && this.day >= 1 && this.day <= 20))
      {
         return "Pisces";
      } else {
         return "Error in getting astro sign";
      }
   }
   /**
    * This method will return the day of the week for the MyDate-object
    * @return A string with the name of the day
    */
   
   public String dayOfWeek()
   {
      int day = this.day;
      int month = 0;
      int year = 0;
      
      if(this.month == 1)
      {
         month = 13;
      } else if(this.month == 2)
      {
         month = 14;
      } else {
         month = this.month;
      }
      
      if(month == 13 || month == 14)
      {
         year = this.year - 1;
      } else {
         year = this.year;
      }
      
      int k = year % 100;
      int j = year / 100;
      
      
      int h = ( day + (13*(month+1))/5 + k + (k/4) + (j/4) + (5*j) ) % 7;
      
      String[] days = {"Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday","Friday"};
      
      return days[h];
      
   }
   
   /**
    * This method will return the month name of the MyDate-object (1=January, 2=February etc.)
    * @return Returns a string with the month name
    */
   
   public String getMonthName()
   {
      switch(this.month)
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
      
      if(this.day > this.daysInMonth())
      {
         this.day = 1;
         this.month +=1;
      }
      
      if(this.month > 12)
      {
         this.month = 1;
         this.year += 1;
      }
   }
}
