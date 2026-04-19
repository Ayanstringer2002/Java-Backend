import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


public class forEach {
    public static void main(String a[]){
        List<Integer> nums = Arrays.asList(4,5,7,3,2,6);
        Consumer<Integer> con = new Consumer<Integer>(){
            public void accept(Integer n){
                System.out.println(n);
            }
        };
        nums.forEach(con);



        // O/P :
        // 4
        // 5
        // 7
        // 3
        // 2 
        // 6

        // Consumer<Integer> con = n -> System.out.println(n);
        // nums.forEach(con); // This is using Labda expression
        // nums.forEach(n -> System.out.println(n));
        
        

    }


    
}
