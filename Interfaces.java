interface A
{
    int age = 23;
    String area = "Patna"; // In Interface varibales are by default final and static as interface don't have its memory like heap memory 
    void show();
    void config(); // Don't need to write public void it already taken care by interface

}

class B implements A
{
    public void show()
    {
        System.out.println("in show");
    }
    
    public void config()
    {
        System.out.println("in config");
    }
}


public class Interfaces {
    public static void main(String a[])
    {
        A obj = new B();
        obj.show();
        obj.config();
    }
    
}
