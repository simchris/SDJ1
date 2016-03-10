package Exercise_402;

public class E1701_BrainPersonTest
{
   public static void main(String[] args)
   {

      MyDate date = new MyDate(5, 1, 1990);
      Address adr = new Address("kolokotroni", "12", "54630", "Thessaloniki",
            "Greece");
      Person p1 = new Person("Simos", adr, date);

      p1.rememberThis("Responsive Web Design");
      p1.rememberThis("Lego Robot Lab");
      p1.rememberThis("Java development in uml");

      System.out.println("IQ: " + p1.getIQ());
      System.out.println("Thinking about " + p1.whatAreYouThinkingAbout());
      System.out.println(p1.doYouRemember("Java development in uml"));

   }
}
