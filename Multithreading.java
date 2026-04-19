class A extends Thread{
    public void run()   // Run method should always be there
    {
        for(int i=1;i<=100;i++)
        {
            System.out.println("hi");
        }
    }
}

class B extends Thread{
    public void run()
    {
        for(int i=1;i<=100;i++)
        {
            System.out.println("hello");
        }
    }
}

public class Multithreading {

    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();

        obj1.start();   // starts thread A
        obj2.start();   // starts thread B
    }

    // o/p:
    // hi - exceutes 10 times , hello - executes 10 times and it repeats
    
    
}
