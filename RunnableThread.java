
class A implements Runnable{
    public void run()   // Run method should always be there
    {
        for(int i=1;i<=5;i++)
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

class B implements Runnable{
    public void run()
    {
        for(int i=1;i<=5;i++)
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




public class RunnableThread {
    public static void main(String[] args) {
        Runnable obj1 = new A();
        /*
        
        Runnable obj1 = () ->
        {
        for(int i=1;i<=5;i++)
        {
            System.out.println("hi");
            try {
                Thread.sleep(10);
            }catch(InterruptedException e) {
                e.printStackTrace();
            }
        }

        };
        
        */
        Runnable obj2 = new B();
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }


    // o/p:
    // hi
    // hello
    // hi
    // hello 
    // It repeats
    

    
}
