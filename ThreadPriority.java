
class A extends Thread{
    public void run()   // Run method should always be there
    {
        for(int i=1;i<=100;i++)
        {
            System.out.println("hi");
            try {
                Thread.sleep(10);
            }catch(InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class B extends Thread{
    public void run()
    {
        for(int i=1;i<=100;i++)
        {
            System.out.println("hello");
            try {
                Thread.sleep(10);
            }catch(InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


public class ThreadPriority {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();

        obj1.start(); 
        try {
                Thread.sleep(2);
            }catch(InterruptedException e) {
                e.printStackTrace();
            }
        obj2.start();   // starts thread B
    }
    
}


//o/p :
// hi and hello alternate output , sometimes hello prints two times consecutively it depends upon the serializers.
