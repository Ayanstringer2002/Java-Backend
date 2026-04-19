import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

public class SetDemo {
    public static void main(String a[]) {
        Set<Integer> nums = new HashSet<>();
        // Set<Integer> nums = new TreeSet<>(); // This gives sorted output

        nums.add(6);
        nums.add(5);
        nums.add(7);
        nums.add(8);

        // Iterator method
        Iterator<Integer> values = nums.iterator();
        while(values.hasNext()){
            System.out.println(values.next());
        }

        /* 

        for(int n : nums) {
            System.out.println(n);
        }
        */
    }
}