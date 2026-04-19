class Student {
    static String college = "ABC College"; // static variable
    String name;

    Student(String name) {
        this.name = name;
    }

    void display() {
        System.out.println(name + " - " + college);
    }
}

public class Static2 {
    public static void main(String[] args) {
        Student s1 = new Student("Ayan");
        Student s2 = new Student("Rahul");

        s1.display();
        s2.display();
    }
    
}
