public class ExceptionThrow {

        public static void main(String a[])
    {
        int i = 20;
        int j = 0;
      
        try{
            j = 18/i;
            if(j == 0)
                throw new ArithmeticException();  // Output : 18 
           
           
        }
        catch(ArithmeticException e)
        {
            j = 18/1;
            System.out.println("that's the default value");
        }
        
        catch(Exception e){
            System.out.println("Something wrong:");
        }
        System.out.println(j);
        System.out.println("Bye");


    }

    // o/p : 
    // that's the default
    // 18
    // Bye
    

    
}
