package FunctionsandScope;

public class FunctionAddition {

	public static int Add (int a , int b ) {
		
		int result = a + b ; 
		return result;
    }
	
	
	public static void main(String[] args) {
		
     int c = 80;
     int d = 20;
     int result = Add( c , d );
     
     System.out.println(result);
	
	}

}
