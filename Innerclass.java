class A 
{
    int age;
    public void show(){
        System.out.println("in show");
    }
    class B
    {
        public void config()
        {
            System.out.println("in config");
        }
    }
}





public class Innerclass {
    public static void main(String a[]){
        A obj = new A();
        obj.show();
        A.B obj1 = obj.new B();
        obj1.config();

    }



    
}

// outerclass.innerclass objectname(innerclassname) = outerclassobject.new innerclassname()
// if we use static keyword like static class B then don't need to write outerclassobject.new innerclassname() we can directly write outerclass.innerclass objectname(innerclassname) = new outerclass.innerclassname()
