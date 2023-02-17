
public class ExceptionHandling {
	
	public static void Wait() throws InterruptedException
	{
		for(int i=1; i<=10; i++) {
			System.out.println(i);
			Thread.sleep(1000); //This Method is Used to Delay in Output 1 Second Taking value in Millisecond
		}
	}

	public static void main(String[] args) throws InterruptedException
	
	{
		
		Wait();
		// TODO Auto-generated method stub

	}

}
