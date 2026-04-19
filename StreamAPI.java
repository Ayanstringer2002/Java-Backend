import java.util.List;
import java.util.Arrays;



public class StreamAPI {
    public static void main(String a[]){

     List<Integer> nums = Arrays.asList(4,5,7,3,2,6);

      for(int i=0;i<nums.size();i++){
        System.out.println(nums.get(i));
      }

      for(int n : nums){
        System.out.println(n);
      }

      nums.forEach(n -> System.out.println(n)); // 


       // List<Integer> nums = Arrays.asList(4,5,7,3,2,6);
       // int sum = 0;
       // for(int n : nums){
       //     if(n % 2 == 0){
       //         n = n * 2;
       //         sum = sum + n;

       //     }
       // }
       // System.out.println(sum);

    }

    
}
