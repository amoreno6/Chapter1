/** Class: Bike.java
*@author Adrian Moreno
* Course: ITEC 2150
* Written: 9/13/2022
*
* This class – Contains information about bikes. Details include manufacturer,number of wheels and the year the bike was built.
*//
public class Bike 
{
    
    private int numOfWheels;
    private String manufacturer;
    private int year;
    
    public Bike()
    {
        this(2, "Schwinn", 2014);
    }
  
    public Bike(int numOfWheels, String manufacturer, int year)
    {
        this.numOfWheels = numOfWheels;
        this.manufacturer = manufacturer;
        this.year = year;
    }

  
    public int getNumOfWheels()
    {
        return numOfWheels;
    }
    public void setNumOfWheels(int numOfWheels)
    {
        this.numOfWheels = numOfWheels;
    }
    public String getManufacturer()
    {
        return manufacturer;
    }
    public void setManufacturer(String manufacturer)
    {
        this.manufacturer = manufacturer;
    }
   
    public int getYear()
    {
        return year;
    }
    public void SetYear(int year)
    {
        this.year = year;
    }
    
    
    public String toString()
    {
        return "Number of wheels: " + numOfWheels + "Manufacturer: " + manufacturer + "Year: " + year;
    }
}
