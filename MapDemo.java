import java.util.Map;
import java.util.HashMap;

public class MapDemo {
    public static void main(String a[]) {
        Map<String, Integer> students = new HashMap<>();

        students.put("Ayan", 56);
        students.put("Harsh", 23);

        System.out.println(students);  // {Ayan=56, Harsh = 23}
        System.out.println(students.get("Harsh"));  // 23

        System.out.println(students.keySet());  // [Ayan, Harsh]
        for(String key : students.keySet())
        {
            System.out.println(key + " : " + students.get(key));
        }
        // o/p:
        // Ayan : 56
        // Harsh : 23
        
    }
}