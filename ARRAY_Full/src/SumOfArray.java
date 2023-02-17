import java.util.Scanner;
public class SumOfArray
{
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int sum=0;

		System.out.println("Enter the Size of Array : ");
		int size=sc.nextInt();

		int arr[] =new int[size];
		System.out.println("Enter the Elements of Array : ");
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0; i<arr.length; i++)
		{
			sum=sum+arr[i];

			System.out.println(arr[i]+" ");
			System.out.println(arr[i]+" ");
		}
	}
}