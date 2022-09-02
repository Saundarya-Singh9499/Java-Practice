package String;

public class S77_CountAllPalindromicSequenceInAString {

	public static int countSequence(String str) {
		
		 int count = 0;
		 
		 String strg = "";
		 
		 String strg2 = ""; 
		 
		 for(int  i = 0 ; i < str.length() ; i++) {
			 
			 strg = "";
		
			for(int j = i ; j < str.length() ; j++) {
				
				 strg2 = "";
				 
				 strg = strg + str.charAt(j);
				 
				 for(int k = strg.length() - 1 ; k >= 0 ; k--) {
					 
					 strg2 = strg2 + strg.charAt(k);  
					 
				 }
				 
				 if(strg.equals(strg2)) {
					   
					   count++;
				   }
				 
				   
		 }
		 
		 
		  }
		 
		     return count;
	}
	
	public static void main(String[] args) {
		
	    String str = "bccb";
	    
	    int result = countSequence(str);
	    
	    System.out.println(result);

	}

}
