import java.lang.*;
 
class A {
     
    static int height(int N)
    {
        return (int)Math.ceil(Math.log(N +
                    1) / Math.log(2)) - 1;
    }
 
    public static void main(String[] args)
    {
        int N = 126;
        System.out.println(height(N));
    }
}