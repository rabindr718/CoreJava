
public class ReverseInteger {
	
	public static void main(String[]args)
	{
		int num=123456;
		StringBuffer sb=new StringBuffer(String.valueOf(num));
		
		StringBuffer rev=sb.reverse();
		
		System.out.println(rev+" ");
	}

}
