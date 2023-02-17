package Mixture.Thread;
class messege{
	//public void synchronized show(String name)
	public void show(String name)
	{
		;;;;; //1000 Lines of Code Here
		synchronized(this) { //This for passing name
		for(int i=0; i<=3;i++)
		{
			System.out.println("Hello How are You "+ name); //This used for passed the name
		}}
		;;;;; //1000 Lines of Code Here
	}
}
class OurClass extends Thread
{
	messege m;
	String name;
	OurClass(messege m, String name)
	{
		this.m=m;
		this.name=name;
	}
	public void run()
	{
		m.show(name);
	}
}
public class SyncBlockMethod {
	public static void main(String[] args) {
		messege m= new messege();
		OurClass t1= new OurClass(m, " Nitish");
		OurClass t2=new OurClass(m," Rabindra");
		t1.start();
		t2.start();
		
	}

}
