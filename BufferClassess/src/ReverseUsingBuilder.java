
public class ReverseUsingBuilder {
	public static void main(String[]args)
	{
		int num=99132;
		StringBuilder sbl=new StringBuilder();
		sbl.append(num);
		sbl.reverse();
		System.out.println(sbl);
	}

}
