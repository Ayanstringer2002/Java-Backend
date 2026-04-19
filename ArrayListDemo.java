import java.util.*;

public class ArrayListDemo {

    public static void main(String a[]) {
        List<Integer> nums = new ArrayList<>();

        nums.add(6);
        nums.add(5);
        nums.add(7);
        nums.add(8);

        System.out.println(nums.indexOf(5)); // index of 5
        System.out.println(nums.get(2));     // value at index 2

        for(int n : nums) {
            System.out.println(n);
        }
    }
}