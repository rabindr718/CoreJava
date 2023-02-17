package JavaProgram;

import java.util.Scanner;

public class printvowel_Consonent {

	public static void main(String[] args) {

		Scanner input=new Scanner(System.in);
		char ch=input.next().charAt(0);
		
		if(ch=='a'|| ch=='e'|| ch=='i'|| ch=='o'|| ch =='u')
		{
			System.out.println(ch+ ": This is Vowel Character");
			
		}
		else
		{
			System.out.println(ch + " : This is Consonent Character");
		}
	}

}
