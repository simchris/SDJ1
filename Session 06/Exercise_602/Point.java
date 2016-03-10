package Exercise_702;

public class Point
{
   private int x, y;
   
   //constructor
   public Point(int xCoor, int yCoor){
      x = xCoor;
      y = yCoor;
   }

   //mutator methods
   public void setX(int number1){
      x = number1;
   }

   public void setY(int number2){
      y = number2;
   }

   //accessor methods
   public int getX(){
      return x;
   }
   
   public int getY(){
      return y;
   }

   //moveTo method
   public void moveTo(int newX, int newY){
      x= newX;
      y = newY;
   }
   
   //move method
   public void move(int xDistance, int yDistance){
      x += xDistance;
      y += yDistance;
   }
   
   //toString method
   public String toString(){
      return "(" + x + ", " + y + ")";
   }
   
   
}
