package Encapsulation;
class Encapsulate
{
	private String str;
	public void setName (String name)
		{
			str=name;
		}
	public String getName()
	{
		return str ;
	}
}
public class Encapsulation1 {
	public static void main(String[] args) {
		Encapsulate ec=new Encapsulate();
		
		ec.setName("Rabindra");
		
		System.out.println(ec.getName());
	}
}
