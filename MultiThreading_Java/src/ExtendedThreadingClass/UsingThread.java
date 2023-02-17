package ExtendedThreadingClass;

class thred extends Thread
{
	public void run()
	{
		int increase=0;
		while(increase<=10) 
		{
			System.out.println("Stupid Person Giving Pain");
			increase++;
		}
	}
}
public class UsingThread {

	public static void main(String[] args) {

		thred t1=new thred();
		t1.start();
		for(int i=0; i<10;i++)
		{
			System.out.println("Koi Bat Nahi");
		}
	}

}
