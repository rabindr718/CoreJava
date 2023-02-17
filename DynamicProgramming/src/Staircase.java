//A child runs up a staircase with 'n' steps and can hop either 1 step, 2 steps or 3 steps at a time. Implement a method to count and return all possible ways in which the child can run-up to the stairs.
//Input format :
//The first and the only line of input contains an integer value, 'n', denoting the total number of steps.
//Output format :
//Print the total possible number of ways.
public class Staircase {	
		  public static long staircase(int n){
		    long steps[] = new long[n + 1];
		      steps[0]=1;
		      if(n>0)
		      steps[1]=1;
		      if(n>1)
		      steps[2]=2;
		      if(n>2)
		      steps[3]=4;
		    for(int i=4;i<=n;i++){
		        long count1,count2 = 0, count3 = 0;
		        count1 = steps[i-1]; 
		        count2 = steps[i-2]; 
		        count3 = steps[i-3];  
		        steps[i] = count1+count2+count3;
		    }
		    return steps[n];
		  }
		}

