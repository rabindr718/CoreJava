class MethodTest2{  
		  void sum(int a,long b)
		  {
			  System.out.println("This is Very Clear");
			  
		  }  
		  void sum(int a,int b,int c)
		  {
			  System.out.println(a+b+c);
		  }  
		  
		  public static void main(String args[])
		  {  
			  MethodTest2 obj=new MethodTest2();  
			  obj.sum(20,20);
			  obj.sum(20,20,20);  
		  
		  }  
		}  
