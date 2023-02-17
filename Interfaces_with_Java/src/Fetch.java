
interface CompanyData
	{	
		public void GetAllName();
		public void GetAllBalanceDetails();
	}
public class Fetch {
	String name;
	int Balance;
	public void GetAllName() 
	{
		
		Fetch f1=new Fetch();
		f1.name= "Ramprakash Kumar Sharma";
		Fetch f2=new Fetch();
		f2.name="Rabindra Kumar Sharma";
		Fetch f3=new Fetch();
		f3.name="Vijay Shankar";
		
	}
	public void GetAllBalanceDetails() 
	{
		Fetch g1=new Fetch();
		g1.Balance=89374;
		Fetch g2=new Fetch();
		g2.Balance=1233;
		Fetch g3=new Fetch();
		g3.Balance=7364;
		
	}

	public static void main(String[] args) {
		
		CompanyData c1=new Fetch();

		
	}

}
