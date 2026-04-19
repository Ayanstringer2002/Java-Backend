
public class ExceptionHalndling {
    public static void main(String a[])
    {
        int i = 2;
        int j = 0;
        int nums[] = new int[5];
        String s = null;
        try{
            j = 18/i;
            System.out.println(s.length()); // Throws exception 
            System.out.println(nums[1]);
            System.out.println(nums[5]);
        }
        catch(ArithmeticException e)
        {
            System.out.println("cannot divide by zero");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Stay in Limit:");

        }
        catch(Exception e){
            System.out.println("Something wrong:");
        }
        System.out.println(j);
        System.out.println("Bye");


    }
}

// Execution in a try block is sequential, and the moment an exception occurs, Java:
// 1. Stops executing the rest of the try block
// 2. Jumps immediately to the matching catch block