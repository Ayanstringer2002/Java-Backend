enum Laptop {
    Macbook(2000), 
    XPS(2200), 
    Surface(1500);

    private int price;

    private Laptop(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}

public class Enumadv {
    public static void main(String a[]) {
        for (Laptop lap : Laptop.values()) {
            System.out.println(lap + " : $" + lap.getPrice());
        }
    }
}