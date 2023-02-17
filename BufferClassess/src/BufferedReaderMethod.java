import java.io.BufferedReader;
 import java.io.IOException;
 import java.io.InputStreamReader;
public class BufferedReaderMethod {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		//for Integer Value is Taken out 
		System.out.println("Enter The Integer Value");
		int x= Integer.parseInt(br.readLine());
		
		
		System.out.println("Enter The String Value");
		String z= br.readLine();
		
		System.out.println("Enter The Flaot Value");
		float y =Float.parseFloat(br.readLine());
		
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		
		System.out.println(x);
		System.out.println(y +"  ");
		System.out.println(z);
	
		
	
	}

}
