// Interface - interface -> extends
// class - interface -> implements
// class - class -> extends

interface A
{

    void show();
    void config(); // Don't need to write public void it already taken care by interface

}

interface X
{
    void run();
}

interface Y extends X
{

}

class B implements A,Y
{
    public void show()
    {
        System.out.println("in show");
    }
    
    public void config()
    {
        System.out.println("in config");
    }

    public void run()
    {
        System.out.println("in run");
    }
}


public class MultipleInterface {
    public static void main(String a[])
    {
        A obj = new B();
        obj.show();
        obj.config();
        // obj.run(); -> Throws error
        X obj2 = new B();
        obj2.run();
    }
    
}
