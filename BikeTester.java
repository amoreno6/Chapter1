/** Class: BikeTester.java
* Author: Adrian Moreno
* Course: ITEC 2150
* 9/13/2022
* This class – Prints out all details found in the bike class
*/

import java.util.ArrayList;
public class BikeTester 
{
    public static void main(String [] args)
    {
       
        Bike bike1 = new Bike();
        System.out.println(bike1.toString());
        
        Bike bike2 = new Bike();
        bike2.setNumOfWheels(4);
        bike2.setManufacturer("Mongoose");
        bike2.SetYear(2010);
        System.out.println(bike2);
        
        ArrayList<Object> bikeList = new ArrayList<>();
        bikeList.add(bike1);
        bikeList.add(bike2);
       
        System.out.println(bikeList);

    }

}
