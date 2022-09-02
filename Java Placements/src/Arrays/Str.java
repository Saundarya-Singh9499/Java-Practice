package Arrays;

public class Str {

	public static void main(String[] args) {
		
		String s = "abcd";
		
		String revstring = "";
		
		int strLen = s.length();
		
		for(int i = s.length() -1 ; i >= 0 ; i--) {
			
			revstring = revstring+ s.charAt(i);
		}

	      if(s.toLowerCase().equals(revstring.toLowerCase())) {
	    	  
	    	  System.out.println("isPalindrome");
	}
	      else {
	    	  System.out.println("Not a palindrome");
	      }
}
}