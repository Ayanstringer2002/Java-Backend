class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}


public class overirde {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.sound();   // Parent class method

        Dog d = new Dog();
        d.sound();   // Overridden method

        Animal obj = new Dog();
        obj.sound(); // Runtime polymorphism (calls Dog's method)
    }
    
}

// output :
// Animal makes a sound
// Dog barks
// Dog barks
