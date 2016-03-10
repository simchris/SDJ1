package Exercise_501;

public class TestStudent
{
   public static void main(String[] args)
   {
      Student s1 = new Student("Simos Chris", 'M', 224205);
      Student s2 = new Student ("Eva Wall", 'F');
      Student s3 = new Student ("", 'M', 200200);
      
      s2.setStudentNumber(300300);
      s3.setName("Michael Jordan");
      
      s1.getGender();
      s2.getName();
      s3.getStudentNumber();
      
      System.out.println(s1.toString());
      System.out.println();
      System.out.println(s2.toString());
      System.out.println();
      System.out.println(s3);
   }
}
