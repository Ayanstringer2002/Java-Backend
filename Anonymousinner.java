class A
{
    public void show()
    {
        System.out.println("in a show");
    }
}




public class Anonymousinner {
    public static void main(String a[])
    {
        A obj = new A()
        {
            public void show()
            {
                System.out.println("in new show");
            }
        };
        obj.show();
    }
   
}

// The next show() method is already in a newly created anonymous class 
// output of obj.show() will be "in new show" not  "in show"
