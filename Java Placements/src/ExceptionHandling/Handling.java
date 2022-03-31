package ExceptionHandling;

public class Handling {

	public static int divide(int a , int b) throws DivideByZeroException {
		if(b==0) {
			throw new DivideByZeroException();
		}
		return a/b;
	}
	
	public static void main(String[] args)  {
		
       int a = 4;
       int b = 0;
	
	 try {
		divide(a , b);
	System.out.println("Try");
	 } catch (DivideByZeroException e) {
		System.out.println("kindly dont keep b as zero");
		
	}
	 
	  System.out.println("Hiiii");
	  
	}

}
