package Exercise_903;

public class Clock
{
   private int hour, minute, second;
   private boolean timeFormat24 = true;
   
   public  Clock(int h, int m, int s){
      hour = h;
      minute = m;
      second = s;
      timeCheck();
   }
   
   public Clock(int totalTimeInSeconds){
      hour = totalTimeInSeconds / 3600;
      minute = (totalTimeInSeconds-(hour*3600)) / 60;
      second = (totalTimeInSeconds- ((hour*3600) + (minute*60)));
      timeCheck();
   }
   
   private void timeCheck(){
      if (second>=60 || minute>=60 || hour>=24){
         if (second>=60){
           second-=60;
           minute++;
         }
         else if (minute>=60){
              minute-=60;
              hour++;
         }
         else if (hour>=24){
                  hour-=24;
         }
         timeCheck();
       }
   }
   
   public void set(int h, int m, int s){
      hour = h;
      minute = m;
      second = s;
   }
      
   public int getHour(){
      return hour;
   }
   
   public int getMinute(){
      return minute;
   }
   
   public int getSecond(){
      return second;
   }
   
   public void tic(){
      second++;
      timeCheck();
   }
   
   public int convertToSeconds(){
      int s1 = (hour*3600) + (minute*60) + second;
      return s1;
   }
   
   public boolean isBefore(Clock time){
      /*
      if (convertToSeconds() < time.convertToSeconds())
         return true;
      else
         return false;
*/
      
     //BUT This will return true or false anyway! ;)
      return convertToSeconds() < time.convertToSeconds();
   }
   
   public int timeInSecondsTo(Clock time){
      if (isBefore(time)){
      int dif = time.convertToSeconds() - convertToSeconds();
      return dif;
      }
      else{
         int dif = (24*3600) - (convertToSeconds() - time.convertToSeconds());
         return dif;
      }
   }
   
   public Clock timeTo(Clock time){
      int dif = timeInSecondsTo(time);
      int h1 = dif / 3600;
      int m1 = (dif-(h1*3600)) / 60;
      int s1 = (dif- ((h1*3600)+(m1*60)));
      Clock t1 = new Clock(h1, m1, s1);
      return (t1);
   }
   
   public String toString()
   {
      
      String strh = "", strm = "", strs = "";
      
      //to display time like 00:00:00
      if(hour<10)
         strh+="0"+hour;
      else
         strh+=hour;
      if(minute<10)
         strm+="0"+minute;
      else
         strm+=minute;
      if(second<10)
         strs+="0"+second;
      else
         strs+=second;
      
      if (isTimeFormat24()){
             return strh + ":" + strm + ":" + strs;
             }
      else
      {
         if (hour>12)
            {
            hour-=12;
            return strh + ":" + strm + ":" + strs + "pm";
            }
         else
            return strh + ":" + strm + ":" + strs + "am";
      }
  }
 
      
      

   public boolean isTimeFormat24(){
      return timeFormat24;   
      }
   
   public void setTimeFormat(int hourFormat){
      switch (hourFormat){
         case 12:
           // if (hour>12)
             //hour-=12;
               timeFormat24 = false;
         break;
      case 24:
           // if (hour<12 && timeFormat24==true)
             //  hour=hour;
           // else if (hour<12)
             //  hour+=12;
            timeFormat24 = true;
         break;
      default:
      }
   }
}
