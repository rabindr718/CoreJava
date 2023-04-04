class RecursionHypothesis {

	public static int F(int N) {
		
		
		if(N==1)
			return 1;
		
		int ans = F(N-1);
		return ans + N;
		
	}
	
	
	public static void main(String[] args) {
		
		F(8);


	}

}
