import java.io.*;
import java.util.*;

public class MathsFunctionCalculate {

    public static void main(String[] args) {
     
     Scanner sc=new Scanner(System.in);
     
     int textCase=sc.nextInt();
     for(int i=0; i<textCase; i++)
     {
         int a=sc.nextInt();
         int b=sc.nextInt();
         int n=sc.nextInt();
         int sum=a;
         for(int j=0; j<n; j++)
         {
             sum += b * Math.pow(2, j);
                System.out.print(sum + " ");
         }
         System.out.println();
     }
    }
}