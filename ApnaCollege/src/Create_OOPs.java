//Properties of Pen
class Pen{
	String color;
	String type;
	
	public void write() {
		
		System.out.println("Keep Write");
		}
	
	public void printinfo() {
		System.out.println(this.color);
		System.out.println(this.type);	
		}
	}

public class Create_OOPs {

	public static void main(String[] args) {
	// Here, We Create Objects
		
		Pen  pen1= new Pen();
		pen1.color="Red";
		pen1.type="Ball point";
		
		
		
		Pen pen2= new Pen();
		pen2.color="Green";
		pen2.type="Not Gel";
		
		pen1.printinfo();
		pen2.printinfo();

	}

}
