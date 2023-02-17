package Static.Java;


class Test {
    
    static int a=10;
    static int b;
    static void fun()
    {
        b=a*4;
    }

}
public class  CarA{
    public static void main(String[]arg)
    {
        Test t=new Test();
        t.fun();
        System.out.println(t.a+" "+t.b);
    }
}


