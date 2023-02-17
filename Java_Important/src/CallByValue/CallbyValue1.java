package CallByValue;

public class CallbyValue1 {
	
	int data=60;
	void changeMethod(int data)
	{
		data=data+100;
	}

	public static void main(String[] args) {

		CallbyValue1 cbv=new CallbyValue1();
		
		System.out.println("before cahnge " +cbv.data);
		cbv.changeMethod(500);
		
		System.out.println(cbv.data);
	}

}
