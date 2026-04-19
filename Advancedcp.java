
class Computer  // can change it to interface Computer as well
{
    public void code()
    {

    }
}


class Laptop extends Computer  // can also replace by implements
{
    public void code()
    {
        System.out.println("code, compile, run");
    }

}

class Desktop extends Computer{  // can also replace with implements
    public void code()
    {
        System.out.println("code, compile, fast");
    }
}

class Developer
{
    public void devApp(Computer comp)
    {
        comp.code();
    }
}




public class Advancedcp {

    public static void main(String a[])
    {

    Computer lap = new Laptop();
    Computer desk = new Desktop();
    Developer dev = new Developer();
    dev.devApp(lap);
    dev.devApp(desk);
    }
}

// So interface is for Loose coupling and abstarct class is for tight coupling.
