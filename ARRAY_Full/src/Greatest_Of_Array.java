
public class Greatest_Of_Array {

	public static void main(String[] args) {

		int arr[]= {2,4,6,7,43,31,-11,99};
		
		int min=arr[0];
		int max=arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println("This is Min : " + min +" "+"This is Max : "+ max);
	}

}
