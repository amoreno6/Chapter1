/** Class: PersonTester.java
* Author: Adrian Moreno
* Course: ITEC 2150
* 9/13/2022
* This class – Changes the name of person1 set in the person class and prints out the new details.
*/

public class PersonTester 
{
    public static void main(String [] args)
    {
        Person person1 = new Person();
        person1.SetName("Howard Roark");
        //This sets the name of person1 to Howard Roark
        person1.getAge();
        person1.getEyeColor();
        //Retrieves the variables from the no argument constructors
    
        person1.talk();
        // Invokes the talk method from the Person class 
      
        System.out.println(person1.toString());
    }


}
