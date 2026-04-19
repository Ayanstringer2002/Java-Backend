abstract class A {
    public abstract void show();
    public abstract void config();
}

public class Abstractanonymous {
    public static void main(String a[]) {
        A obj = new A() {

            public void show() {
                System.out.println("in new show");
            }

            public void config() {
                System.out.println("in config");
            }
        };

        obj.show();
        obj.config();
    }
}

// Internally :
/*
- You are not instantiating abstract class A
- You are creating a child class (anonymous class) that:
Extends A
- Implements all abstract methods
- Then you are creating its object

*/

/*
This is internal working:

class Anonymous extends A {
    public void show() {
        System.out.println("in new show");
    }

    public void config() {
        System.out.println("in config");
    }
}

A obj = new Anonymous();

*/