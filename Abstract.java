abstract class Car 
{
    public abstract void drive();



    public void playMusic()
    {
        System.out.println("play music");
    }

}

class wagonR extends Car 
{
    public void drive()
    {
        System.out.println("Driving");
    }
}

public class Abstract {
    public static void main(String a[]){
        wagonR obj = new wagonR();
        obj.drive();
        obj.playMusic();
    }
}

// abstract method → method without body
// The abstract keyword in Java is used to define incomplete classes and methods that are meant to be extended or implemented by other classes.
// cannot make object of abstract class
// abstract method must be in abstract class
// There are also concrete class for accessing the abstract class method and variables.