package String;

public class S90_MinimumCharactersToMakeAStringPalindrome {

	public static int minimumCharacters(String str) {
		
		 int count = 0;
		 
		 String strg = "";
		 
		 String strg1 = "";
		 
		 String strg2 = "";
		 
		 String strg3 = "";
		 
		 String strg4 = "";
		 
		 for(int i = str.length() - 1 ; i >= 0 ; i--) {
			 
			 strg2 = strg2 + str.charAt(i);
		 }
		 
		 for(int j = str.length() - 1 ; j >= 1 ; j--) {
			 
			     strg = strg + str.charAt(j);
			     
			     strg3 = str.charAt(j) + strg3;
			     
			     strg1 = strg + str;
			     
			     strg4 = strg2 + strg3;
			     
			     if(strg1.equals(strg4)) {
			    	 
			    	 for(int k = 0 ; k < strg.length() ; k++) {
			    		 
			    		   count++;
			    	 }
			     
			              break;
			     }
			     
		 }
	
	        return count;
	}
	
	public static void main(String[] args) {
		
		String str = "AACECAAAA";
		
	    int result = minimumCharacters(str);
	    
	    System.out.println(result);
	
	}

}
