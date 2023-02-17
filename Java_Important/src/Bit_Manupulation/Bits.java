package Bit_Manupulation;
public class Bits {
	public static void main(String[] args) {
		int n=6;
		int pos=2;
		int bitMask=1<<0;
		if((bitMask & n)==0)
		{
			System.out.println("Bit was One");
		}
		else 
		{
			System.out.println("Bit was Zero");
		}
	}

}
