package TwoDimensionalArray;

import java.util.Scanner;

public class TakeInput {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int row, column, i, j;
		row=sc.nextInt();
		column=sc.nextInt();
		int Matrix[][]=new int[row][column];
		for(i=0; i<row; i++)
		{
			for(j=0; j<column; j++)
			{
				Matrix[i][j]=sc.nextInt();
			}
		}
		for(i=0; i<row; i++)
		{
			for(j=0; j<column; j++)
			{
				System.out.print(Matrix[i][j]+" ");
			}
			System.out.println();
		}
	}

}
