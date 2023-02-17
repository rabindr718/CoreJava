package Constructor;
public class Rectangle {
	
	public int length;
	public int breadth;
//	
	public void getArea()
	{
		this.length=57;
		this.breadth=190;
		int area =length*breadth;
		System.out.println(area);
	}
	public static void main(String[] args) {
		
		Rectangle r1=new Rectangle();
		System.out.println(r1);
		r1.getArea();

		
	}

}
