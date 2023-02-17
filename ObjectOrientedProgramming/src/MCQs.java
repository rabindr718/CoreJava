
class Pen{
	String name;
	int price;
	String color;
	String Origin;
	String Design;
	String UsedBetween;
}

public class MCQs {

	public static void main(String[] args) {

		Pen p1 =new Pen();
		p1.name ="";
		p1.price = 35;
		p1.color="Red";
		p1.Origin="Made in India";
		p1.Design ="Win Pen Corporation India Pvt. Ltd.";
		p1.UsedBetween="Six to Maximum Year Old Adults";
		
		
		System.out.println("Price of Win x Ten is " + p1.name);
		System.out.println("$ "+   p1.price);
		System.out.println("Color "+  p1.color);
		System.out.println("Origin "+   p1.Origin);
		System.out.println("Designed By "+ p1.Design);
		System.out.println("Used Age of "+   p1.UsedBetween);
		
	}

}
