import hsa.*;

public class Day1 
{
    public static void main(String[] args) 
    {
        Console c = new Console();
        
        int age;
        
        c.println("Hello World!");
        
        c.print("\nHow old are you?: ");
        age = c.readInt();
        
        age ++;
        
        c.print("Your age will be " + age + " in 1 year.");
    }    
}
