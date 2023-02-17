package Getter_Setter;

public class Getter_Setter_Methods_Implementations {
	private int id;
	private String name;

	public String getName() {
		return name;
	}

	public String setName(String n) {
		return name = n;
	}

	public static void main(String[] args) {
		Getter_Setter_Methods_Implementations rabindra = new Getter_Setter_Methods_Implementations();
		rabindra.setName("Rabindra Sharma");
		System.out.println(rabindra.getName());
	}

}
