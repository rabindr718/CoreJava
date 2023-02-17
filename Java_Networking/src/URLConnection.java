import java.net.InetAddress;
public class URLConnection {

	public static void main(String[] args) {
		        try{
		            InetAddress ip=InetAddress.getByName("www.javatpoint.com");
		            InetAddress ip1=InetAddress.getByName("www.google.com");
		            System.out.println("1. "+ip.getAddress());
		            System.out.println("2. "+ip1.getAddress());
		        }catch(Exception e){System.out.println(e);}


	}

}
