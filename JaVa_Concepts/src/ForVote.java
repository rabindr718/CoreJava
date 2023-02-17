import java.util.Scanner;
public class ForVote
{
    static void checkAge() {
    Scanner sc=new Scanner(System.in);
    int n =sc.nextInt();
        int age=n;
        if(18<age){
            System.out.println("Hello Mr. Sharma You are eligible for Vote");
        }
        else
        {
            System.out.println("Hello Mr. Sharma Your not eligible for Vote");
        }
    }
    public static void main(String [] args)
    {
        checkAge();
    
    }
}