import java.util.Arrays;
import java.util.Scanner;

public class DynamicArray {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of Array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		
		for(int i=0; i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.print(arr[1]);
		System.out.print(" ");
		for(int i=0; i<arr.length;i++) 
		{
			System.out.print(i+" ");
		}
//		for(int i=0; i<arr.length; i++)
//		{
//			Arrays.sort(arr);
//			System.out.print(+arr[i]+" ");
//			System.out.println(+arr[2]+" ");
//			}
		}
	}
