package CallByValue;

public class ExampleCallByValue {
	
	int data=100;
	void change()
	{
		data=data+200;
	}
	public static void main(String[] args) {
		
		ExampleCallByValue call=new ExampleCallByValue();
		
		System.out.println(call.data);
		call.change();
		System.out.println(call.data);

	}

}
