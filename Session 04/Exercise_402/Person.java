package Exercise_402;

public class Person
{
   private String name;
   private Address address;
   private MyDate birthday;
   private Brain brain;

   public Person(String name, Address address, MyDate birthday)
   {
      this.name = name;
      this.address = address;
      this.birthday = birthday.copy();
      this.brain = new Brain(10);
   }

   public Person(String name, MyDate birthday)
   {
      this.name = name;
      this.birthday = birthday.copy();
//      this.address = "No Address";
      this.brain = new Brain(10);
   }

   public Person(MyDate birthday)
   {
      this.birthday = birthday.copy();
      this.name = "No Name";
//      this.address = "No Address";
      this.brain = new Brain(10);
   }

   public String getName()
   {
      return name;
   }

   public void setName(String name)
   {
      this.name = name;
   }

   public Address getAddress()
   {
      return address;
   }

   public String getShortAddress(){
     return address.getStreet() + " " + address.getNumber();
   }
   public void setAddress(Address address)
   {
      this.address = address;
   }

   public MyDate getBirthday()
   {
      return birthday;
   }

   public int getAge()
   {
      MyDate todaysDate = new MyDate(MyDate.today());

      return todaysDate.getYear() - birthday.getYear();
   }

   public int getIQ()
   {
      return this.brain.getIQ();
   }

   public boolean isBrainDamaged()
   {
      return this.brain.isBrainDamaged();
   }

   public boolean doYouRemember(String topic)
   {
      if (this.brain.recall(topic))
         return true;
      else
         return false;
   }

   public void rememberThis(String topic)
   {
      if (brain.recall(topic) == false)
          brain.remember(topic);
      else
         brain.refreshMemory(topic);
   }

   public String whatAreYouThinkingAbout()
   {
      return this.brain.recall();
   }

   public String toString()
   {
      return "Name: " + this.name + "\n" + "Address: " + this.address + "\n"
            + "Birthday: " + this.birthday + "\n" + "Age: " + getAge();
   }

   public boolean equals(Object obj)
   {
      if (!(obj instanceof Person))
         return false;

      Person dude = (Person) obj;
      return this.name.equals(dude.name) && this.address.equals(dude.address)
            && this.birthday.equals(dude.birthday);
   }
}
