import java.util.List;
import java.util.Arrays;

public class MethodReference {
    public static void main(String a[]){
        List<String> names = Arrays.asList("Navin", "Harsh", "John");
        List<String> uNames = names.stream()
                                    .map(String::toUpperCase) // ["NAVIN", "HARSH", "JOHN"]
                                    .toList();
        System.out.println(uNames); // OR uNames.foreach(System.out::println)

        

    }
    
}
