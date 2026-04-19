enum Status
{
    Running, Failed, Pending, Success;  // These are objects of enum class (Name constant)
}


public class Enum {
    public static void main(String a[])
    {
        int i = 5;
        Status s = Status.Running;  // O/P : Running
        // Status s = Status.NoIdea  -> This Gives error 
        System.out.println(s.ordinal()); // o/p : 0
        
        /* 
        //Status[] s = Status.values(); // This Gives all Like Running, Failed, Pending, Success
        // for (Status s : ss)
    {
        System.out.println(s + " " + s.ordinal());
    }

        */

        System.out.println(s);
    }
    
}
