package StringQuestions;

import java.util.Scanner;

public class StringAnagram {
	
	static boolean inAnagram(String A, String B)
	{
		A=A.toLowerCase();
		B=B.toLowerCase();
		if(A.length()!=B.length())
			return false;
		int arr[]=new int[26];
		for(int i=0; i<A.length();i++)
		{
			int index=A.charAt(i)-'A';
			arr[index]++;
		}
		for(int i=0; i<B.length();i++)
		{
			int index=B.length()-'B';
			arr[index]--;
			
		}
		for(int i=0; i<26; i++)
		{
			if(arr[i]!=0)
			{
				return false;
			}
		}
		return true;
		
	}

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		String A=sc.next();
		String B=sc.next();
		sc.close();
		boolean ret = inAnagram(A, B);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
		
	}

}
