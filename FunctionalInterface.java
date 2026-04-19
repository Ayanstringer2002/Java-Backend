// @FunctionalInterface
interface A
{
    void show();
}
/* 
class B implements A 
{
    public void show()
    {
        System.out.println("in show");
    }
}

*/

public class FunctionalInterface {
    public static void main(String a[])
    {
        A obj = new A() {
            public void show() {
                System.out.println("in show");
            }
        };
        obj.show();
    }
    
    
}
