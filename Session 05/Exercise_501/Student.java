package Exercise_501;

public class Student
{
   private String name;
   private char gender;
   private int studentNumber;
   
   public Student (String n, char g, int sn){
      name = n;
      gender = g;
      studentNumber = sn;
   }
   
   public Student (String n, char g){
      name = n;
      gender = g;
      studentNumber = 0;
   }
   
   public void setName(String n){
      name = n;
   }
   
   public void setStudentNumber(int sn){
      studentNumber = sn;
   }
   
   public String getName(){
      return name;
   }
   
   public char getGender(){
      return gender;
   }
   
   public int getStudentNumber(){
      return studentNumber;
   }
   
   public String toString(){
      return "\"" + name + 
            ", '" + gender + 
            "', " + studentNumber + "\"";
   }
}
