package ArrayL;
public class Array2 {

	public static void main(String[] args) {
		int A[]= {1,2,3,4,5};
		int B[]= {6,7,8,9,1};
		for(int first : A)
		{
			int C=first;
			System.out.print(C);
		}
		System.out.println();
		for(int second : B)
		{
			int D=second;
			System.out.print(D);
		}
	}
}
