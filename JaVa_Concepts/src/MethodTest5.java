
public class MethodTest5 { 
		  void sum(int a,int b)
		  {
			  System.out.println(a+b);
		  }  
		  void sum(int a,int v,int c)
		  {
			  System.out.println(a+v+c);
			  
		  }  
		  
		  public static void main(String args[])
		  { 
			  
		  MethodTest5 obj=new MethodTest5();  
		  obj.sum(20,20);
		  obj.sum(20,20,20);  
		  
		  }  
		}  

