package String;

public class S56_ReverseAString {

	public static String reverse(String str) {
		
		String strg = "";
		
		for(int i = str.length() - 1 ; i >= 0 ; i--) {
			
			strg = strg + str.charAt(i);
		}
	
	        return strg;
	}
	
	public static void main(String[] args) {
		
	    String str = "abcd";
	    
	    String result = reverse(str);
	    
	    System.out.println(result);

	}

}
