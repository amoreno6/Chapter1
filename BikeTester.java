/** Class: BikeTester.java
* Author: Adrian Moreno
* Course: ITEC 2150
* 9/13/2022
* This class – Tests methods from bike class as well as places both bikes into an array.
*/

import java.util.ArrayList;
public class BikeTester 
{
    public static void main(String [] args)
    {
       
        Bike bike1 = new Bike();
        System.out.println(bike1.toString());
        //Prints out the bike1 details with the toString method
        
        Bike bike2 = new Bike();
        bike2.setNumOfWheels(4);
        bike2.setManufacturer("Mongoose");
        bike2.SetYear(2010);
        System.out.println(bike2);
        //New bike with details set and printed
        
        ArrayList<Object> bikeList = new ArrayList<>();
        bikeList.add(bike1);
        bikeList.add(bike2);
        //Creates the array named ArrayList
        //Both bikes added into  ArrayList
       
        System.out.println(bikeList);
        //Prints out all bikes in the array
    }

}
