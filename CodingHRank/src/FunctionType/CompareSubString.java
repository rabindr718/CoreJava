package FunctionType;
import java.util.Scanner;
public class CompareSubString {
	
	public static String getSmallestandGreatest(String s, int k)
	{
		String currentString=s.substring(0,k);
		String largest=currentString;
		String smallest=currentString;
		
		for(int i=1; i<=s.length()-k; i++)
		{
			currentString=s.substring(i,i+k);
			if(currentString.compareTo(largest)<0)
			{
				largest=currentString;
			}else
			{
				if(currentString.compareTo(smallest)>0)
				{
					smallest=currentString;
				}
			}
			
		}
		return smallest +"\n"+largest;
	}

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		int k=sc.nextInt();
		System.out.println(getSmallestandGreatest(s,k));
	}

}
