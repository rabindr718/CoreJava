import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class URLDemoJava {

	public static void main(String[] args) throws Exception {
		URL obj = new URL("https://www.gtu.ac.in");
		
		URLConnection conn = obj.openConnection();
		
		int l = conn.getContentLength();
		System.out.println("Length of content: "+1);
		if(l==0)
		{
			System.out.println("Content is not Available");
			return;
		}
		else {
			
			int ch;
			InputStream in=conn.getInputStream();
			while((ch=in.read())!= -1)
				System.out.print((char)ch);
			
		}
	}
}
