import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class comparatorcomp {
    public static void main(String a[])
    {
        List<Integer> nums = new ArrayList<>();
        nums.add(43);
        nums.add(31);
        nums.add(72);
        nums.add(29);
        Collections.sort(nums);  // for sorting normal

        Comparator<Integer> com = new Comparator<Integer>()
        {
            public int compare(Integer i, Integer j)  // [31,72,43,29] // sort based on last digit
            {
                if(i % 10 > j % 10)
                {
                    return 1;
                }else{
                    return -1;
                }
            }
        };
        Collections.sort(nums, com);
        System.out.println(nums);
    }
    
}
