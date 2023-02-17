import java.net.InetAddress;
public class Address {

	public static void main(String[] args) {
		try {
				
			InetAddress ip=InetAddress.getByName("www.biharuniversity.ac.in");
			
			System.out.println("The Local Address is " + ip.getHostAddress());
			System.out.println("The Host Name is " + ip.getHostName());
			
		
		}
			
	catch(Exception x){
		
		System.out.println(x);
		}
	System.out.println("Website is not found");
  }
}