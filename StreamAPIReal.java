import java.util.List;
import java.util.Arrays;
import java.util.List;


public class StreamAPIReal {
    public static void main(String a[]){
        List<Integer> nums = Arrays.asList(4,5,7,3,2,6);
        //Stream<Integer> s1 = nums.stream();   // [4,5,7,3,2,6]
        // Stream<Integer> s2 = s1.filter(n -> n % 2 == 0); // [4,2,6]
        // Stream<Integer> s3 = s2.map(n -> n * 2); // [8,4,12]
        //s3.forEach(n -> System.out.println(n)); // This gives output
        // note we only use s1 once only or stream created only once.

        int result = nums.stream()
                             .filter(n -> n % 2 == 0)
                             .map(n -> n * 2)
                             .reduce(0,(c,e) -> c+ e);
        System.out.println(result);
    }
    
}
