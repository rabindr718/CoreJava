
public class ComplexNumbers {
	    private int real;
	     private int imaginary;
	    ComplexNumbers(int real,int imaginary)
	    {
	        this.real=real;
	        this.imaginary=imaginary;
	    }
	    public void plus(ComplexNumbers c2)
	    {
	       this.real = this.real+c2.real;
	       this.imaginary = this.imaginary+c2.imaginary;
	    }
	    public void multiply(ComplexNumbers c2)
	    {
	      int real1 = this.real*c2.real - this.imaginary*c2.imaginary;
	      int imaginary1 = this.real*c2.imaginary + this.imaginary*c2.real;
	        this.real = real1;
	        this.imaginary=imaginary1;
	    }
	    public void print()
	    {
	        System.out.println(real+" + i"+imaginary);
	    }


}
