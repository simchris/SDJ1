package E1305;

public class LandTract
{
   private double length, width;
   
   public LandTract(double length, double width){
      this.length = length;
      this.width = width;
   }
   
   public double getArea(){
      return length * width;
   }
   
   public boolean equals(LandTract object2){
      if (getArea() == object2.getArea())
         return true;
      else
         return false;               
   }
   
   public String toString(){
      return "Length: " + length + "\nWidth: " + width + "\nArea: " + getArea() + "\n";
   }
}
