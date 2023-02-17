package OOpsPracical;

public class Animals {
	
	String name;
	String Species;
	String weight;
	String color;
	String Place;
	
	
	

	public static void main(String[] args) {
		
		Animals a1 =new Animals();
		
		a1.name ="Lion";
		a1.Species="Wind Animals";
		a1.weight ="90kg";
		a1.color= "Brown & Yellow";
		a1.Place="Big Forest";
		

		a1.Lion();
		
			
		
		Animals a2 =new Animals();
		
		a2.name ="Bear";
		a2.Species ="Animals";
		a2.weight ="200kg";
		a2.color ="Black";
		a2.Place="Teresstial Animals";
		
		a2.Bear();
		
		
		Animals a3 = new Animals();
		
		a3.name="Elephant";
		a3.Species="Big animals";
		a3.weight="999kg";
		a3.color ="brown & White and Black";
		a3.Place ="Big Wild";
		
		a3.Elephant();
		
		
		Animals a4 =new Animals();
		
		a4.name="Girafe";
		a4.Species ="Animals";
		a4.weight ="500kg";
		a4.color ="Yellow";
		a4.Place ="Teresstial";
		
		a4.Girafe();
		
		Animals a5 = new Animals();
		a5.name="Tiger";
		a5.Species="Forest Animals";
		a5.weight ="200kg";
		a5.color ="yellow";
		a5.Place ="Teresstial";
		
		a5.Tiger();
		
		
		Animals a6 = new Animals();
		
		a6.name="Cow";
		a6.Species="Milk Giver";
		a6.weight ="200kg";
		a6.color ="White & Black & Brown";
		a6.Place ="Domestic Animals";
		
		a6.Cow();
		
		
		System.out.println( " Animal name " + " Living " + " Weight " + " Color " + "Place");
	}




	 void Cow() {

		 System.out.println("Number 6 Animal ---> " + name +" "+ Species +" "+ weight +" " + color+ " "+Place );
	}




	 void Tiger() {

		 System.out.println("Number 5 Animal ---> " + name +" "+ Species +" "+ weight +" " + color+ " "+Place);
		 
	}




	 void Girafe() {
		 
		 System.out.println("Number 4 Animal ---> " + name +" "+ Species +" "+ weight +" " + color+ " "+Place);

		 
	}




     void Elephant() {
    	 System.out.println("Number 3 Animal ---> " + name +" "+ Species +" "+ weight +" " + color+ " "+Place);
    	 
    	 
	}




	 void Bear() {
		
		 System.out.println("Number 2 Animal ---> " + name +" "+ Species +" "+ weight +" " + color+ " "+Place);

		 
	}




	 void Lion() {
		 
		 System.out.println("Number 1 Animal ---> " + name +" "+ Species +" "+ weight +" " + color+ " "+Place);

		 
	}
	
	

}

