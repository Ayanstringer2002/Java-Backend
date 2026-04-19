class AyanException extends Exception{
    public AyanException(String string)
    {
        super(string);
    }
}



public class customexception {
        public static void main(String a[])
    {
        int i = 20;
        int j = 0;
      
        try{
            j = 18/i;
            if(j == 0)
                throw new AyanException("I don't want to go");  // Output : 18 
           
           
        }
        catch(AyanException e)
        {
            j = 18/1;
            System.out.println("that's the default value" + e);
        }
        
        catch(Exception e){
            System.out.println("Something wrong:" + e);
        }
        System.out.println(j);
        System.out.println("Bye");


    }

    // o/p:
    // that's the default value AyanException: I don't want to go
    // 18
    // Bye



    
}
