package FunctionsandScope;


public class FunctionDivideNumbers {

	public static int divide( int num , int den) {
		
	 if(den == 0) {
		
		 return Integer.MIN_VALUE;
		 
	 }
		return num / den;
		
	}
	
	public static void main(String[] args) {
		
        int numr = 100;
        int denr = 2;
		
		int result = divide(numr , denr);
            System.out.println(result);
	}

}
