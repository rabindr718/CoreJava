package LightRED;

public class PoliceHelp {

	public static void main(String[] args) {

		boolean Red=true;
		boolean Green=true;
		String out1="";
		if(Green)
		{
			out1="You are allowed to move";
		}
		else if(Red)
		{
			out1="Please Stop";
		}
		System.out.println(out1);
	}

}
