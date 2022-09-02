package String;

public class S57_CheckWhetherAStringIsPalindromeOrNot {

    public static void checkWhetherAStringIsPalindromeOrNot(String str) {
    	
    	  String strg = "";
    	  
    	  for(int i = str.length() - 1 ; i >= 0 ; i--) {
    		  
    		  strg = strg + str.charAt(i);
    	  }
    	  
    	   if(strg.equals(str)) {
    		   
    		   System.out.println("The String is a Palindrome");
    	   }
    	   
    	   else {
    		   
    		      System.out.println("The String is Not a Palindrome");
    	   }
    }
	
	public static void main(String[] args) {
		
		String str = "radar";
		
		checkWhetherAStringIsPalindromeOrNot(str);

	}

}
