package Exercise_504;

public class TestScores
{
   private double score1, score2, score3;
   
   //Constructor
   public TestScores(double s1, double s2, double s3){
      score1 = s1;
      score2 = s2;
      score3 = s3;
   }
   
   //Accessor methods
   public void setScore1(double s1){
      score1 = s1;}
   
   public void setScore2(double s2){
      score2 = s2;}
   
   public void setScore3(double s3){
      score3 = s3;}
   
   //Mutator methods
   public double getScore1(){
      return score1;}
   
   public double getScore2(){
      return score2;}
   
   public double getScore3(){
      return score3;}
   
   public double getAverage(){
      return (score1 + score2 + score3) / 3;
   }
}
