import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name) {
        this.name = name;
        this.age = 0;
    }

    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }
}

public class Constructorreference {
    public static void main(String a[]) {

        List<String> names = Arrays.asList("Navin", "Harsh", "John");

        //for (String name : names){
        //    students.add(new Student(name));
        // }

        
        //students = names.stream()
                          //  .map(name -> new Student(name))
                          //  .toList();
        

        // Using constructor reference
        List<Student> students = names.stream()
                                      .map(Student::new)
                                      .toList();

        System.out.println(students);

        // o/p :
        // Student [name = "Ayan", age = 0], Student [name=Harsh, age = 0]
    }
}