interface A 
{
    void show();  // if void show(int i)
}



public class Lambdaexpression {
    public static void main(String a[])
    {
        A obj = () ->  // can also write A obj = (int i) or i -> System.out.println("in show")
        {
            System.out.println("in show");
        };

        obj.show();
    }
    
}
