import java.util.ArrayList;
import java.util.Scanner;



public class  javaCollections {

	public static void main(String[] args) {

		ArrayList<Integer> Name=new ArrayList<Integer> ();
		Scanner sc=new Scanner(System.in);
	
		
		int size;
		System.out.println("Enter the Size of ArrayList");
		size =sc.nextInt();
		System.out.println("Please Enter The Number");
		for(int i =0; i<size;i++) 
		{
			Name.add(sc.nextInt());
		}
		for(int Values : Name) 
		//Name.add(719);
		//Name.add(653);
		{
			System.out.print(Values);
		}
		
		
	}

}
