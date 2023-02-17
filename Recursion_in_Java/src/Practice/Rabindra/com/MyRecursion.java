package Practice.Rabindra.com;
public class MyRecursion {
	public int sum(int k)
	{
		if(k>0) {
			return sum(k-1);
		}
		else {
			return 0;
		}
		
	}
public static void main(String[] args) {

		MyRecursion m1=new MyRecursion();
		int result=m1.sum(55);
		System.out.println(result);
	}
	

}
