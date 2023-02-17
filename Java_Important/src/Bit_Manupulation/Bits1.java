package Bit_Manupulation;

public class Bits1 {

	public static void main(String[] args) {

		int n=5;
		int pos=2;
		int bitMask=1<<pos;
		int notBiskMask=~(bitMask);
		
		int newNumber=notBiskMask & n;
		System.out.println(newNumber);
	}

}
