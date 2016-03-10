package Exercise_402;

public class Brain
{
   private String[] brain = {};
   private boolean damage;

   public Brain(int size)
   {
      brain = new String[size];
      damage = false;
   }

   public int getIQ()
   {
      if (isBrainDamaged())
      {
         return 70;
      }
      else
      {
         int item1 = brain[0].length();
         int item2 = brain[1].length();
         int item3 = brain[2].length();

         if (item1 > 20 && item2 > 10 && item3 > 10 || item2 > 20 && item1 > 10
               && item3 > 10 || item3 > 20 && item1 > 10 && item2 > 10)
            return 130;
         else if (item1 >= 10 && item2 >= 10 && item3 >= 10)
            return 100;
         else
            return 70;
      }
   }

   public boolean isBrainDamaged()
   {
      for (int i = 0; i < brain.length; i++)
      {
         if (brain[i] == null)
         {
            damage = true;
            return damage;
         }
      }

      return damage;
   }

   public void remember(String info)
   {
      for (int i = 0; i < brain.length-1; i++)
      {
         brain[i + 1] = brain[i];
      }
      brain[0] = info;
   }

   public void refreshMemory(String info)
   {
      String temp = "";
      for (int i = 0; i < brain.length; i++)
      {
         if (info.equalsIgnoreCase(brain[i]))
            temp = brain[i];
      }

      for (int i = 0; i < brain.length; i++)
      {
         brain[i + 1] = brain[i];
      }
      brain[0] = temp;
   }

   public boolean recall(String info)
   {
      boolean remember = false;
      if (info != null)
      {
         for (int i = 0; i < brain.length; i++)
         {
            if(info.equalsIgnoreCase(brain[i])){
               remember = true;
               return remember;
            }
         }
      }
      else if (info == null && isBrainDamaged())
         remember = true;
      else
         remember = false;
      return remember;
   }

   public String recall()
   {
      return brain[0];
   }

   public String toString()
   {
      String str = "";
      for (int i = 0; i < brain.length; i++)
      {
         str += brain[i] + "\n";
      }
      return str;
   }

   public boolean equals(Object obj)
   {
      if (!(obj instanceof Brain))
         return false;

      Brain br = (Brain) obj;
      boolean eq = false;
      for (int i = 0; i < brain.length; i++)
      {
         eq = (this.brain[i].equals(br.brain[i]));
      }
      return eq;
   }
}
