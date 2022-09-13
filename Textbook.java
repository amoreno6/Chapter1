/** Class: Textbook.java
* Author: Adrian Moreno
* Course: ITEC 2150
* 9/13/2022
* This class – Contains details about textbooks such as subject, how many pages it has, and the price. Also contains a method that prints out all informations about the textbook.
*/

public class Textbook 
{
    private String subject;
    private int pages;
    private int price;
    //All 3 variables for the textbook that we will use in this class
  
    public Textbook()
    {
        this("Science", 1300 , 299);
    }
   
    public Textbook(String subject, int pages, int price)
    {
        this.subject = subject;
        this.pages = pages;
        this.price = price;
    }
     //This is our 3 argument constructor for this file
  
    
    public String getSubject()
    {
        return subject;
    }
    public void setSubject(String subject)
    {
        this.subject = subject;
    }
  
      public int getPages()
    {
        return pages;
    }
    public void setPages(int pages)
    {
        this.pages = pages;
    }
  
    public int price()
    {
        return price;
    }
    public void setPrice(int price)
    {
        this.price = price;
    }
    //These are our getters and setters for all 3 of our variables
  
    public void info()
    {
        System.out.println("The subject of this textbook is: " + subject);
        System.out.println("The number of pages this textbook contains: " + pages);
        System.out.println("This textbook costs: $ " + price);
    }
    //This method prints out the information about the textbook
  
    public String toString()
    {
        return "Subject: " + subject + "Number of pages: " + pages + "Cost of textbook: $" + price;
    }
    //The toString method for the class whic overrides Object.tostring
}
