public class Person 
{
    
    private String name;
    private int age;
    private String eyeColor;
    //These are our data types for this file
   
  public Person()
    {
        this("Adrian", 20, "Brown");
    }
    // This is our no arugmument constructor
  
    public Person(String name, int age, String eyeColor)
    {
        this.name = name;
        this.age = age;
        this.eyeColor = eyeColor;
    }
    // This is our 3 argument consructor 
    
  public String getName()
    {
        return name;
    }
    public void SetName(String name)
    {
        this.name = name;
    }
  
    public int getAge()
    {
        return age;
    }
    public void SetAge(int age)
    {
        this.age = age;
    }
  
    public String getEyeColor()
    {
        return eyeColor;
    }
    public void SetEyeColor(String eyeColor)
    {
        this.eyeColor = eyeColor;
    }
    //Getter and Setter methods for all 3 variables 

    public void talk()
    {
        System.out.println("Welcome, coders! I am " + name);
        System.out.println("Age: " + age);
        System.out.println("Eye color: " + eyeColor);
    }
    //This method allows for all the information to print throughout the class
  
    
    public String toString()
    {
        return "Name: " + name + "Age: " + age + "Eye color: " + eyeColor;
    }
  //The toString method for the class whic overrides Object.tostring
}
