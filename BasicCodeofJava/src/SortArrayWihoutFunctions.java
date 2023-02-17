
public class SortArrayWihoutFunctions 
	{
	public static void main(String[] args)
{
		int [] num={ 2,4,3,1,3,8,9,8,6,4,88,5,34,34,3,3,5,53,3,5,53,3,32,3,243,5,523,5,23,352,5,25,52,52,5,525,2,};

	     for(int i=0;i<num.length-1;i++){
	        for(int j=0;j<num.length-i-1;j++){
	            if(num[j]>num[j+1]){
	                int temp = num[j];
	                num[j]=num[j+1];
	                num[j+1]=temp;
	            }
	        }
	      }

	      for(int x=0;x<num.length;x++){
	        System.out.print(num[x]+" ");
	    }
		
}
}

