package Encapsulation;

class encap
{
	private String name;
	private int Roll;
	
	public void setValue(String Rname,int  RRollNo)
	{
		name=Rname;
		Roll=RRollNo;
	}
	public String getValue()
	{
		return name;
	}
	public int getValue1()
	{
		return Roll;
	}
}

public class EncapSulation {

	public static void main(String[] args) {
		
		encap x=new encap();
		x.setValue("Rabindra Kumar Sharma", 7137);
		System.out.println(x.getValue() + "\n" + "This is Roll Number : "+ x.getValue1());

	}

}
