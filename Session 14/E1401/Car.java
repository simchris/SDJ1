package E1401;

public class Car
{
   private String make, model, color, licenceNumber;
   private int year;

   public Car(String make, String model, String color, String licence, int year)
   {
      this.make = make;
      this.model = model;
      this.color = color;
      this.licenceNumber = licence;
      this.year = year;
   }

   public Car(String make, String model, String color, int year)
   {
      this.make = make;
      this.model = model;
      this.color = color;
      this.licenceNumber = "No Licence";
      this.year = year;
   }

   public String getColor()
   {
      return color;
   }

   public String getLicenceNumber()
   {
      return licenceNumber;
   }

   public String getMake()
   {
      return make;
   }

   public String getModel()
   {
      return model;
   }

   public int getYear()
   {
      return year;
   }

   public void setColor(String color)
   {
      this.color = color;
   }

   public void setLicenceNumber(String licenceNumber)
   {
      this.licenceNumber = licenceNumber;
   }

   public Car copy()
   {
      return new Car(make, model, color, licenceNumber, year);
   }

   public String toString()
   {
      return "Make: " + make + "\nModel: " + model + "\nColor: " + color
            + "\nLicence Number: " + licenceNumber + "\nYear: " + year;
   }

   public boolean equals(Object obj)
   {
      if (!(obj instanceof Car))
      {
         return false;
      }

      Car other = (Car) obj; // I don't use 'new' because it's already a Car
                             // object if it gets here.

      return make.equals(other.make) && model.equals(other.model)
            && color.equals(other.color)
            && licenceNumber.equals(other.licenceNumber) && year == other.year;

   }
}
