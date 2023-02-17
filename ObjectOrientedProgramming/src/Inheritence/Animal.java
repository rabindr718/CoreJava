package Inheritence;
class Animals {
	int weight;//This is State
	String name;
	void Human()
	{
		System.out.println("Eating Bread :");
	}
	}
class janvar extends Animals
{
	//@Override
	void Human()
	{
		System.out.println("I am Lion ");
	}
	}
class Animals2 extends Animals{
	void Human()
	{
		System.out.println("Eating Grass :");
	}
}
public class Animal
{
	public static void main(String []args)
	{
		Animals jn=new janvar();
		Animals an=new Animals();
		an.Human();
		jn.Human();
		
	}
}
