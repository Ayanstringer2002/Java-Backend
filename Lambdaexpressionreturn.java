interface A 
{
    int add(int i, int j);
}




public class Lambdaexpressionreturn {
    public static void main(String a[])
    {
        A obj  = new A() {  // or can write as A obj = (int i, int j) -> i + j; (Here don't write return like int)
            
                public int add(int i, int j)
                {
                    return i + j;
                }
            
        };
        int result = obj.add(5,4);
        System.out.println(result);
    }
    
}
