package Exercise_502;

public class Book
{
   private String author, title;
   private double price;
   private int pages;
   

   public Book(String au, String t, double pr, int pag)
   {
      author = au;
      title = t;
      price = pr;
      pages = pag;
   }
   
   public void lowPrice()
   {
      price *= 0.8;
   }
   
   public void setAuthor(String au)
   {
      author = au;
   }
   
   public void setTitle(String t)
   {
      title = t;
   }
   
   public void setPrice(double pr)
   {
      price = pr;
   }
   
   public void setPages(int pag)
   {
      pages = pag;
   }

   public String getAuthor()
   {
      return author;
   }
   
   public String getTitle()
   {
      return title;
   }
   
   public double getPrice()
   {
      return price;
   }
   
   public int getPages()
   {
      return pages;
   }
   
   public String toString()
   {
      return "Author \t\t\tTitle \t\t\tPrice \t\t\tPages" + 
               "\n-------------------------------------------------------------------------------\n" + 
            author + "\t\t" + title + "\t\t" + price + "\t\t\t" + pages;
   }
}
