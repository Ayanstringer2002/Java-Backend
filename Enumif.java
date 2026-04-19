enum Status {
    Running, Failed, Pending, Success;
}


public class Enumif {
    public static void main(String a[]){
        Status s = Status.Pending;
        
        // Switch example in case of enum
        switch(s)
        {
            case Running:
                System.out.println("All Good");
                break;
            case Failed:
                System.out.println("Try Again");
                break;
            case Pending:
                System.out.println("Wait");
                break;
            default:
                System.out.println("Done");
                break;

        }

        // If else example in case of enum
        if(s == Status.Running)
            System.out.println("All Good");
        else if(s == Status.Failed)
            System.out.println("Try Again");
        else if (s == Status.Pending)
            System.out.println("Wait");
        else
            System.out.println("Done");
    }
    
    // Output will be wait but if we change to Status.Running the output will be All Good

}
