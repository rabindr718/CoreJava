interface A
{
	  void  youHot();
}
interface B
{
	  void youHot();
}

public class Multiple implements A, B{
	public void youHot()
	{
		System.out.println("This is Implements A, B :");
	}

	public static void main(String[] args) {
		
		Multiple m1=new Multiple();
		m1.youHot();
		m1.youHot();

	}

}
