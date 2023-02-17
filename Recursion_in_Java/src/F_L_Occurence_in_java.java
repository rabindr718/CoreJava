public class F_L_Occurence_in_java {
	public static int First=-1;
	public static int Last=-1;
	public static void findOccurence(String str, int indx, char element)
	{
		if(indx==str.length())
		{
			System.out.println(First);
			System.out.println(Last);
			return;
		}
		char currentChar=str.charAt(indx);
		if(currentChar==element)
		{
			if(First==-1)
			{
				First=indx;
			}else
			{
				Last=indx;
			}
		}
		findOccurence(str,indx+1, element);
	}
	public static void main(String[] args) {
		String str="abaacdaefaah";
		findOccurence(str, 0, 'a');	
		}
}
