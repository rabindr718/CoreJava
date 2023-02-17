import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class MultiplicationTable
{
    public static void main(String[] args) throws IOException
    {
     // BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
      int a=8;
        //int N = Integer.parseInt(reader.readLine());
        
        
        for(int i=1; i<=10; i++)
        {
            System.out.println(a + " x " +i+ " = " + a*i);
        }
    }
}