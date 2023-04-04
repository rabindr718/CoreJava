import java.util.*;
public class Array_2D {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		int rows =sc.nextInt();
		int cols =sc.nextInt();
		
		int[][] Two_Dimensional = new int[rows][cols];
		//input Rows
		for(int i=0; i<rows; i++) 
		{
			for(int j=0; j<cols; j++) 
			{
				Two_Dimensional[i][j]=sc.nextInt();
			}
		}
		int x = sc.nextInt();
		
		for(int i =0; i<rows; i++) {
			for(int j=0; j<cols; j++) {
				if(Two_Dimensional[i][j]==x) {
					System.out.println("x is found at Location("+ i +","+j+")");
				}
			}
		}
		//output Column
		for(int i=0; i<rows; i++) 
		{
			for(int j=0; j<cols; j++)
			{
			System.out.print(Two_Dimensional[i][j] + " ");	
				
			}
			System.out.println();
		}
		
		
	}
}

