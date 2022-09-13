/** Class: Textbook.java
* Author: Adrian Moreno
* Course: ITEC 2150
* 9/13/2022
* This class – This class tests the getters, setters and methods of the Textbook class.
*/

public class TextbookTester 
{
    public static void main(String[] args)
    {
        Textbook t1 = new Textbook();
        t1.getSubject();
        t1.getPages();
        t1.getPrice();
        t1.info();
        
        Textbook t2 = new Textbook();
        t2.setSubject("Mathematics");
        t2.setPages(970);;
        t2.setPrice(199);
        t2.info(); 
        
        Textbook t3 = new Textbook();
        t3.setSubject("English");
        t3.setPages(1100)
        t3.setPrice(249)
        System.out.println(t3.toString());
      
      //I invoked various getters, setters and tested my method with 2 different textbook packages in order to test the business class. 
      //The third I tested the ovveride toString method.
     
}
