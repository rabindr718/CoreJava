
public class AddTwo {
	
	public static int myMethod(int x, int z)
	{
		return x+z;
	}
	public static int myMethod(int x, int y,int z)
	{
		return x+z+y;
	}
	public static double myMethod(double a, double b)
	{
		return a+b;
	}
	

	public static void main(String[]args)
	{
		int x=Math.abs(-7837);
		System.out.println(x);
		double y=Math.random();
		System.out.println(y);
		String str[]= {"Bus", "Truck", "Car"};
		System.out.println(str[1]);
		for(String st: str) {System.out.print(st+" ");}
		System.out.println(myMethod(11,12));
		System.out.println(myMethod(11.33,12.49));
		System.out.println(myMethod(11,12,33));

	}
}
