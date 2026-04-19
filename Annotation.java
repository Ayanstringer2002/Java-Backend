class A 
{
    public void age()
    {
        System.out.println("This is his show");
    }
}

class B extends A 
{
    @Override  // This is an annotation used
    public void age()
    {
        System.out.println("This is a part");
    }
}

public class Annotation {
    public static void main(String a[])
    {
        B obj = new B();
        obj.age(); // Outputs into 
    }
}