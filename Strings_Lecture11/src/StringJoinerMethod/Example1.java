package StringJoinerMethod;

import java.util.StringJoiner;

public class Example1 {

	public static void main(String[] args) {

		StringJoiner join1=new StringJoiner(",");
		
		join1.add("Rabindra");
		join1.add("Kumar");
		join1.add("Sharma");
		System.out.println(join1);
		
	}

}
