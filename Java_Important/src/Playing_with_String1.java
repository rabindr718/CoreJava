public class Playing_with_String1 {
public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("Marwadi education foundation");
		//sb.append("l");
		//sb.append("lo");
		//sb.insert(5, " Ram");
		for(int i=0;i<sb.length()/2; i++) 
	{
		int front=i;
		int back=sb.length()-1-i;
		char frontChar=sb.charAt(front);
		char backChar=sb.charAt(back);
		sb.setCharAt(front, backChar);
		sb.setCharAt(back, frontChar);
		//System.out.println(frontChar);
		//System.out.println(backChar);
		}
		//sb.reverse();
		System.out.println(sb);
	}

}
