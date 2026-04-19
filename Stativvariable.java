
class Mobile {
    String brand;
    int price;
    static String name;

}



public class Stativvariable {
    public static void main(String a[]){
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 150;
        Mobile.name = "Iphone 14";   // static variable 

        Mobile obj2 = new Mobile();
        obj2.brand = "Samsung";
        obj2.price = 200;
        Mobile.name = "Iphone 14";  // static variable

    }
    
}
