package ArrayTest;
public class ArrayMethod {

	
	public void myArray(int[] size)
	{
		int name=size.length;
		for(int i=0; i<name; i++)
		{
			System.out.println(size[i]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
	
		ArrayMethod arrayMethod = new ArrayMethod();
		arrayMethod.myArray(new int[] {7,9,9,6,5});
		
	}

}
