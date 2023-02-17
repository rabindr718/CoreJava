package Examine;

public class ReverseUsingBuffer {

	public static void main(String[] args) {

		int num=123456789;
		StringBuffer sb=new StringBuffer(String.valueOf(num));
		
		System.out.println(sb.reverse());
	}

}
