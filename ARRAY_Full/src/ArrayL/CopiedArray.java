package ArrayL;
import java.util.Scanner;
public class CopiedArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int A[]= new int[7];
		int B[]=new int[7];
		System.out.println("Enter the Elements : ");
		for(int i=0; i<7; i++)
		{
			A[i]=sc.nextInt();
		}
		for(int i=0; i<7; i++)
		{
			System.out.print(A[i]+" ");
			
		}
		System.out.println();
		for(int i=0; i<7; i++)
		{
			B[i]=A[i];
			System.out.print(B[i]+" ");
		}
		
	}

}
