
class Human {
    private int age;
    
    private String name;


    // Default constructor
    public Human(){
        age = 30;
        name = "Ayan";
        System.out.println("constructor called");
    }

    // Parametrized constructor
    public Human(int age, String name){
        this.age = age;
        this.name = name;
    } 


    public int getAge(){
        return age;
    }
    public void setAge(int a){
        age = a;
    }
    public String getName(){
        return name;
    }
    public void setName(String n){
        name =n;
    }

}



public class Constructor {
    public static void main(String a[]){
        Human obj = new Human();
        obj.setAge(30);
        obj.setName("Reddy");
        System.out.println(obj.getName() + ":" + obj.getAge());

    }

}
