import java.util.Scanner;

public class TakeRunValueOfArray {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Size of Array ");
		int size=sc.nextInt();
		int []array=new int[size];
		for(int i=0; i<array.length;i++) 
		{
			array[i]=sc.nextInt();
		}
		for(int i=0; i<array.length; i++) 
		{
			System.out.print(array[i]+" ");
		}
	}

}
