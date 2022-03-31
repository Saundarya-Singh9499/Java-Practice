package FunctionsandScope;

public class FunctionPRT {

	public static int prt(int p , int r , int t) {
		
		int ans = (p*r*t)/100;
		return ans;
	}
	
	public static void main(String[] args) {
		
           int num1 = 100;
           int num2 = 2;
           int num3 = 4;
           
           int result = prt( num1 , num2 , num3 );
           System.out.println(result);
           
	}

}
