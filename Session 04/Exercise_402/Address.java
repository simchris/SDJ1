package Exercise_402;

public class Address
{
   private String street, number, postalCode, city, country;

   public Address(String st, String no, String pc, String ci, String co)
   {
      street = st;
      number = no;
      postalCode = pc;
      city = ci;
      country = co;
   }

   public void setAddress(String st, String no, String pc, String ci, String co)
   {
      street = st;
      number = no;
      postalCode = pc;
      city = ci;
      country = co;
   }

   public String getStreet()
   {
      return street;
   }

   public void setStreet(String street)
   {
      this.street = street;
   }

   public String getNumber()
   {
      return number;
   }

   public void setNumber(String number)
   {
      this.number = number;
   }

   public String getPostalCode()
   {
      return postalCode;
   }

   public void setPostalCode(String postalCode)
   {
      this.postalCode = postalCode;
   }

   public String getCity()
   {
      return city;
   }

   public void setCity(String city)
   {
      this.city = city;
   }

   public String getCountry()
   {
      return country;
   }

   public void setCountry(String country)
   {
      this.country = country;
   }

   public String toString()
   {
      return street + " " + number + ", " + postalCode + ", " + city + ", "
            + country;
   }

   public boolean equals(Object obj)
   {
      if (!(obj instanceof Address))
         return false;

      Address adr = (Address) obj;
      return street.equals(adr.street) && number.equals(adr.number)
            && postalCode.equals(adr.postalCode) && city.equals(adr.city)
            && country.equals(adr.country);
   }
}
