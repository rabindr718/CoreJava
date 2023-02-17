public class ReverseString {
	public static void printReverse(String str, int indx)
	{
		if(indx==0)
		{
			System.out.println(str.charAt(indx));
			return;
		}
		System.out.print(str.charAt(indx));
		printReverse(str,indx-1);
		
	}

	public static void main(String[] args) {

		String str="abcd";
		printReverse(str,str.length()-1);

		
	}

}
