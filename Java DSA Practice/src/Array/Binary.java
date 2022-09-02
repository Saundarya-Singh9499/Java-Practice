package Array;

public class Binary {

	public static String binary(int n ,  String strg) {
		
		if(n == 0) {
			
		    return "";
		}

		  return binary(n/2 , strg) + Integer.toString(n%2);
		 
	}
	
	public static void main(String[] args) {
		
		int n = 10;
		
		String result = binary(n ,  "");
		
		System.out.println(result);

	}

}
