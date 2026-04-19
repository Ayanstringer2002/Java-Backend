import java.util.List;
import java.util.Optional;
import java.util.Arrays;


public class optionalclass {
    public static void main(String a[]){
        List<String> names = Arrays.asList("Ayan","Laxmi", "John", "smith");

        Optional<String> name = names.stream()
                                     .filter(str -> str.contains("x"))
                                     .findFirst();
        System.out.println(name.orElse("Not found"));

    }

    // can also write
    //String name = names.stream()
                         // .filter(str -> str.contains("x"))
                         // .findFirst()
                         // .orElse("Not found");
    //System.out.println(name);


    
}
